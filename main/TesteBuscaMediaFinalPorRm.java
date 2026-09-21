package br.com.fiap.main;

import br.com.fiap.dao.MediaFinalDao;
import br.com.fiap.entities.MediaFinal;

import javax.swing.*;
import java.sql.SQLException;

public class TesteBuscaMediaFinalPorRm {

    // inteiro
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        MediaFinal objMedias = new MediaFinal();

        MediaFinalDao dao = new MediaFinalDao();

        objMedias.setRm(inteiro("Informe o RM do aluno (a) para consulta da Media Final"));

        MediaFinal resultado = dao.buscarPorRm(objMedias.getRm());

        if (resultado != null) {
            System.out.println(resultado);
        } else {
            JOptionPane.showMessageDialog(null, "RM " + objMedias.getRm() + " não encontrado no banco de dados.");
        }
    }
}
