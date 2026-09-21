package br.com.fiap.main;

import br.com.fiap.dao.MediaFinalDao;
import br.com.fiap.entities.MediaFinal;

import java.sql.SQLException;
import java.util.ArrayList;

public class TesteSelecionarMediasFinais {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MediaFinalDao dao = new MediaFinalDao();

        ArrayList<MediaFinal> listaMedias = ( (ArrayList<MediaFinal>) dao.selecionar());

        if(listaMedias != null){
            // foreach
            for(MediaFinal mediaFinal : listaMedias){
                System.out.println(
                        mediaFinal + " "
                );
            }
        }
    }
}
