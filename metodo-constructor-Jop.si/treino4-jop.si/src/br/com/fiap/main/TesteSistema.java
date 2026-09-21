package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        //String nome, int idade, double altura
        Cliente objCliente = new Cliente(
                texto("nome"),
                inteiro("idade"),
                real("altura")
        );

        //String rua, int numero, String bairro
        Endereco objEndereco = new Endereco(
                texto("rua"),
                inteiro("numero"),
                texto("bairro")
        );

        objCliente.setEndereco(objEndereco);


        //String tipo, double preco, int quantidade
        Produto objProduto = new Produto(
                texto("tipo"),
                real("preço"),
                inteiro("quantidade")
        );

    }

}
