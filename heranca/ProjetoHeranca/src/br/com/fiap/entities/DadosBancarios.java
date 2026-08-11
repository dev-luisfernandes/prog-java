package br.com.fiap.entities;

public class DadosBancarios {

    private String banco;
    private String agencia;
    private int numeroConta;
    private String tipoConta;

    public DadosBancarios() {
    }

    public DadosBancarios(String banco, String agencia, int numeroConta, String tipoConta) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "DadosBancarios{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numeroConta=" + numeroConta +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }
}
