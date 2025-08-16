package lojaagricola.MetodoListaProdutos;

import lojaagricola.modelo.Produto;

public class No {
    Produto produto;
    No proximo;

    public No(Produto p) {
        this.produto = p;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return "-> " + produto;
    }

    public String txtEstoque() {
        return produto.getNome() + ", " + produto.getQuantidade();
    }
}