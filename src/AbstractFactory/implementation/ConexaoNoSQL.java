package AbstractFactory.implementation;

import AbstractFactory.interfaces.IConexaoDB;

public class ConexaoNoSQL implements IConexaoDB {

    @Override
    public void conectar() {
        System.out.println("ConexaoNoSQL.conectar()");
    }

    @Override
    public void desconectar() {
        System.out.println("ConexaoNoSQL.desconectar()");
    }
    
}
