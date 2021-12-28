package cz.kiv.sar.structure.dbd;

public class SegmentParameter {
    String key;
    String value;

    public SegmentParameter(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public SegmentParameter() {
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
