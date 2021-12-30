package cz.kiv.sar.parser.model;

import cz.kiv.sar.structure.dbd.DBD;
import cz.kiv.sar.structure.dbd.Param;

/**
 * Created by Martin Forejt on 30.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class DBDParserModel {
    private final DBD dbd;

    public DBDParserModel() {
        dbd = new DBD();
    }

    public DBD getDbd() {
        return dbd;
    }

    public void setName(Param param) {
        dbd.setName(param.getSingleValue());
    }

    public void setAccess(Param param) {
        dbd.setAccessMethod(param.getAttrs().get(0).getValue());
        dbd.setOsAccessMethod(param.getAttrs().get(1).getValue());
    }
}
