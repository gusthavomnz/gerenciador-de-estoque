package lojaagricola.modelo;

public class Produto {
    private String codigo;
    private String nome;
    private String marca;
    private double valorEntrada;
    private double valorSaida;
    private int quantidade;

    public Produto() {
    }

    public Produto(String codigo, String nome, String marca, double valorEntrada, double valorSaida, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.valorEntrada = valorEntrada;
        this.valorSaida = valorSaida;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                " | Nome: " + nome +
                " | Marca: " + marca +
                " | Valor Entrada: R$" + valorEntrada +
                " | Valor Saída: R$" + valorSaida +
                " | Quantidade: " + quantidade;
    }



    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

