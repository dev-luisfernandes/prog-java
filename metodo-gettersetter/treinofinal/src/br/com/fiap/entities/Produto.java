package br.com.fiap.entities;

public class Produto {

    private String nome;
    private Double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "\nnome ='" + nome + '\'' +
                "\npreco =" + preco +
                "\nquantidade =";
    }
}
