package br.com.fiap.entities;

public class Usuario {

    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nCOMPRADOR " +
                "\nnome = '" + nome + '\'' +
                "\ncpf = '" + cpf + '\'' +
                "\nidade=" + idade +
                "\nENDEREÇO DO CLIENTE: " + endereco;

    }
}
