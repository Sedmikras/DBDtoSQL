package cz.kiv.sar.structure.sql;

import java.util.ArrayList;
import java.util.List;

import static cz.kiv.sar.utils.GenUtils.DEFAULT_SCHEMA;

/**
 * Sql table
 */
public class Table {
    /**
     * Table name
     */
    private String name;
    private String schema = DEFAULT_SCHEMA;
    /**
     * List of table columns
     */
    private List<Column> columns;
    private String Collation;
    private String CharacterSet;

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

    public String getSchema() {
        return schema;
    }

    public Table setSchema(String schema) {
        this.schema = schema;
        return this;
    }

    public String getCollation() {
        return Collation;
    }

    public Table setCollation(String collation) {
        Collation = collation;
        return this;
    }

    public String getCharacterSet() {
        return CharacterSet;
    }

    public Table setCharacterSet(String characterSet) {
        CharacterSet = characterSet;
        return this;
    }
}
