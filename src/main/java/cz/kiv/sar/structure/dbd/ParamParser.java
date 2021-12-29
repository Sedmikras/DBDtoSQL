package cz.kiv.sar.structure.dbd;

import cz.kiv.sar.antlr.DBDParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Forejt on 28.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class ParamParser {

    public static Params parseParams(DBDParser.ParamsContext context) {
        Params params = new Params();
        if (context != null) {
            parseParameters(context, params);
        }
        return params;
    }

    public static Param parseParam(DBDParser.ParamContext context) {
        String key = context.param_name().getText();
        DBDParser.ValuesContext value = context.values();

        List<ParamAttr> attrs = new ArrayList<>();
        parseParamAttrs(value, attrs);
        return new Param(key).setAttrs(attrs);
    }

    private static void parseParameters(DBDParser.ParamsContext context, Params parameters) {
        for (ParseTree t : context.children) {
            if (t.getClass() == DBDParser.ParamContext.class) {
                parameters.add(parseParam((DBDParser.ParamContext) t));
            } else if (t.getClass() == DBDParser.ParamsContext.class) {
                parseParameters((DBDParser.ParamsContext) t, parameters);
            }
        }
    }

    private static void parseParamAttrs(DBDParser.ValuesContext context, List<ParamAttr> attrs) {
        for (ParseTree t : context.children) {
            if (t.getClass() == DBDParser.ValueContext.class) {
                parseParamAttr((DBDParser.ValueContext) t, attrs);
            } else if (t.getClass() == DBDParser.ValuesContext.class) {
                parseParamAttrs((DBDParser.ValuesContext) t, attrs);
            }
        }
    }

    private static void parseParamAttr(DBDParser.ValueContext context, List<ParamAttr> attrs) {
        if (context.String() != null) {
            ParamAttr attr = new ParamAttr(context.String().getText());
            if (context.values() != null) {
                List<ParamAttr> subAttrs = new ArrayList<>();
                parseParamAttrs(context.values(), subAttrs);
                attr.setAttrs(subAttrs);
            }
            attrs.add(attr);
        } else if (context.values() != null) {
            parseParamAttrs(context.values(), attrs);
        }
    }

}
