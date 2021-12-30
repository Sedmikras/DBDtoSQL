package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.model.DBDParserModel;
import cz.kiv.sar.structure.dbd.DBD;
import cz.kiv.sar.structure.dbd.Params;

import static cz.kiv.sar.parser.utils.ParserModelUtils.setModelProperties;
import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class DBDVisitor extends DBDParserBaseVisitor<DBD> {

    @Override
    public DBD visitDbd(DBDParser.DbdContext ctx) {
        DBDParser.ParamsContext paramsContext = ctx.params();
        Params params = parseParams(paramsContext);

        return parseDBD(params);
    }

    private DBD parseDBD(Params params) {
        DBDParserModel model = new DBDParserModel();
        setModelProperties(model, params);
        return model.getDbd();
    }
}
