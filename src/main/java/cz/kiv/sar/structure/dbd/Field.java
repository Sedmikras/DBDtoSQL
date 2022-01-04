package cz.kiv.sar.structure.dbd;

public class Field {
    private String name;
    private boolean seq;
    private boolean unique;
    private int bytes;
    private int start;
    private DBDDataType dataType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSeq() {
        return seq;
    }

    public void setSeq(boolean seq) {
        this.seq = seq;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public DBDDataType getDataType() {
        return dataType;
    }

    public void setDataType(DBDDataType dataType) {
        this.dataType = dataType;
    }

}
