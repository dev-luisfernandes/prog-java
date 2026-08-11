package br.com.fiap.entities;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double pesso;
    Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura, double pesso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.pesso = pesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesso() {
        return pesso;
    }

    public void setPesso(double pesso) {
        this.pesso = pesso;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", pesso=" + pesso +
                ", endereco=" + endereco +
                '}';
    }
}
