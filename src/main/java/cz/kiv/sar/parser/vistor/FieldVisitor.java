package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.model.FieldParserModel;
import cz.kiv.sar.structure.dbd.Field;
import cz.kiv.sar.structure.dbd.Params;

import static cz.kiv.sar.parser.utils.ParserModelUtils.setModelProperties;
import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class FieldVisitor extends DBDParserBaseVisitor<Field> {
    @Override
    public Field visitField(DBDParser.FieldContext ctx) {
        return parseField(parseParams(ctx.params()));
    }

    private Field parseField(Params params) {
        FieldParserModel model = new FieldParserModel();
        setModelProperties(model, params);
        return model.getField();
    }
}
