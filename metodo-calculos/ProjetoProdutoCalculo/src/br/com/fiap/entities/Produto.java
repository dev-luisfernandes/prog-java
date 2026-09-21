package br.com.fiap.entities;

public class Produto {

    private int codigo;
    private String tipo;
    private String marca;
    private double valor;
    private double percentual;

    public Produto() {
    }

    public Produto(int codigo, String tipo, String marca, double valor) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", percentual=" + percentual +
                '}';
    }

    public double valorDesconto(){
        if (valor > 112) {
        percentual = 15.5;
        double desconto = valor * (percentual/100);
        return valor - desconto;
        }
        else if (valor > 75 ) {
        percentual = 7.5;
        double desconto = valor * (percentual/100);
        return valor - desconto;
        }
        else {
            return valor - 0;
        }
    }
}
