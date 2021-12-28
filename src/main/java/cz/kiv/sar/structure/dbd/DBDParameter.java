package cz.kiv.sar.structure.dbd;

public class DBDParameter {
    String key;
    String value;

    public DBDParameter(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public DBDParameter() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
