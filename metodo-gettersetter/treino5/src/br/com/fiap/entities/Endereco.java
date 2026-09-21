package br.com.fiap.entities;

public class Endereco {

    private String rua;
    private String cep;
    private int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nrua = '" + rua + '\'' +
                "\ncep = '" + cep + '\'' +
                "\nnumero = " + numero;
    }
}
