package cz.kiv.sar.structure;

public enum ControlCharacters {
    DBD_NAME("NAME", true),
    DBD_ACCES("ACCESS", true),
    DBD_RNAME("RMNAME"),
    DBD_VER("DBVER"),
    DBD_PASSWD("PASSWD"),
    DBD_VERSION("VERSION"),
    DBD_DATEXIT("DATXEXIT"),
    DBD_ENCODING("ENCODING", true),
    DBD_REMARKS("REMARKS"),
    DATASET_DD1("DD1"),
    DATASET_SIZE("SIZE"),
    DATASET_BLOCK("BLOCK"),
    DATASET_DEVICE("DEVICE"),
    DATASET_SCAN("SCAN"),
    DATASET_FRSPC("FRSPC"),
    DATASET_SEARCHA("SEARCHA"),
    DATASET_REMARKS("REMARKS"),
    SEGMENT_NAME("NAME", true),
    SEGMENT_EXTERNAL_NAME("EXTERNAL_NAME"),
    SEGMENT_PARENT("PARENT", true),
    SEGMENT_SOURCE("SOURCE"),
    SEGMENT_BYTES("BYTES"),
    SEGMENT_FREQ("FREQ"),
    SEGMENT_PTR("PTR"),
    SEGMENT_RULES("RULES"),
    SEGMENT_EXIT("EXIT"),
    SEGMENT_COMPRTN("COMPRTN"),
    SEGMENT_ENCODING("ENCODING", true),
    SEGMENT_REMARKS("REMARKS"),
    FIELD_NAME("NAME", true),
    FIELD_EXTERNAL_NAME("EXTERALNAME"),
    FIELD_BYTES("BYTES"),
    FIELD_START("START"),
    FIELD_MAX_BYTES("MAXBYTES"),
    FIELD_START_AFTER("STARTAFTER"),
    FIELD_REL_START("RELSTART"),
    FIELD_DATATYPE("DATATYPE", true),
    FIELD_TYPE("TYPE"),
    FIELD_CASE_NAME("CASENAME"),
    FIELD_DEPENDSON("DEPENDSON"),
    FIELD_MIN_OCCURS("MINOCCURS"),
    FIELD_MAX_OCCURS("MAXOCCURS"),
    FIELD_PARENT("PARENT", true),
    FIELD_REDEFINES("REDEFINES"),
    FIELD_REMARKS("REMARKS");

    private final String name;
    private final boolean enabled;

    ControlCharacters(String string) {
        this.name = string;
        this.enabled = false;
    }

    ControlCharacters(String string, boolean enabled) {
        this.enabled = enabled;
        this.name = string;
    }

    public static boolean isEnabled(String name) {
        for (ControlCharacters c: ControlCharacters.values()) {
            if (c.name.equals(name) && c.enabled) {
                return true;
            }
        }
        return false;
    }

}
