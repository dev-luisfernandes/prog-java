package br.com.fiap.main;

import br.com.fiap.entities.Pessoa;
import br.com.fiap.entities.PessoaJuridica;
import br.com.fiap.entities.PessoaFisica;
import br.com.fiap.entities.DadosBancarios;

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
        //instanciar objetos

        //String nome, String email, String fone, double renda, String cpf, String rg, String dataNascimento
        PessoaFisica objPessoaFisica = new PessoaFisica(
                texto("infomações da pessoa fisica\n nome: "),
                texto("email: "),
                texto("fone: "),
                real("Renda: "),
                texto("cpf"),
                texto("rg: "),
                texto("data de nascimento: ")
        );
    }
}
