package cz.kiv.sar.parser.model;

import cz.kiv.sar.structure.dbd.Param;
import cz.kiv.sar.structure.dbd.ParamAttr;
import cz.kiv.sar.structure.dbd.Segment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Forejt on 30.12.2021.
 * me@martinforejt.cz
 *
 * @author Martin Forejt
 */
public class SegmentParserModel {
    private final Segment segment;

    public SegmentParserModel() {
        segment = new Segment();
    }

    public Segment getSegment() {
        return segment;
    }

    public void setName(Param param) {
        segment.setName(param.getSingleValue());
    }

    public void setParent(Param param) {
        segment.setParent(param.getSingleValue());
    }

    public void setBytes(Param param) {
        segment.setBytes(Integer.parseInt(param.getSingleValue()));
    }

    public void setEncoding(Param param) {
        segment.setEncoding(param.getSingleValue());
    }

    public void setPointer(Param param) {
        List<String> pointer = new ArrayList<>();
        for (ParamAttr attr : param.getAttrs()) {
            pointer.add(attr.getValue());
        }
        segment.setPointer(pointer);
    }

    public void setPtr(Param param) {
        setPointer(param);
    }
}
