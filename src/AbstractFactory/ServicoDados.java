package AbstractFactory;

import AbstractFactory.factory.FabricaDB;
import AbstractFactory.interfaces.IComandoDB;
import AbstractFactory.interfaces.IConexaoDB;

public class ServicoDados {
    private FabricaDB fabrica;

    public ServicoDados(FabricaDB fabrica) {
        this.fabrica = fabrica;
    }

    public void salvarDados(String query) {
        IConexaoDB conexao = fabrica.criarConexaoDB();
        conexao.conectar();

        IComandoDB comando = fabrica.criarComandoDB();
        comando.executar(query);

        conexao.desconectar();
    }
}
