package br.com.fiap.main;

import br.com.fiap.dao.MediaFinalDao;
import br.com.fiap.entities.MediaFinal;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarMediaFinal {

    // inteiro
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        MediaFinal objMediaFinal = new MediaFinal();

        MediaFinalDao dao = new MediaFinalDao();

        objMediaFinal.setRm(inteiro("Informe o RM do aluno (a) a ser Deletado"));

        System.out.println(dao.deletar(objMediaFinal.getRm()));
    }
}
