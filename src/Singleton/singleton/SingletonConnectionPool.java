package Singleton.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public final class SingletonConnectionPool {
    private static SingletonConnectionPool instance;

    private SingletonConnectionPool() {
        System.out.println("Iniciando a conexão pool...");

        try {
            Class.forName("org.postgresql.Driver");
            for (int i = 0; i < 5; i++) {
                connections.add(DriverManager.getConnection("jdbc:postgresql://localhost:5432/myapp", "user", "password"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // o método de acesso estático e thread-safe
    public static synchronized SingletonConnectionPool getInstance() {
        if (instance == null) {
            instance = new SingletonConnectionPool();
        }

        return instance;
    }

    // lógica para gerenciar as conexões
    private List<Connection> connections = new ArrayList<>();

    public Connection getConnection() {
        // lógica para obter uma conexão disponível
        if (!connections.isEmpty()) {
            return connections.remove(0);
        }
        throw new IllegalStateException("Nenhuma conexão disponível no pool!");
    }

    // lógica para devolver a conexão ao pool
    public void releaseConnection(Connection connection) {
        connections.add(connection);
    }
}
