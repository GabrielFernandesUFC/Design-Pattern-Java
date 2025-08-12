package AbstractFactory.factory;

import AbstractFactory.implementation.ComandoSQL;
import AbstractFactory.implementation.ConexaoNoSQL;
import AbstractFactory.interfaces.IComandoDB;
import AbstractFactory.interfaces.IConexaoDB;

public class FabricaNoSQL implements FabricaDB {

    @Override
    public IConexaoDB criarConexaoDB() {
        return new ConexaoNoSQL();
    }

    @Override
    public IComandoDB criarComandoDB() {
        return new ComandoSQL();
    }
    
}
