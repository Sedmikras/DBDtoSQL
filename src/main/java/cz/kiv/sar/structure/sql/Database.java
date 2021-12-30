package cz.kiv.sar.structure.sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Database database = (Database) o;
        return Objects.equals(Name, database.Name) && Objects.equals(Collation, database.Collation) && Objects.equals(CharacterSet, database.CharacterSet) && Objects.equals(tables, database.tables);
    }
}
