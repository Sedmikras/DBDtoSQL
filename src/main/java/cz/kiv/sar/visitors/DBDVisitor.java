package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import cz.kiv.sar.structure.sql.Database;
import cz.kiv.sar.utils.GenUtils;
import edu.emory.mathcs.backport.java.util.Arrays;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.List;
import java.util.Locale;

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
        BeanWrapper bw = new BeanWrapperImpl(d);
        for(PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param.getSingleValue());
            }
        }
        setDefaultProperties(d);
    }

    private void setDefaultProperties(Database d) {
        d.setCollation(GenUtils.DEFAULT_COLLATION);
        d.setCharacterSet(GenUtils.DEFAULT_CHARACTER_SET);
    }
}
