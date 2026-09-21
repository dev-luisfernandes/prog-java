package br.com.fiap.entities;

public class Cliente {

    private String nome;
    private String cpf;
    private int idade;
    private Pedido pedido;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "\nnome ='" + nome + '\'' +
                "\ncpf ='" + cpf + '\'' +
                "\nidade =" + idade +
                "\nPEDIDO DO CLIENTE: " + pedido;
    }
}
