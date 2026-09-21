package br.com.fiap.entities;

public class Endereco {

    private String logradouro;
    private int numero;
    private String cep;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nEndereço" +
                "\nlogradouro: " + logradouro + '\'' +
                "\nnumero: " + numero +
                "\ncep: " + cep + '\'' +
                "\ncomplemento: " + complemento + '\'' +
                "\nbairro: " + bairro + '\'' +
                "\ncidade: " + cidade + '\'' +
                "\nestado: " + estado;
    }
}
