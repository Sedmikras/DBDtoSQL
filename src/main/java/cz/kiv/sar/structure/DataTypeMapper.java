package cz.kiv.sar.structure;

import cz.kiv.sar.structure.dbd.DBDDataType;
import org.jooq.DataType;
import org.jooq.impl.SQLDataType;

/**
 * Created by Martin Forejt on 28.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class DataTypeMapper {

    public static DataType<?> dbdToSqlDataType(DBDDataType dbdDataType) {
        DataType<?> sqlDataType;

        switch (dbdDataType.getType()) {
            case BINARY:
            case STRUCT:
                sqlDataType = SQLDataType.BINARY;
                break;
            case BIT:
                sqlDataType = SQLDataType.BIT;
                break;
            case CHAR:
                sqlDataType = SQLDataType.CHAR;
                break;
            case DATE:
                sqlDataType = SQLDataType.DATE;
                break;
            case DECIMAL:
                sqlDataType = SQLDataType.DECIMAL;
                break;
            case DOUBLE:
                sqlDataType = SQLDataType.DOUBLE;
                break;
            case FLOAT:
                sqlDataType = SQLDataType.FLOAT;
                break;
            case INT:
            case UINT:
                sqlDataType = SQLDataType.INTEGER;
                break;
            case LONG:
            case ULONG:
                sqlDataType = SQLDataType.BIGINT;
                break;
            case BYTE:
            case UBYTE:
            case SHORT:
            case USHORT:
                sqlDataType = SQLDataType.SMALLINT;
                break;
            case TIME:
                sqlDataType = SQLDataType.TIME;
                break;
            case TIMESTAMP:
                sqlDataType = SQLDataType.TIMESTAMP;
                break;
            case XML:
                sqlDataType = SQLDataType.XML;
                break;
            default:
                throw new IllegalArgumentException("DBD dataType " + dbdDataType + " not supported.");
        }

        sqlDataType = sqlDataType.length(dbdDataType.getLength());
        sqlDataType = sqlDataType.precision(dbdDataType.getPrecision(), dbdDataType.getScale());

        return sqlDataType;
    }

}
