package cz.kiv.sar.structure.dbd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Forejt on 28.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class ParamAttr {
    private String value;
    private List<ParamAttr> attrs;

    public ParamAttr() {}

    public ParamAttr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public ParamAttr setValue(String value) {
        this.value = value;
        return this;
    }

    public List<ParamAttr> getAttrs() {
        return attrs;
    }

    public ParamAttr setAttrs(List<ParamAttr> attrs) {
        this.attrs = attrs;
        return this;
    }

    public ParamAttr addAttr(ParamAttr attr) {
        if (attrs == null) {
            attrs = new ArrayList<>();
        }
        attrs.add(attr);
        return this;
    }
}
