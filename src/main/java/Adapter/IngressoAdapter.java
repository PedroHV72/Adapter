package Adapter;

public class IngressoAdapter extends ValorIngresso{

    private IIngresso iIngresso;

    public IngressoAdapter(IIngresso iIngresso) {
        this.iIngresso = iIngresso;
    }

    public String atribuirIngresso() {
        if (this.getValorIngresso() == 20.0f)
            iIngresso.setIngresso("Ingresso Inteira");
        else
            if (this.getValorIngresso() == 10.0f)
                iIngresso.setIngresso("Ingresso Meia");

        return iIngresso.getIngresso();
    }

    public void salvarIngresso() {
        if (iIngresso.getIngresso().equals("Ingresso Inteira"))
            this.setValorIngresso(20.0f);
        else
            if (iIngresso.getIngresso().equals("Ingresso Meia"))
                this.setValorIngresso(10.0f);
    }
}
