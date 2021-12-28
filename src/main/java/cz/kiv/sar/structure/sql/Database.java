package cz.kiv.sar.structure.sql;

import java.util.ArrayList;
import java.util.List;

public class Database {
    //utils
    private String Scheme;
    //params
    private String Name;
    //utils
    private String Collation;
    //utils
    private String CharacterSet;

    List<Table> tables;

    public Database() {
        this.tables = new ArrayList<>();
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String scheme) {
        Scheme = scheme;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCollation() {
        return Collation;
    }

    public void setCollation(String collation) {
        Collation = collation;
    }

    public String getCharacterSet() {
        return CharacterSet;
    }

    public void setCharacterSet(String characterSet) {
        CharacterSet = characterSet;
    }

    public void addTable(Table t) {
        tables.add(t);
    }
}
