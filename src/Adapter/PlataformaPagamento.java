package Adapter;

import Adapter.adapter.AdaptadorPagamentoLegado;
import Adapter.interfaces.IPagamento;

public class PlataformaPagamento {
    public static void main(String[] args) {
        IPagamento novoPagamento = new IPagamento() {
            @Override
            public void processarPagamento(double valor) {
                System.out.println("Processando pagamento no novo sistema no valor de: " + valor);
            }
        };
        novoPagamento.processarPagamento(100.0);
        System.out.println("--- ---");

        IPagamento pagamentoLegado = new AdaptadorPagamentoLegado();
        pagamentoLegado.processarPagamento(250);

        
    }
}