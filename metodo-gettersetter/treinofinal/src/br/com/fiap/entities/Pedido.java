package br.com.fiap.entities;

public class Pedido {

    private int numero;
    private Cliente cliente;
    private Produto produto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    @Override
    public String toString() {
        return "\nPedido " +
                "\nnumero=" + numero +
                "\ncliente=" + cliente +
                "\nproduto=" + produto;
    }
}
