package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j)
    { return JOptionPane.showInputDialog(j);}

    static int inteiro(String j)
    { return Integer.parseInt(JOptionPane.showInputDialog(j));}

    static Double real(String j)
    {return Double.parseDouble(JOptionPane.showInputDialog(j));}

    public static void main(String[] args){

        //String nome, String cpf, int idade
        Cliente objCliente = new Cliente(
                texto("nome"),
                texto("cpf"),
                inteiro("idade")
        );

        //String endereco, int numero, String rua
        Endereco objEndereco = new Endereco(
                texto("endereço"),
                inteiro("numero"),
                texto("Bairro")
        );

        objCliente.setEndereco(objEndereco);

        Produto objProduto = new Produto(
                texto("tipo"),
                real("preço"),
                inteiro("código")
        );

    }

}
