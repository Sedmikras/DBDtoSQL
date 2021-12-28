package cz.kiv.sar.structure;

public class Column {
    private String name;
    private DataType type;
    private boolean unique;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public Column(String name, DataType type, boolean unique) {
        this.name = name;
        this.type = type;
        this.unique = unique;
    }
}
