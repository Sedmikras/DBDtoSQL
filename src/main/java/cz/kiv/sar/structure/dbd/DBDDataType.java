package cz.kiv.sar.structure.dbd;

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

    public static Type getTypeByString(String s) {
        return Type.valueOf(s.toUpperCase());
    }
}
