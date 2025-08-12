package AbstractFactory.factory;

import AbstractFactory.implementation.ComandoSQL;
import AbstractFactory.implementation.ConexaoSQL;
import AbstractFactory.interfaces.IComandoDB;
import AbstractFactory.interfaces.IConexaoDB;

public class FabricaSQL implements FabricaDB {

    @Override
    public IConexaoDB criarConexaoDB() {
        return new ConexaoSQL();
    }

    @Override
    public IComandoDB criarComandoDB() {
        return new ComandoSQL();
    }
    
}
