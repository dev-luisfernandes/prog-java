package br.com.fiap.api;

public class Endereco {

    //viacep
    private String CEP;
    private String logradouro;
    private String bairra;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;

    public Endereco() {
    }

    public Endereco(String CEP, String logradouro, String bairra, String localidade, String uf, String estado, String regiao) {
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.bairra = bairra;
        this.localidade = localidade;
        this.uf = uf;
        this.estado = estado;
        this.regiao = regiao;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairra() {
        return bairra;
    }

    public void setBairra(String bairra) {
        this.bairra = bairra;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "CEP='" + CEP + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairra='" + bairra + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", estado='" + estado + '\'' +
                ", regiao='" + regiao + '\'' +
                '}';
    }
}
