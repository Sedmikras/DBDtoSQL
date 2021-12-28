package cz.kiv.sar.structure;

public class ForeignKeyColumn extends Column {
    private Table referencedTable;
    private Column referencedColumn;

    public ForeignKeyColumn(Table referencedTable, Column referencedColumn) {
        super("FK_" + referencedTable.name + "_" + referencedColumn.getName(), referencedColumn.getType(), true);
        this.referencedTable = referencedTable;
        this.referencedColumn = referencedColumn;
    }

    /**
     * Do not use
     * @deprecated
     * @param name
     * @param type
     * @param unique
     */
    public ForeignKeyColumn(String name, DataType type, boolean unique) {
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
