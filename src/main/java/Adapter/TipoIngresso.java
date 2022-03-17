package Adapter;

public class TipoIngresso implements IIngresso{
    private String tipoIngresso;

    @Override
    public String getIngresso() {
        return this.tipoIngresso;
    }

    @Override
    public void setIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}
