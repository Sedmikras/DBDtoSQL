package cz.kiv.sar.structure.dbd;

public class Field {
    Params params;

    public Field() {
        this.params = new Params();
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
}
