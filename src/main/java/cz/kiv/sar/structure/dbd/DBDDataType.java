package cz.kiv.sar.structure.dbd;

import java.util.ArrayList;
import java.util.List;

public class DBDDataType {
    private Type type;
    private int length;
    private int precision;
    private int scale;

    public Type getType() {
        return type;
    }

    public DBDDataType setType(Type type) {
        this.type = type;
        return this;
    }

    public int getLength() {
        return length;
    }

    public DBDDataType setLength(int length) {
        this.length = length;
        return this;
    }

    public int getPrecision() {
        return precision;
    }

    public DBDDataType setPrecision(int precision) {
        this.precision = precision;
        return this;
    }

    public int getScale() {
        return scale;
    }

    public DBDDataType setScale(int scale) {
        this.scale = scale;
        return this;
    }

    public static DBDDataType dbdDataType(Type type) {
        return new DBDDataType().setType(type);
    }

    public enum Type {
        ARRAY,
        BINARY,
        BIT,
        BYTE,
        UBYTE,
        CHAR,
        DATE,
        DECIMAL,
        DOUBLE,
        FLOAT,
        INT,
        UINT,
        LONG,
        ULONG,
        SHORT,
        USHORT,
        STRUCT,
        TIME,
        TIMESTAMP,
        XML
    }

    public static DBDDataType getTypeByString(ArrayList<ParamAttr> paramAttrList) {
        ParamAttr attributes = paramAttrList.get(0);
        String dataType = attributes.getValue();
        int length, precision, scale;
        DBDDataType type = getTypeByString(dataType);

        length = Integer.parseInt(attributes.getAttrs().get(0).getValue());
        assert type != null;
        type.setLength(length);
        if(attributes.getAttrs().size() > 1) {
            precision = Integer.parseInt(attributes.getAttrs().get(1).getValue());
            type.setPrecision(precision);
        }
        if(attributes.getAttrs().size() > 2) {
            scale = Integer.parseInt(attributes.getAttrs().get(2).getValue());
            type.setScale(scale);
        }
        return type;
    }

    public static DBDDataType getTypeByString(String s) {
        DBDDataType dataType = new DBDDataType();
        for(Type t : Type.values()) {
            if(t.name().equalsIgnoreCase(s)) {
                dataType.type = t;
                return dataType;
            }
        }
        return null;
    }
}
