# Observer

É um padrão de projeto comportamental que define um relacionamento de um para muitos entre objetos. Quando o estado de um objeto, chamado de Assunto (Subject), muda, todos os dependentes, chamados de Observadores são notificados automaticamente.

Um problema de negócio: Sistema de notícia da bolsa de valores

Você está desenvolvendo um sistema de monitoramento da bolsa de valores. A regra de negócio é que, quando o preço de uma ação muda, todos os usuários, painéis de controler ou aplicativos ques estão "seguindo" essa ação devem ser notificados imediatamente.

```java
public class Acao {
    // Código ruim: Acoplamento forte!
    private Usuario usuario1;
    private Dashboard painel;

    public void setPreco(double novoPreco) {
        // ...
        usuario1.notificar(novoPreco);
        painel.atualizar(novoPreco);
    }
}
```
