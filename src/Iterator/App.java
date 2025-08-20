package Iterator;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
        meuCarrinho.adicionarItem("Camisa");
        meuCarrinho.adicionarItem("Tênis");
        meuCarrinho.adicionarItem("Calça Jeans");

        ItemIterator iterator = meuCarrinho.criarIterator();

        System.out.println("Itens no carrinho");
        while (iterator.temProximo()) {
            String item = (String) iterator.proximo();
            System.out.println(item);
        }
    }
}
