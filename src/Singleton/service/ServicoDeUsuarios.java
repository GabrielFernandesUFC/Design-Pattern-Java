package Singleton.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Singleton.singleton.SingletonConnectionPool;

public class ServicoDeUsuarios {
    public void listarUsuarios() {
        Connection connection = null;
        
        try {
            // obtém a única instância do pool de conexões
            connection = SingletonConnectionPool.getInstance().getConnection();

            // lógica de acesso ao banco de dados
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome FROM usuarios");

            while (rs.next()) {
                System.out.println("Usuário: " + rs.getString("nome"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // A conexão e liberada de volta para o pool
            if (connection != null) {
                SingletonConnectionPool.getInstance().releaseConnection(connection);
            }
        }
    }
}
