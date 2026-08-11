package br.com.fiap.entities;

public class Colaborador {

    private int numeroRegistro;
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private Endereco endereco;

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nColaborador: " +
                "\nnumeroRegistro: " + numeroRegistro +
                "\nnome: " + nome + '\'' +
                "\ncpf: " + cpf + '\'' +
                "\ncargo: " + cargo + '\'' +
                "\nsalario: " + salario +
                "\nendereco: " + endereco;
    }
}
