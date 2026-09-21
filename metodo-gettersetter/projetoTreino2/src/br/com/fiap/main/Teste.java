package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class Teste {

    //string
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //inteiro
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }



    public static void main(String[] args) {

        //String nome, String cpf, int idade, double altura
        Cliente objCliente = new Cliente(
                texto("nome"),
                texto("cpf"),
                inteiro("idade"),
                real("altura")
        );

        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndereco = new Endereco(
                texto("logradouro"),
                inteiro("numero"),
                texto("complemento"),
                texto("cep"),
                texto("bairro"),
                texto("cidade"),
                texto("estado")
        );

        objCliente.setEndereco(objEndereco);

        //int codigo, String tipo, String marca, double preco
        Produto objProduto = new Produto(
                inteiro("codigo"),
                texto("tipo"),
                texto("marca"),
                real("preço")
        );

    }

}
