package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.dbd.DBDDataType;
import cz.kiv.sar.structure.dbd.DataSet;
import cz.kiv.sar.structure.dbd.Segment;
import cz.kiv.sar.structure.sql.*;

import java.util.List;
import java.util.ArrayList;

import static cz.kiv.sar.structure.dbd.DBDDataType.dbdDataType;
import static cz.kiv.sar.structure.DataTypeMapper.dbdToSqlDataType;

public class SourceVisitor extends DBDParserBaseVisitor<Database> {
    Database database;

    @Override
    public Database visitSource(DBDParser.SourceContext ctx) {
        DBDVisitor v = new DBDVisitor();
        Database d = v.visitDbd(ctx.dbd());
        DatasetVisitor dv = new DatasetVisitor();
        DataSet ds = dv.visitDataset(ctx.dataset());
        SegmentVisitor sv = new SegmentVisitor();
        List<Segment> segments = new ArrayList<>();
        for (DBDParser.SegmentContext segmentContext : ctx.segment()) {
            segments.add(sv.visitSegment(segmentContext));
        }
        mockTables(d);
        return d;
    }

    private void mockTables(Database d) {
        Table tableOrder = new Table("XXORDER");
        Column ID = new IdentifierColumn();
        Column ORDID = new Column("ORDID", dbdToSqlDataType(dbdDataType(DBDDataType.Type.INT)), false);
        tableOrder
                .addColumn(ID)
                .addColumn(ORDID);
        d.addTable(tableOrder);

        Table tableCust = new Table("XXCUST");
        Column tableCustForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableCustID = new IdentifierColumn();
        Column tableCustName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(24)), false);
        tableCust
                .addColumn(tableCustForeignKey)
                .addColumn(tableCustID)
                .addColumn(tableCustName);
        d.addTable(tableCust);

        Table tableProd = new Table("XXPROD");
        Column tableProdForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableProdID = new IdentifierColumn();
        Column tableProdName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(24)), false);
        Column tableProdPrice = new Column("PRICE", dbdToSqlDataType(dbdDataType(DBDDataType.Type.DECIMAL).setPrecision(10).setScale(2).setLength(6)), false);
        tableProd
                .addColumn(tableProdForeignKey)
                .addColumn(tableProdID)
                .addColumn(tableProdName)
                .addColumn(tableProdPrice);
        d.addTable(tableProd);

        Table tableStore = new Table("XXSTORE");
        Column tableStoreForeignKey = new ForeignKeyColumn(tableOrder, ID);
        Column tableStoreID = new IdentifierColumn();
        Column tableStoreName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(20)), false);
        tableStore
                .addColumn(tableStoreForeignKey)
                .addColumn(tableStoreID)
                .addColumn(tableStoreName);
        d.addTable(tableStore);

        Table tableSales = new Table("XXSALES");
        Column tableSalesForeignKey = new ForeignKeyColumn(tableStore, tableStoreID);
        Column tableSalesID = new IdentifierColumn();
        Column tableSalesName = new Column("NAME", dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(20)), false);
        tableSales
                .addColumn(tableSalesForeignKey)
                .addColumn(tableSalesID)
                .addColumn(tableSalesName);
        d.addTable(tableSales);
    }
}
