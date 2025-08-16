package lojaagricola.MetodoListaProdutos;

public class NoVendas {

    String txt;
    NoVendas proximo;

    public NoVendas(String txt) {
        this.txt = txt;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return "-> " + txt;
    }


}

