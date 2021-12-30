package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.exceptions.ParserException;
import cz.kiv.sar.structure.dbd.DBD;
import cz.kiv.sar.structure.dbd.DataSet;
import cz.kiv.sar.structure.dbd.Field;
import cz.kiv.sar.structure.dbd.Segment;
import cz.kiv.sar.structure.sql.Column;
import cz.kiv.sar.structure.sql.Database;
import cz.kiv.sar.structure.sql.IdentifierColumn;
import cz.kiv.sar.structure.sql.Table;
import cz.kiv.sar.utils.GenUtils;

import java.util.ArrayList;
import java.util.List;

import static cz.kiv.sar.structure.DataTypeMapper.dbdToSqlDataType;
import static cz.kiv.sar.utils.GenUtils.SUPPORTED_DBD_ACCESS;

public class SourceVisitor extends DBDParserBaseVisitor<Database> {

    private Database db;

    @Override
    public Database visitSource(DBDParser.SourceContext ctx) {
        db = new Database();

        DBDVisitor dbdVisitor = new DBDVisitor();
        DBD dbd = dbdVisitor.visitDbd(ctx.dbd());
        setDatabaseProperties(db, dbd);

        if (!dbd.getAccessMethod().equalsIgnoreCase(SUPPORTED_DBD_ACCESS)) {
            throw new ParserException("Invalid dbd access. " + SUPPORTED_DBD_ACCESS + " is only supported");
        }

        DatasetVisitor datasetVisitor = new DatasetVisitor();
        DataSet dataSet = datasetVisitor.visitDataset(ctx.dataset());

        SegmentVisitor segmentVisitor = new SegmentVisitor();
        List<Segment> segments = new ArrayList<>();
        for (DBDParser.SegmentContext segmentContext : ctx.segment()) {
            segments.add(segmentVisitor.visitSegment(segmentContext));
        }

        prepareSQLStructure(segments);
        return db;
    }

    private void setDatabaseProperties(Database database, DBD dbd) {
        database.setName(dbd.getName());
        database.setCollation(GenUtils.DEFAULT_COLLATION);
        database.setCharacterSet(GenUtils.DEFAULT_CHARACTER_SET);
    }

    private void prepareSQLStructure(List<Segment> segments) {
        for (Segment segment : segments) {
            db.addTable(segmentToTable(segment));
        }
    }

    private Table segmentToTable(Segment segment) {
        Table table = new Table(db)
                .setName(segment.getName())
                .setParent(segment.getParent())
                .setCharacterSet(segment.getEncoding());

        for (Field field : segment.getFields()) {
            table.addColumn(fieldToColumn(field));
        }
        return table;
    }

    private Column fieldToColumn(Field field) {
        Column column = new Column()
                .setName(field.getName())
                .setDataType(dbdToSqlDataType(field.getDataType()))
                .setUnique(field.isUnique());

        if (field.isUnique() && field.isSeq()) {
            return new IdentifierColumn(column);
        }
        return column;
    }
}
