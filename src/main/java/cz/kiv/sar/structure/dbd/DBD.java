package cz.kiv.sar.structure.dbd;

/**
 * Created by Martin Forejt on 30.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class DBD {
    private String name;
    private String accessMethod;
    private String osAccessMethod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccessMethod() {
        return accessMethod;
    }

    public void setAccessMethod(String accessMethod) {
        this.accessMethod = accessMethod;
    }

    public String getOsAccessMethod() {
        return osAccessMethod;
    }

    public void setOsAccessMethod(String osAccessMethod) {
        this.osAccessMethod = osAccessMethod;
    }
}
