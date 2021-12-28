package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.ControlCharacters;
import cz.kiv.sar.structure.dbd.DataSet;
import cz.kiv.sar.structure.dbd.DatasetParam;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class DatasetVisitor extends DBDParserBaseVisitor<DataSet> {

    @Override
    public DataSet visitDataset(DBDParser.DatasetContext ctx) {
        DataSet dataset = new DataSet();
        List<DatasetParam> parameters = new ArrayList<>();
        if (ctx.dataset_with_label() != null)
            parseParameters(ctx.dataset_with_label().dataset_params(), parameters);
        if(ctx.dataset_without_label() != null)
            parseParameters(ctx.dataset_without_label().dataset_params(), parameters);
        return dataset;
    }

    void parseParameters(DBDParser.Dataset_paramsContext context, List<DatasetParam> parameters) {
        for(ParseTree t : context.children) {
            if (t.getClass() == DBDParser.Dataset_paramContext.class) {
                parameters.add(parseParameter((DBDParser.Dataset_paramContext) t));
            } else if (t.getClass() == DBDParser.Dataset_paramsContext.class) {
                parseParameters((DBDParser.Dataset_paramsContext) t, parameters);
            }
        }
    }

    DatasetParam parseParameter(DBDParser.Dataset_paramContext context) {
        String key = context.start.getText();
        if(ControlCharacters.isEnabled(key)) {
            return new DatasetParam(context.start.getText(), context.stop.getText());
        } else {
            return null;
        }
    }
}
