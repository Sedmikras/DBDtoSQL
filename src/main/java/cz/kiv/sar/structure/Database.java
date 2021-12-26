package cz.kiv.sar.structure;

public class Database {
    //utils
    private String Scheme;
    //params
    private String Name;
    //utils
    private String Collation;
    //utils
    private String CharacterSet;

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
}
