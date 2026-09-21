package br.com.fiap.entities;

public class Endereco {

    private String endereco;
    private int numero;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String endereco, int numero, String rua) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", rua='" + bairro + '\'' +
                '}';
    }
}
