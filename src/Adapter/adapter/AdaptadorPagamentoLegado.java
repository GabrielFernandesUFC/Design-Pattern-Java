package Adapter.adapter;

import Adapter.interfaces.IPagamento;
import Adapter.service.ServicePagamentoLegado;

public class AdaptadorPagamentoLegado implements IPagamento {

    private ServicePagamentoLegado servicoLegado;

    public AdaptadorPagamentoLegado() {
        this.servicoLegado = new ServicePagamentoLegado();
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Adaptador: Convertendo e chamando a API legada");
        servicoLegado.enviarTransacao(valor);
    }
    
}
