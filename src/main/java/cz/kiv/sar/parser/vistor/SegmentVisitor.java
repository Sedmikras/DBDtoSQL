package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.model.SegmentParserModel;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import cz.kiv.sar.structure.dbd.Segment;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.Locale;

import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class SegmentVisitor extends DBDParserBaseVisitor<Segment> {

    @Override
    public Segment visitSegment(DBDParser.SegmentContext ctx) {
        Segment segment = parseSegment(parseParams(ctx.segment_definition().params()));

        for (DBDParser.FieldContext field : ctx.field()) {
            FieldVisitor fv = new FieldVisitor();
            segment.addField(fv.visitField(field));
        }

        return segment;
    }

    private Segment parseSegment(Params params) {
        SegmentParserModel model = new SegmentParserModel();
        BeanWrapper bw = new BeanWrapperImpl(model);
        for (PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param);
            }
        }
        return model.getSegment();
    }
}
