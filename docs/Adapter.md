# Decorator

Case de regras de negócio:

Imagine que você está desenvolvendo uma plataforma de pagamentos. Seu sistema utiliza uma interface de pagamento interna (IPagamento) para processar transações. No entanto, sua empresa acaba de comprar uma nova empresa que usa um sistema de pagamento legado, com uma API externa completamente diferente e incompatível com a sua interface.

* Sua interface interna espera um método chamado processarPagamento(Pagamento pagamento)

* enviarTransacao(Transacao transacao)

```java
public class ServicePagamento {
    public void realizarPagamento(Pagamento pagamento) {
        if ("novo_sistema".equals(pagamento.getTipo())) {
            // Lógica para sua interface
        } else if ("sistema_legado".equals(pagamento.getTipo())) {
            // lógica para api legada
            ServicePagamentoLegado legado = new ServicoPagamentoLegado();
            legado.enviarTransacao(pagamento.paraTransacaoLegada());
        }
    }
}
```

O ServicoPagamento precisa saber de todos os detalhes de cada API de pagamento, tornando inflexível e difícil de manter.

Solução do padrão adaper: ele funciona como um tradutor entre interfaces incompatíveis.

Qual ganho de se utilizar o adapter:

Baixo acoplamento

Flexibilidade

Reuso de código
