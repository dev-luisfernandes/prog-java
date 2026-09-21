package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Empresa;

import javax.swing.*;

public class TesteSistema {

    //metodo string
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //metodo para int
    static int inteiro(int j){
        return integer
                
    }


    public static void main(String[] args) {

        Colaborador objcolaborador = new Colaborador();
        Endereco objendereco = new Endereco();
        Empresa objempresa = new Empresa();

        objcolaborador.setNumeroRegistro(Integer.parseInt(JOptionPane.showInputDialog("digite o numero de registro")));
        objcolaborador.setNome(texto("Nome do colaborador: ") );
        objcolaborador.setCpf(texto("cpf do colaborador: ") );
        objcolaborador.setCargo(JOptionPane.showInputDialog("Cargo do colaborador: "));
        objcolaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salario")));

        objcolaborador.setEndereco(objendereco);

        objendereco.setLogradouro(JOptionPane.showInputDialog("Endereço do colaborador\n informe o logradouro "));
        objendereco.setNumero(10);
        objendereco.setCep(JOptionPane.showInputDialog("Informe o cep: "));
        objendereco.setBairro(JOptionPane.showInputDialog("Informe o bairro: "));
        objendereco.setCidade(JOptionPane.showInputDialog("Informe a cidade"));
        objendereco.setEstado(JOptionPane.showInputDialog("informe o estado: "));

        objempresa.setCnpj(JOptionPane.showInputDialog("Informe o cnpj: "));
        objempresa.setNomeFantasia(JOptionPane.showInputDialog("Informe o nome fantasia: "));
        objempresa.setRazaoSocial(JOptionPane.showInputDialog("informe a razão social: "));
        objempresa.setSegmento(JOptionPane.showInputDialog("Informe o segmento da empresa: "));

        System.out.println(

                (objcolaborador + "\n" + "\n" + objempresa)

        );
    }
}
