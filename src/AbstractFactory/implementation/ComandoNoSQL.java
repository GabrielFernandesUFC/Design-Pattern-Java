package AbstractFactory.implementation;

import AbstractFactory.interfaces.IComandoDB;

public class ComandoNoSQL implements IComandoDB {
    
    @Override
    public void executar(String query) {
        System.out.println("ComandoNoSQL.executar()");
    }

}
