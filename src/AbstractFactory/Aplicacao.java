package AbstractFactory;

import AbstractFactory.factory.FabricaDB;
import AbstractFactory.factory.FabricaNoSQL;
import AbstractFactory.factory.FabricaSQL;

public class Aplicacao {
    public static void main(String[] args) {
        String tipoBanco = "SQL";

        FabricaDB fabrica;

        if ("SQL".equals(tipoBanco)) {
            fabrica = new FabricaSQL();
        } else {
            fabrica = new FabricaNoSQL();
        }

        ServicoDados servico = new ServicoDados(fabrica);
        servico.salvarDados("Dados de Exemplo");
    }
}
