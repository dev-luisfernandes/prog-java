package br.com.fiap.entities;

public class Empresa {

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String segmento;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return "\nEmpresa: " +
                "\ncnpj: " + cnpj + '\'' +
                "\nnomeFantasia: " + nomeFantasia + '\'' +
                "\nrazaoSocial: " + razaoSocial + '\'' +
                "\nsegmento: " + segmento;
    }
}
