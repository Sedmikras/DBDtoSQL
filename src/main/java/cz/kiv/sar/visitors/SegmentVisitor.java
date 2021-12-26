package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDBaseVisitor;
import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.structure.ControlCharacters;
import cz.kiv.sar.structure.Segment;
import cz.kiv.sar.structure.SegmentParameter;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class SegmentVisitor extends DBDBaseVisitor<Segment> {

    @Override
    public Segment visitSegment(DBDParser.SegmentContext ctx) {
        Segment s = new Segment();
        parseParameters(ctx.segment_definition().segment_params(), s.getParameters());
        for(DBDParser.FieldContext field : ctx.field()) {
            FieldVisitor fv = new FieldVisitor();
            s.getFields().add(fv.visitField(field));
        }
        return s;
    }

    void parseParameters(DBDParser.Segment_paramsContext context, List<SegmentParameter> parameters) {
        for(ParseTree t : context.children) {
            if (t.getClass() == DBDParser.Segment_paramContext.class) {
                parameters.add(parseParameter((DBDParser.Segment_paramContext) t));
            } else if (t.getClass() == DBDParser.Segment_paramsContext.class) {
                parseParameters((DBDParser.Segment_paramsContext) t, parameters);
            }
        }
    }

    SegmentParameter parseParameter(DBDParser.Segment_paramContext context) {
        String key = context.start.getText();
        if(ControlCharacters.isEnabled(key)) {
            return new SegmentParameter(context.start.getText(), context.stop.getText());
        } else {
            return null;
        }
    }
}
