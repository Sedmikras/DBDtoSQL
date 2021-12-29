package cz.kiv.sar.structure.sql;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private String Name;
    private String Collation;
    private String CharacterSet;

    private final List<Table> tables = new ArrayList<>();

    public Database() {
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

    public List<Table> getTables() {
        return tables;
    }
}
