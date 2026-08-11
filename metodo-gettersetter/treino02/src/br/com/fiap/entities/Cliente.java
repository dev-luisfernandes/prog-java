package br.com.fiap.entities;

public class Cliente {

//tipo de dados e atributos
    private String nome;
    private int idade;
    private String cpf;
    private double altura;

    //getters and setters


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

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "\nnome = '" + nome + '\'' +
                "\nidade = " + idade +
                "\ncpf = '" + cpf + '\'' +
                "\naltura = " + altura;
    }
}
