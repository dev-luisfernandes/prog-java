package br.com.fiap.entities;

public class Produto {

    private String tipo;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String tipo, double preco, int quantidade) {
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
