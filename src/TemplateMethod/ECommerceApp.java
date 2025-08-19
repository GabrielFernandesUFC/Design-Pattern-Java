package TemplateMethod;

public class ECommerceApp {
    public static void main(String[] args) {
        // Criando as instâncias manualmente
        ProcessadorDePedido processadorVarejo = new ProcessadorPedidoVarejo();
        ProcessadorDePedido processadorAtacado = new ProcessadorPedidoAtacado();

        System.out.println("--- Processando pedido de Varejo ---");
        processadorVarejo.processarPedido();

        System.out.println("\n--- Processando pedido de Atacado ---");
        processadorAtacado.processarPedido();
    }
}
