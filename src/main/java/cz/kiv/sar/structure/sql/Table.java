package cz.kiv.sar.structure.sql;

import java.util.ArrayList;
import java.util.List;

/**
 * Sql table
 */
public class Table {
    /**
     * Table name
     */
    private String name;
    /**
     * List of table columns
     */
    private List<Column> columns;

    public Table() {
    }

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Table setName(String name) {
        this.name = name;
        return this;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public Table setColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    public Table addColumn(Column column) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(column);
        return this;
    }
}
