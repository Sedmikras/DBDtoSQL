package cz.kiv.sar.structure.sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static cz.kiv.sar.utils.GenUtils.*;

/**
 * Sql table
 */
public class Table {
    Database database;

    /**
     * Table name
     */
    private String name;
    private String schema = DEFAULT_SCHEMA;
    /**
     * List of table columns
     */
    private List<Column> columns = new ArrayList<>();
    private String collation;
    private String characterSet;

    public Table(Database d) {
        this.database = d;
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
        return collation;
    }

    public Table setCollation(String collation) {
        this.collation = collation;
        return this;
    }

    public String getCharacterSet() {
        return characterSet;
    }

    public Table setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }

    public Table setParent(String parentName) {
        if (parentName == null) return this;

        for (Table t : this.database.getTables()) {
            if (t.getName().equalsIgnoreCase(parentName)) {
                for (Column c : t.getColumns()) {
                    if (c.getClass() == IdentifierColumn.class) {
                        this.columns.add(new ForeignKeyColumn(t, c));
                    }
                }
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return Objects.equals(database.getName(), table.database.getName()) && Objects.equals(name, table.name) && Objects.equals(schema, table.schema) && Objects.equals(columns, table.columns) && Objects.equals(collation, table.collation) && Objects.equals(characterSet, table.characterSet);
    }
}
