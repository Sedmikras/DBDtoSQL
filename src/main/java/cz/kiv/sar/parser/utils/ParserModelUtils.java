package cz.kiv.sar.parser.utils;

import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.Params;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.Locale;

/**
 * Created by Martin Forejt on 30.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class ParserModelUtils {

    public static void setModelProperties(Object model, Params params) {
        BeanWrapper bw = new BeanWrapperImpl(model);
        for (PropertyDescriptor descriptor : bw.getPropertyDescriptors()) {
            String attributeName = descriptor.getName();
            Param param = params.getParam(attributeName.toUpperCase(Locale.ROOT));
            if (param != null) {
                bw.setPropertyValue(descriptor.getName(), param);
            }
        }
    }

}
