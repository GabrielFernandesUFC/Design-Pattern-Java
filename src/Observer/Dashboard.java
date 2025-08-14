package Observer;

public class Dashboard implements Observer {

    @Override
    public void atualizar(String acao, double preco) {
        System.out.println("Dashboard: Atualizando painel visual para a ação " + acao + ". Novo preço: R$" + preco);
    }
    
}
