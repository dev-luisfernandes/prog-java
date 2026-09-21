package br.com.fiap.entities;

public class Produto {

    private String tipo;
    private double preco;
    private int codigo;

    public Produto() {
    }

    public Produto(String tipo, double preco, int codigo) {
        this.tipo = tipo;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                '}';
    }
}
