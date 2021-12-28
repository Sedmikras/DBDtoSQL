package cz.kiv.sar.structure.dbd;

import java.util.ArrayList;

/**
 * Created by Martin Forejt on 29.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class Params extends ArrayList<Param> {

    public Param getParam(String name) {
        return this.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public boolean hasParam(String name) {
        return getParam(name) != null;
    }

}
