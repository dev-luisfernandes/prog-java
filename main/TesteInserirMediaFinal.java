package br.com.fiap.main;

import br.com.fiap.dao.MediaFinalDao;
import br.com.fiap.entities.MediaFinal;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirMediaFinal {

    // conjunto de caracteres
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // inteiro
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // real
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        MediaFinal objMediaFinal = new MediaFinal();

        MediaFinalDao dao = new MediaFinalDao();

        objMediaFinal.setRm(inteiro("Informe o RM do aluno (a)"));
        objMediaFinal.setNome(texto("Nome do aluno (a)"));
        objMediaFinal.setTurma(texto("Turma"));
        objMediaFinal.setMediaSemestre1(real("Informe a Media do Semestre 1 "));
        objMediaFinal.setMediaSemestre2(real("Informe a Media do Semestre 2 "));

        System.out.println(dao.inserir(objMediaFinal));

    }
}
