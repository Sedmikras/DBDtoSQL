package cz.kiv.sar.visitors;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.structure.dbd.DataSet;

import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class DatasetVisitor extends DBDParserBaseVisitor<DataSet> {

    @Override
    public DataSet visitDataset(DBDParser.DatasetContext ctx) {
        DataSet dataset = new DataSet();

        DBDParser.ParamsContext paramsContext = null;
        if (ctx.dataset_with_label() != null) {
            paramsContext = ctx.dataset_with_label().params();
        } else if (ctx.dataset_without_label() != null) {
            paramsContext = ctx.dataset_without_label().params();
        }

        dataset.setParams(parseParams(paramsContext));
        return dataset;
    }
}
