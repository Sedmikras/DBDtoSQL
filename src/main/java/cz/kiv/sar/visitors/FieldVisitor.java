package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class FieldVisitor extends DBDParserBaseVisitor<Field> {
    @Override
    public Field visitField(DBDParser.FieldContext ctx) {
        Field f = new Field();
        parseParameters(ctx.field_params(), f.getParams());
        return f;
    }

    void parseParameters(DBDParser.Field_paramsContext context, List<FieldParameter> parameters) {
        for(ParseTree t : context.children) {
            if (t.getClass() == DBDParser.Field_paramContext.class) {
                parameters.add(parseParameter((DBDParser.Field_paramContext) t));
            } else if (t.getClass() == DBDParser.Field_paramsContext.class) {
                parseParameters((DBDParser.Field_paramsContext) t, parameters);
            }
        }
    }

    FieldParameter parseParameter(DBDParser.Field_paramContext context) {
        String key = context.start.getText();
        if(ControlCharacters.isEnabled(key)) {
            return new FieldParameter(context.start.getText(), context.stop.getText());
        } else {
            return null;
        }
    }
}
