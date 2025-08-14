package Observer;

public class Usuario implements Observer {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String acao, double preco) {
        System.out.println("Olá, " + nome + "! A ação " + acao + " foi atualizada. Novo preço: R$" + preco);
    }
    
}
