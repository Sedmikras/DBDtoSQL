package cz.kiv.sar.structure.dbd;

import cz.kiv.sar.structure.FieldToColumnBuilder;
import cz.kiv.sar.structure.sql.Database;
import cz.kiv.sar.structure.sql.Table;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

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

    public Table toSQLStructure(Database database) {
        Table t = new Table(database);
        BeanWrapper bw = new BeanWrapperImpl(t);
        for(PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            Param param = parameters.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param.getSingleValue());
            }
        }

        for(Field field : fields) {
            t.addColumn(FieldToColumnBuilder.getInstance().toColumn(field));
        }
        return t;
    }
}
