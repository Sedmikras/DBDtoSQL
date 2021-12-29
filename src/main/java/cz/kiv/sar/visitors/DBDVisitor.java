package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import cz.kiv.sar.structure.sql.Database;
import cz.kiv.sar.utils.GenUtils;

import java.util.List;

import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class DBDVisitor extends DBDParserBaseVisitor<Database> {

    @Override
    public Database visitDbd(DBDParser.DbdContext ctx) {
        Database d = new Database();

        DBDParser.ParamsContext paramsContext = ctx.params();
        Params params = parseParams(paramsContext);

        SetDatabaseParameters(params, d);
        return d;
    }

    void SetDatabaseParameters(Params params, Database d) {
        /*for(Param parameter : params) {
            if(parameter == null || parameter.getName().isEmpty()) {
                continue;
            }
            if (parameter.getName().equalsIgnoreCase("NAME")) {
                d.setName(parameter.getSingleValue());
            }
        }*/

        d.setName(params.getParam("NAME").getSingleValue());

        d.setCollation(GenUtils.DEFAULT_COLLATION);
        d.setCharacterSet(GenUtils.DEFAULT_CHARACTER_SET);
    }
}
