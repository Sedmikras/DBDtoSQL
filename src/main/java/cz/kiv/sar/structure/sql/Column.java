package cz.kiv.sar.structure.sql;

import cz.kiv.sar.structure.dbd.DBDDataType;
import cz.kiv.sar.structure.dbd.ParamAttr;
import org.jooq.DataType;

import java.util.ArrayList;
import java.util.List;

import static cz.kiv.sar.structure.DataTypeMapper.dbdToSqlDataType;
import static cz.kiv.sar.structure.dbd.DBDDataType.dbdDataType;

/**
 * Sql column
 */
public class Column {
    protected String name;
    protected DataType<?> dataType;
    protected boolean unique;

    public Column() {}

    public Column(String name, DataType<?> type, boolean unique) {
        this.name = name;
        this.dataType = type;
        this.unique = unique;
    }

    public String getName() {
        return name;
    }

    public Column setName(List<ParamAttr> attrList) {
        if(attrList.size() > 2)
            this.unique = attrList.get(2).getValue().equals("U");
        this.name = attrList.get(0).getValue();
        return this;
    }

    public DataType<?> getDataType() {
        return dataType;
    }

    public Column setDataType(ArrayList<ParamAttr> attrList) {
        DBDDataType dbdDataType;
        ParamAttr atr = attrList.get(0);
        if(atr.getAttrs() != null && atr.getAttrs().size() > 1) {
            dbdDataType = DBDDataType.getTypeByString(attrList);
        } else {
            dbdDataType = DBDDataType.getTypeByString(atr.getValue());
        }
        assert dbdDataType != null;
        this.dataType = dbdToSqlDataType(dbdDataType);
        return this;
    }

    public void setDataTypeByString(String s, int bytes) {
        if(s.equals("C")) {
            this.dataType = dbdToSqlDataType(dbdDataType(DBDDataType.Type.CHAR).setLength(bytes));
        } else {
            this.dataType = dbdToSqlDataType(dbdDataType(DBDDataType.Type.BINARY).setLength(bytes));
        }
    }

    public boolean isUnique() {
        return unique;
    }

    public Column setUnique(boolean unique) {
        this.unique = unique;
        return this;
    }
}
