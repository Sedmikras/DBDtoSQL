package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.model.DatasetParserModel;
import cz.kiv.sar.structure.dbd.DataSet;
import cz.kiv.sar.structure.dbd.Params;

import static cz.kiv.sar.parser.utils.ParserModelUtils.setModelProperties;
import static cz.kiv.sar.structure.dbd.ParamParser.parseParams;

public class DatasetVisitor extends DBDParserBaseVisitor<DataSet> {

    @Override
    public DataSet visitDataset(DBDParser.DatasetContext ctx) {
        DBDParser.ParamsContext paramsContext = null;
        if (ctx.dataset_with_label() != null) {
            paramsContext = ctx.dataset_with_label().params();
        } else if (ctx.dataset_without_label() != null) {
            paramsContext = ctx.dataset_without_label().params();
        }

        return parseDataset(parseParams(paramsContext));
    }

    private DataSet parseDataset(Params params) {
        DatasetParserModel model = new DatasetParserModel();
        setModelProperties(model, params);
        return model.getDataSet();
    }
}
