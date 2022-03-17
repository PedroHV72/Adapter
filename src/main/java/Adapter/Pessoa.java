package Adapter;

public class Pessoa {

    IIngresso iIngresso;
    IngressoAdapter ingressoAdapter;

    public Pessoa() {
        iIngresso = new TipoIngresso();
        ingressoAdapter = new IngressoAdapter(iIngresso);
    }

    public void setIngresso(String tipo) {
        iIngresso.setIngresso(tipo);
        ingressoAdapter.salvarIngresso();
    }

    public String getIngresso() {
        return ingressoAdapter.atribuirIngresso();
    }

    public float getValorIngresso() {
        return ingressoAdapter.getValorIngresso();
    }
}
