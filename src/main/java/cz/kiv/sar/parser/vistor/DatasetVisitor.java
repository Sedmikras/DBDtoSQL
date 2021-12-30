package cz.kiv.sar.parser.vistor;

import cz.kiv.sar.antlr.DBDParser;
import cz.kiv.sar.antlr.DBDParserBaseVisitor;
import cz.kiv.sar.parser.model.DatasetParserModel;
import cz.kiv.sar.structure.dbd.DataSet;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.Locale;

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
        BeanWrapper bw = new BeanWrapperImpl(model);
        for (PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param);
            }
        }
        return model.getDataSet();
    }
}
