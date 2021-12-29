package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.dbd.Segment;

import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class SegmentVisitor extends DBDParserBaseVisitor<Segment> {

    @Override
    public Segment visitSegment(DBDParser.SegmentContext ctx) {
        Segment s = new Segment();
        s.setParameters(parseParams(ctx.segment_definition().params()));

        for(DBDParser.FieldContext field : ctx.field()) {
            FieldVisitor fv = new FieldVisitor();
            s.getFields().add(fv.visitField(field));
        }
        return s;
    }
}
