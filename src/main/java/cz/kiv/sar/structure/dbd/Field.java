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

}
