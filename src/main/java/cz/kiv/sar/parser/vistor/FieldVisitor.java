package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.model.FieldParserModel;
import cz.kiv.sar.structure.dbd.Field;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.Locale;

import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class FieldVisitor extends DBDParserBaseVisitor<Field> {
    @Override
    public Field visitField(DBDParser.FieldContext ctx) {
        return parseField(parseParams(ctx.params()));
    }

    private Field parseField(Params params) {
        FieldParserModel model = new FieldParserModel();
        BeanWrapper bw = new BeanWrapperImpl(model);
        for (PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param);
            }
        }
        return model.getField();
    }
}
