package cz.kiv.sar.structure.dbd;

import java.util.List;
import java.util.ArrayList;

public class Field {
    List<FieldParameter> params;

    public Field() {
        this.params = new ArrayList<>();
    }

    public List<FieldParameter> getParams() {
        return params;
    }

    public void setParams(List<FieldParameter> params) {
        this.params = params;
    }
}
