package br.com.fiap.main;

import br.com.fiap.entities.Pessoa;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Crime;

import javax.swing.*;

public class TesteSistemas {

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

        //(String nome, int idade, double altura, double pesso)
        Pessoa objPessoa = new Pessoa(
                texto("nome"),
                inteiro("idade"),
                real("altura"),
                real("pesso")
        );

        //(String rua, int numero, String complemento)
        Endereco objEndereco = new Endereco(
                texto("rua"),
                inteiro("numero"),
                texto("complemento")
        );

        objPessoa.setEndereco(objEndereco);

        //int artigo, String data, String status
        Crime objCrime = new Crime(
                inteiro("Artigo"),
                texto("Data"),
                texto("status")
        );


    }


}
