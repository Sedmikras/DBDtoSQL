package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.DataSet;
import cz.kiv.sar.structure.Database;
import cz.kiv.sar.structure.Segment;

import java.util.List;
import java.util.ArrayList;

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
        return d;
    }
}
