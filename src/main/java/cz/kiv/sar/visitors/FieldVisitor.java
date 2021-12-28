package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.dbd.Field;

import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class FieldVisitor extends DBDParserBaseVisitor<Field> {
    @Override
    public Field visitField(DBDParser.FieldContext ctx) {
        Field f = new Field();
        f.setParams(parseParams(ctx.params()));
        return f;
    }
}
