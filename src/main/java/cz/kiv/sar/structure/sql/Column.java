package cz.kiv.sar.structure.sql;

import org.jooq.DataType;

/**
 * Sql column
 */
public class Column {
    private String name;
    private DataType<?> type;
    private boolean unique;

    public Column() {}

    public Column(String name, DataType<?> type, boolean unique) {
        this.name = name;
        this.type = type;
        this.unique = unique;
    }

    public String getName() {
        return name;
    }

    public Column setName(String name) {
        this.name = name;
        return this;
    }

    public DataType<?> getType() {
        return type;
    }

    public Column setType(DataType<?> type) {
        this.type = type;
        return this;
    }

    public boolean isUnique() {
        return unique;
    }

    public Column setUnique(boolean unique) {
        this.unique = unique;
        return this;
    }
}
