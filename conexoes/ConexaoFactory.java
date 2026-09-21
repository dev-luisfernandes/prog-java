package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    private final static String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private final static String USUARIO= "rm569064" ;
    private final static String SENHA = "040608" ;

    // metodo de conexao com o banco de dados
    public Connection conexao() throws ClassNotFoundException, SQLException {


        // Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // retornar a conexao
        return DriverManager.getConnection( URL, USUARIO, SENHA);
    }
}
