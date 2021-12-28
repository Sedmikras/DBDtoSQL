package cz.kiv.sar.structure.sql;

import org.jooq.DataType;

public class ForeignKeyColumn extends Column {
    private Table referencedTable;
    private Column referencedColumn;

    public ForeignKeyColumn(Table referencedTable, Column referencedColumn) {
        super("FK_" + referencedTable.getName() + "_" + referencedColumn.getName(), referencedColumn.getType(), true);
        this.referencedTable = referencedTable;
        this.referencedColumn = referencedColumn;
    }

    /**
     * Do not use
     * @deprecated
     * @param name column name
     * @param type column type
     * @param unique unique
     */
    public ForeignKeyColumn(String name, DataType<?> type, boolean unique) {
        super(name, type, unique);
    }

    public Table getReferencedTable() {
        return referencedTable;
    }

    public void setReferencedTable(Table referencedTable) {
        this.referencedTable = referencedTable;
    }

    public Column getReferencedColumn() {
        return referencedColumn;
    }

    public void setReferencedColumn(Column referencedColumn) {
        this.referencedColumn = referencedColumn;
    }
}
