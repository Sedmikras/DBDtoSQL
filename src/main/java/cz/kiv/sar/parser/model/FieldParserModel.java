package cz.kiv.sar.parser.model;

import cz.kiv.sar.structure.dbd.DBDDataType;
import cz.kiv.sar.structure.dbd.Field;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.ParamAttr;

import java.util.List;

import static cz.kiv.sar.structure.dbd.DBDDataType.dbdDataType;

/**
 * Created by Martin Forejt on 30.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class FieldParserModel {
    private final Field field;

    public FieldParserModel() {
        field = new Field();
    }

    public Field getField() {
        return field;
    }

    public void setName(Param param) {
        field.setName(param.getSingleValue());
        if (param.getAttrs().size() > 1) {
            field.setSeq(param.getAttrs().get(1).getValue().equals("SEQ"));
            field.setUnique(param.getAttrs().get(2).getValue().equals("U"));
        }
    }

    public void setBytes(Param param) {
        field.setBytes(Integer.parseInt(param.getSingleValue()));
        if (field.getDataType() != null) {
            field.getDataType().setLength(field.getBytes());
        }
    }

    public void setStart(Param param) {
        field.setStart(Integer.parseInt(param.getSingleValue()));
    }

    public void setDataType(Param param) {
        DBDDataType.Type type = DBDDataType.getTypeByString(param.getSingleValue());
        DBDDataType dataType = dbdDataType(type).setLength(field.getBytes());

        if (param.getAttrs().get(0).getAttrs() != null) {
            List<ParamAttr> attrs = param.getAttrs().get(0).getAttrs();
            if (attrs.size() > 0) dataType.setPrecision(Integer.parseInt(attrs.get(0).getValue()));
            if (attrs.size() > 1) dataType.setScale(Integer.parseInt(attrs.get(1).getValue()));
        }

        field.setDataType(dataType);
    }

    public void setType(Param param) {
        if (field.getDataType() != null) return;

        if (param.getSingleValue().equalsIgnoreCase("C")) {
            field.setDataType(DBDDataType.dbdDataType(DBDDataType.Type.CHAR).setLength(field.getBytes()));
        } else {
            field.setDataType(DBDDataType.dbdDataType(DBDDataType.Type.BINARY).setLength(field.getBytes()));
        }
    }
}
