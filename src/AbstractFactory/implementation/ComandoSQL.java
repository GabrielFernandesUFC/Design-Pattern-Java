package AbstractFactory.implementation;

import AbstractFactory.interfaces.IComandoDB;

public class ComandoSQL implements IComandoDB {

    @Override
    public void executar(String query) {
        System.out.println("ComandoSQL.executar()");
    }
    
}
