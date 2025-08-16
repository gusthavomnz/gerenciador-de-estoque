package lojaagricola.MetodoListaProdutos;

public class ListaVendas {


    private NoVendas inicio; // Início da lista

    public ListaVendas() {
        this.inicio = null;
    }

    public void adicionar(String txt) {
        NoVendas novo = new NoVendas(txt);
        if (inicio == null) {
            inicio = novo;
        } else {
            NoVendas atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }


    public NoVendas getInicio() {
        return inicio;
    }

    public String exibirListaVendas() {
        if (inicio == null) return "Lista vazia!";
        StringBuilder textoVendas = new StringBuilder();
        NoVendas atual = inicio;
        while (atual != null) {
            textoVendas.append(atual.toString()).append("\n");
            atual = atual.proximo;
        }
        return textoVendas.toString();
    }


}


