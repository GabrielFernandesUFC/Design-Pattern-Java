package TemplateMethod;

// ProcessadorDePedido.java
public abstract class ProcessadorDePedido {
    public final void processarPedido() {
        validarPedido();
        calcularFrete();
        processarPagamento();
        enviarConfirmacao();
    }

    protected abstract void validarPedido();
    protected abstract void calcularFrete();
    protected abstract void processarPagamento();

    protected void enviarConfirmacao() {
        System.out.println("Pedido confirmado e pronto para o envio.");
    }
}