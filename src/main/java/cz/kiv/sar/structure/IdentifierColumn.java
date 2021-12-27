package cz.kiv.sar.structure;

public class IdentifierColumn extends Column {

    public IdentifierColumn() {
        super("ID", DataType.INT, true);
    }

    public IdentifierColumn(String name) {
        super(name, DataType.INT, true);
    }

    public IdentifierColumn(String name, DataType type) {
        super(name, type, true);
    }

    /**
     * @deprecated use default constructor instead
     * @param name
     * @param type
     * @param unique
     */
    public IdentifierColumn(String name, DataType type, boolean unique) {
        super(name, type, true);
    }
}
