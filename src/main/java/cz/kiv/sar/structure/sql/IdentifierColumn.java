package cz.kiv.sar.structure.sql;

import org.jooq.DataType;
import org.jooq.impl.SQLDataType;

public class IdentifierColumn extends Column {

    public IdentifierColumn() {
        super("ID", SQLDataType.INTEGER, true);
    }

    public IdentifierColumn(String name) {
        super(name, SQLDataType.INTEGER, true);
    }

    public IdentifierColumn(String name, DataType<?> type) {
        super(name, type, true);
    }

    /**
     * @deprecated use default constructor instead
     * @param name column name
     * @param type column type
     * @param unique unique
     */
    public IdentifierColumn(String name, DataType<?> type, boolean unique) {
        super(name, type, true);
    }
}
