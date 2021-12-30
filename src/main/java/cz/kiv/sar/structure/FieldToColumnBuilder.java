package cz.kiv.sar.structure;

import cz.kiv.sar.structure.dbd.DBDDataType;
import cz.kiv.sar.structure.dbd.Field;
import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import cz.kiv.sar.structure.sql.Column;
import cz.kiv.sar.structure.sql.IdentifierColumn;
import org.jooq.DataType;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;

import static cz.kiv.sar.structure.DataTypeMapper.dbdToSqlDataType;
import static cz.kiv.sar.structure.dbd.DBDDataType.dbdDataType;

public class FieldToColumnBuilder {
    private static final FieldToColumnBuilder instance = new FieldToColumnBuilder();
    //private Param parent;
    private DBDDataType.Type type;
    private DBDDataType.Type dataType;
    private String name;
    private int bytes;
    private boolean unique;
    private boolean isSeq;

    public static FieldToColumnBuilder getInstance() {
        return instance;
    }


    public Column toColumn(Field field) {
        instance.dataType = null;
        instance.name = null;
        instance.bytes = 0;
        instance.unique = false;
        instance.isSeq = false;
        BeanWrapper bw = new BeanWrapperImpl(FieldToColumnBuilder.class);
        Params params = field.getParams();
        for(PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            if(params.getParam(descriptor.getName()) != null) {
                bw.setPropertyValue(descriptor.getName(), params.getParam(descriptor.getName()));
            }
        }
        if(instance.isSeq && instance.unique && instance.name.equals("ID")) {
            return new IdentifierColumn(instance.name, createDataType());
        }
        return new Column(instance.name, createDataType(), instance.unique);
    }

    public void setName(Param name) {
        if (name.getAttrs() != null && name.getAttrs().size() > 1) {
            instance.name = name.getAttrs().get(0).getValue();
            instance.isSeq = name.getAttrs().get(1).getValue().equals("SEQ");
            instance.unique = name.getAttrs().get(2).getValue().equals("U");
        } else {
            instance.name = name.getSingleValue();
        }
    }

    public void setType(Param type) {
        if (type.getAttrs().get(0).getValue().equals("C")) {
            instance.dataType = DBDDataType.Type.CHAR;
        } else {
            instance.dataType = DBDDataType.Type.BINARY;
        }
    }

    public void setBytes(Param bytes) {
        instance.bytes = Integer.parseInt(bytes.getSingleValue());
    }

    /*public void setParent(Param parent) {
        this.parent = parent;
    }*/

    public void setDataType(Param dataType) {
        instance.dataType = DBDDataType.getTypeByString(dataType.getSingleValue());
    }

    private DataType<?> createDataType() {
        return dbdToSqlDataType(dbdDataType(dataType).setLength(bytes));
    }
}
