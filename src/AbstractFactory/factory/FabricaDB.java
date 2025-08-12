package AbstractFactory.factory;

import AbstractFactory.interfaces.IComandoDB;
import AbstractFactory.interfaces.IConexaoDB;

public interface FabricaDB {
    IConexaoDB criarConexaoDB();
    IComandoDB criarComandoDB();
}
