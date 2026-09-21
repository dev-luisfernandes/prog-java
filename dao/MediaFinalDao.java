package br.com.fiap.dao;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.entities.MediaFinal;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MediaFinalDao {

    Connection minhaConexao;

    public MediaFinalDao() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConexaoFactory().conexao();
    }



    // Inserir
    public String inserir (MediaFinal mediaFinal) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Insert into T_FIAP_MEDIAS values  ( ?, ?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, mediaFinal.getRm());
        stmt.setString(2, mediaFinal.getNome());
        stmt.setString(3, mediaFinal.getTurma());
        stmt.setDouble(4, mediaFinal.getMediaSemestre1());
        stmt.setDouble(5, mediaFinal.getMediaSemestre2());
        stmt.setDouble(6, mediaFinal.mediaFinal());
        stmt.setString(7, mediaFinal.informacaoMedia());

        stmt.execute();
        stmt.close();
        return  "Medias cadastradas com sucesso";
    }


    // Selecionar
    public ArrayList<MediaFinal> selecionar() throws SQLException {
        ArrayList<MediaFinal> listaMediasFinais = new ArrayList<MediaFinal>();
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Select * from T_FIAP_MEDIAS");
        ResultSet rs = stmt.executeQuery();

        while(rs.next()){
            MediaFinal mediaFinal = new MediaFinal();
            mediaFinal.setRm(rs.getInt(1));
            mediaFinal.setNome(rs.getString(2));
            mediaFinal.setTurma(rs.getString(3));
            mediaFinal.setMediaSemestre1(rs.getDouble(4));
            mediaFinal.setMediaSemestre2(rs.getDouble(5));
            mediaFinal.mediaFinal(rs.getDouble(6));
            mediaFinal.informacaoMedia(rs.getString(7));
            listaMediasFinais.add(mediaFinal);
        }
        return listaMediasFinais;
    }

    // Buscar por RM
    public MediaFinal buscarPorRm(int rm) throws SQLException {
        MediaFinal mediaFinal = null;

        PreparedStatement stmt = minhaConexao.prepareStatement(
                "SELECT * FROM T_FIAP_MEDIAS WHERE RM = ?"
        );
        stmt.setInt(1, rm);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            mediaFinal = new MediaFinal();
            mediaFinal.setRm(rs.getInt(1));
            mediaFinal.setNome(rs.getString(2));
            mediaFinal.setTurma(rs.getString(3));
            mediaFinal.setMediaSemestre1(rs.getDouble(4));
            mediaFinal.setMediaSemestre2(rs.getDouble(5));
            mediaFinal.mediaFinal(rs.getDouble(6));
            mediaFinal.informacaoMedia(rs.getString(7));
        }

        rs.close();
        stmt.close();

        return mediaFinal;
    }


    // Deletar por RM
    public String deletar(int rm) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "DELETE FROM T_FIAP_MEDIAS WHERE RM = ?"
        );
        stmt.setInt(1, rm);

        int linhasAfetadas = stmt.executeUpdate();
        stmt.close();

        if (linhasAfetadas > 0) {
            return "Aluno (a) com RM " + rm + " deletado com sucesso.";
        } else {
            return "Nenhum aluno (a) com RM " + rm + " foi encontrado para exclusão.";
        }
    }


    // Atualizar por RM
    public String atualizar(MediaFinal mediaFinal) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "UPDATE T_FIAP_MEDIAS SET " +
                        "NOME = ?, TURMA = ?, MEDIA_SEMESTRE1 = ?, MEDIA_SEMESTRE2 = ?, MEDIA_FINAL = ?, INFORMACAO_MEDIA = ? " +
                        "WHERE RM = ?"
        );

        stmt.setString(1, mediaFinal.getNome());
        stmt.setString(2, mediaFinal.getTurma());
        stmt.setDouble(3, mediaFinal.getMediaSemestre1());
        stmt.setDouble(4, mediaFinal.getMediaSemestre2());
        stmt.setDouble(5, mediaFinal.mediaFinal());
        stmt.setString(6, mediaFinal.informacaoMedia());
        stmt.setInt(7, mediaFinal.getRm());

        int linhasAfetadas = stmt.executeUpdate();
        stmt.close();

        if (linhasAfetadas > 0) {
            return "Aluno (a) com RM " + mediaFinal.getRm() + " atualizado com sucesso.";
        } else {
            return "Nenhum aluno (a) com RM " + mediaFinal.getRm() + " foi encontrado para atualização.";
        }
    }
}
