package br.com.fiap.entities;
//abstract usado para dizer que é a super classe
public abstract class Pessoa {

    protected String nome;
    protected String email;
    protected String fone;
    protected double renda;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String fone, double renda) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                ", renda=" + renda +
                '}';
    }
}
