package lojaagricola.MetodoListaProdutos;

import lojaagricola.modelo.Produto;

public class ListaEncadeada {
    private No inicio; // Início da lista

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void adicionar(Produto produto) {
        No novo = new No(produto);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public String exibirLista() {
        if (inicio == null) return "Lista vazia!";
        StringBuilder textoProdutos = new StringBuilder();
        No atual = inicio;
        while (atual != null) {
            textoProdutos.append(atual).append("\n");
            atual = atual.proximo;
        }
        return textoProdutos.toString();
    }


    public String exibirEstoque() {
        if (inicio == null) return "Lista vazia!";
        StringBuilder textoEstoque = new StringBuilder();
        No atual = inicio;
        while (atual != null) {
            textoEstoque.append(atual.txtEstoque()).append("\n");
            atual = atual.proximo;
        }
        return textoEstoque.toString();
    }

    public No getInicio() {
        return inicio;
    }

    // ---------- MERGESORT
    public void ordenarPorNome() {
        inicio = mergeSort(inicio);
    }

    private No mergeSort(No head) {
        // Caso base: 0 ou 1 elemento
        if (head == null || head.proximo == null) {
            return head;
        }

        // Encontrar o meio
        No meio = getMeio(head);
        No metadeDireita = meio.proximo;
        meio.proximo = null; // Quebra a lista

        // Recursão para cada metade
        No esquerda = mergeSort(head);
        No direita = mergeSort(metadeDireita);

        // Mescla as duas metades
        return merge(esquerda, direita);
    }

    private No getMeio(No head) {
        if (head == null) return head;

        No lento = head;
        No rapido = head.proximo;

        while (rapido != null && rapido.proximo != null) {
            lento = lento.proximo;           // avança 1
            rapido = rapido.proximo.proximo; // avança 2
        }
        return lento; // "lento" para no meio
    }

    private No merge(No esquerda, No direita) {
        if (esquerda == null) return direita;
        if (direita == null) return esquerda;

        No resultado;
        if (esquerda.produto.getNome().compareToIgnoreCase(direita.produto.getNome()) <= 0) {
            resultado = esquerda;
            resultado.proximo = merge(esquerda.proximo, direita);
        } else {
            resultado = direita;
            resultado.proximo = merge(esquerda, direita.proximo);
        }
        return resultado;
    }

    public Produto buscarPorCodigo(String codigo) {
        No atual = inicio;
        while (atual != null) {
            if (atual.produto.getCodigo().equalsIgnoreCase(codigo)) {
                return atual.produto;
            }
            atual = atual.proximo;
        }
        return null; // Não encontrado
    }

    public Produto reajuste(Double logicaReajuste) {
        No atual = inicio;
        while (atual != null) {
          atual.produto.setValorSaida(atual.produto.getValorSaida()*logicaReajuste);
            atual = atual.proximo;
        }
        return null; // Não encontrado
    }

}
