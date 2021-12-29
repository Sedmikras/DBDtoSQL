package cz.kiv.sar.structure.dbd;

import cz.kiv.sar.structure.sql.Column;
import cz.kiv.sar.structure.sql.IdentifierColumn;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.Locale;

public class Field {
    Params params;

    public Field() {
        this.params = new Params();
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public Column toSQLStructure() {
        Column c = new Column();
        BeanWrapper bw = new BeanWrapperImpl(c);
        for(PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            if(attributeName.equals("name") && params.getParam("dataType") == null) {
                Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
                if (param != null) {
                    bw.setPropertyValue(descriptor.getName(), param.getAttrs());
                }
                c.setDataTypeByString(params.getParam("Type").getSingleValue(), Integer.parseInt(params.getParam("Bytes").getSingleValue()));
            }
            Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param.getAttrs());
            }
        }
        if(c.isUnique() && c.getName().equalsIgnoreCase("ID")) {
            return new IdentifierColumn(c);
        }
        return c;
    }
}
