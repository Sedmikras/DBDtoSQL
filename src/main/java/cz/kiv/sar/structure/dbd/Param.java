package cz.kiv.sar.structure.dbd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Forejt on 28.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class Param {
    private String name;
    private List<ParamAttr> attrs;

    public Param() { }

    public Param(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Param setName(String name) {
        this.name = name;
        return this;
    }

    public List<ParamAttr> getAttrs() {
        return attrs;
    }

    boolean isSingleValue() {
        return attrs.size() == 1 && attrs.get(0).getValue() != null;
    }

    public String getSingleValue() {
        return attrs.get(0).getValue();
    }

    public Param setAttrs(List<ParamAttr> attrs) {
        this.attrs = attrs;
        return this;
    }

    public Param addAttr(ParamAttr attr) {
        if (attrs == null) {
            attrs = new ArrayList<>();
        }
        attrs.add(attr);
        return this;
    }
}
