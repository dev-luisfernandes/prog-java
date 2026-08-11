package br.com.fiap.entities;

public class Cliente {

    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private Endereco endereco;


    public Cliente() {
    }

    public Cliente(String nome, String cpf, int idade, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Cliente " +
                "\nnome = " + nome + '\'' +
                "\ncpf = " + cpf + '\'' +
                "\nidade = " + idade +
                "\naltura = " + altura +
                "\nendereco = " + endereco;
    }
}
