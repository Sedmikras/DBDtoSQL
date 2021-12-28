package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.ControlCharacters;
import cz.kiv.sar.structure.dbd.DBDParameter;
import cz.kiv.sar.structure.sql.Database;
import java.util.List;
import java.util.ArrayList;

import cz.kiv.sar.utils.GenUtils;
import org.antlr.v4.runtime.tree.ParseTree;

public class DBDVisitor extends DBDParserBaseVisitor<Database> {

    @Override
    public Database visitDbd(DBDParser.DbdContext ctx) {
        Database d = new Database();
        //parse params;
        DBDParser.Dbd_paramsContext params = ctx.dbd_params();
        List<DBDParameter> parameters = new ArrayList<>();
        parseParameters(params, parameters);
        SetDatabaseParameters(parameters, d);
        return d;
    }

    void parseParameters(DBDParser.Dbd_paramsContext context, List<DBDParameter> parameters) {
        for(ParseTree t : context.children) {
            if (t.getClass() == DBDParser.Dbd_paramContext.class) {
                parameters.add(parseParameter((DBDParser.Dbd_paramContext) t));
            } else if (t.getClass() == DBDParser.Dbd_paramsContext.class) {
                parseParameters((DBDParser.Dbd_paramsContext) t, parameters);
            }
        }
    }

    DBDParameter parseParameter(DBDParser.Dbd_paramContext ctx) {
        String key = ctx.start.getText();
        if(ControlCharacters.isEnabled(key)) {
            return new DBDParameter(ctx.start.getText(), ctx.stop.getText());
        } else {
            return null;
        }
    }

    void SetDatabaseParameters(List<DBDParameter> parameters, Database d) {
        for(DBDParameter parameter : parameters) {
            if(parameter == null || parameter.getKey().isEmpty()) {
                continue;
            }
            if (parameter.getKey().equalsIgnoreCase("name")) {
                d.setName(parameter.getValue());
            }
        }
        d.setScheme(GenUtils.DEFAULT_SCHEME);
        d.setCollation(GenUtils.DEFAULT_COLLATION);
        d.setCharacterSet(GenUtils.DEFAULT_CHARACTER_SET);
    }
}
