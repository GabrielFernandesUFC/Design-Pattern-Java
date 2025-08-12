package AbstractFactory.implementation;

import AbstractFactory.interfaces.IConexaoDB;

public class ConexaoSQL implements IConexaoDB {
    @Override
    public void conectar() {
        System.out.println("ConexaoSQL.conectar()");
    }

    @Override
    public void desconectar() {
        System.out.println("ConexaoSQL.desconectar()");
    }
}
