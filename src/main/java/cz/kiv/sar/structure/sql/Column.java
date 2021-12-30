package cz.kiv.sar.structure.sql;

import cz.kiv.sar.structure.dbd.DBDDataType;
import cz.kiv.sar.structure.dbd.ParamAttr;
import org.jooq.DataType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static cz.kiv.sar.structure.DataTypeMapper.dbdToSqlDataType;
import static cz.kiv.sar.structure.dbd.DBDDataType.dbdDataType;

/**
 * Sql column
 */
public class Column {
    protected String name;
    protected DataType<?> dataType;
    protected boolean unique;

    public Column() {}

    public Column(String name, DataType<?> type, boolean unique) {
        this.name = name;
        this.dataType = type;
        this.unique = unique;
    }

    public String getName() {
        return name;
    }

    public Column setName(String name) {
        this.name = name;
        return this;
    }

    public DataType<?> getDataType() {
        return dataType;
    }

    public Column setDataType(DataType<?> dataType) {
        this.dataType = dataType;
        return this;
    }

    public boolean isUnique() {
        return unique;
    }

    public Column setUnique(boolean unique) {
        this.unique = unique;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Column column = (Column) o;
        return unique == column.unique && Objects.equals(name, column.name) && Objects.equals(dataType, column.dataType);
    }
}
