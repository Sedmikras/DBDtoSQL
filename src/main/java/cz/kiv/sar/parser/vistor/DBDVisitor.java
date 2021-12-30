package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.model.DBDParserModel;
import cz.kiv.sar.structure.dbd.DBD;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.Locale;

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
        BeanWrapper bw = new BeanWrapperImpl(model);
        for (PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param);
            }
        }
        return model.getDbd();
    }
}
