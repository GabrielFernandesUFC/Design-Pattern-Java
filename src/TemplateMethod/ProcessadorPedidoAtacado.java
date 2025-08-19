package TemplateMethod;

// ProcessadorPedidoAtacado.java
public class ProcessadorPedidoAtacado extends ProcessadorDePedido {
    @Override
    protected void validarPedido() {
        System.out.println("Validando pedido de atacado...");
    }

    @Override
    protected void calcularFrete() {
        System.out.println("Calculando frete gratuito para cliente de atacado.");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento via fatura para atacado...");
    }
}
