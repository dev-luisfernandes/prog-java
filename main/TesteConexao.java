package br.com.fiap.main;

import br.com.fiap.conexoes.ConexaoFactory;
import br.com.fiap.excecoes.ExcecoesConexao;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws ExcecoesConexao, SQLException, ClassNotFoundException {

        try {
            Connection cn = new ConexaoFactory().conexao();

            System.out.println("Conectado com o Banco de Dados");

            cn.close();
        }catch (Exception e){
            throw new ExcecoesConexao(e);
        }
    }
}
