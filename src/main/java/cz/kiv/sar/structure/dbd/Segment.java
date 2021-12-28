package cz.kiv.sar.structure.dbd;

import java.util.List;
import java.util.ArrayList;

public class Segment {
    String name;
    String collation;
    String whatever;
    List<Field> fields;
    Params parameters;

    public Segment() {
        this.fields = new ArrayList<>();
        this.parameters = new Params();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public String getWhatever() {
        return whatever;
    }

    public void setWhatever(String whatever) {
        this.whatever = whatever;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public Params getParameters() {
        return parameters;
    }

    public void setParameters(Params parameters) {
        this.parameters = parameters;
    }
}
