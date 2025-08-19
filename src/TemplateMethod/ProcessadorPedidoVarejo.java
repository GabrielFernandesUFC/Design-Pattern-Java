package TemplateMethod;

// ProcessadorPedidoVarejo.java
public class ProcessadorPedidoVarejo extends ProcessadorDePedido {
    @Override
    protected void validarPedido() {
        System.out.println("Validando pedido de varejo...");
    }

    @Override
    protected void calcularFrete() {
        System.out.println("Calculando frete para cliente de varejo...");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento via cartão de crédito para varejo...");
    }
}
