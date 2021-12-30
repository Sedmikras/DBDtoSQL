package cz.kiv.sar.parser.model;

import cz.kiv.sar.structure.dbd.DataSet;
import cz.kiv.sar.structure.dbd.Param;

/**
 * Created by Martin Forejt on 30.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class DatasetParserModel {
    private final DataSet dataSet;

    public DatasetParserModel() {
        dataSet = new DataSet();
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDd1(Param param) {
        dataSet.setDd1(param.getSingleValue());
    }

    public void setSize(Param param) {
        dataSet.setSize(Integer.parseInt(param.getSingleValue()));
    }
}
