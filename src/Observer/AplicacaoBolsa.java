package Observer;

public class AplicacaoBolsa {
    public static void main(String[] args) {
        Acao petrobras = new Acao("PETR4", 30.00);

        Observer joao = new Usuario("João");
        Observer maria = new Usuario("Maria");
        Observer painelDaEmpresa = new Dashboard();

        petrobras.registrar(joao);
        petrobras.registrar(maria);
        petrobras.registrar(painelDaEmpresa);

        System.out.println("--- Início do dia ---");
        petrobras.setPreco(30.50);

        System.out.println("\n--- Mais tarde, o João desiste de seguir a ação ---");
        petrobras.desresgistrar(joao);
        
        System.out.println("\n--- Fim do dia ---");
        petrobras.setPreco(31.25);
    }
}