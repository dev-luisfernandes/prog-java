package br.com.fiap.entities;

public class Produto {

    //visibilidade, tipo de dado e atributo
    private int codigo;
    private String tipo;
    private String marca;
    private double preco;

    //construtor vazio
    public Produto() {
    }

    //construtor cheio
    public Produto(int codigo, String tipo, String marca, double preco) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    //setter & getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //toString
    @Override
    public String toString() {
        return "\n\nProduto " +
                "\ncódigo=" + codigo +
                "\ntipo='" + tipo + '\'' +
                "\nmarca='" + marca + '\'' +
                "\npreço=" + preco;
    }
}