package Singleton;


import Singleton.service.ServicoDeUsuarios;
import Singleton.singleton.SingletonConnectionPool;

public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("Tetando obter a primeira instância do Connection Pool...");
        SingletonConnectionPool pool1 = SingletonConnectionPool.getInstance();
        SingletonConnectionPool pool2 = SingletonConnectionPool.getInstance();

        System.out.println("As instâncias são as mesmas? " + (pool1 == pool2));
        System.out.println("--- --- ---");

        ServicoDeUsuarios servico = new ServicoDeUsuarios();
        servico.listarUsuarios();
    }
}
