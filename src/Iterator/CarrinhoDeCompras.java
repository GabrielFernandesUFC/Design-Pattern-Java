package Iterator;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public ItemIterator criarIterator() {
        return new CarrinhoIterator();
    }

    private class CarrinhoIterator implements ItemIterator {
        private int posicao = 0;

        @Override
        public boolean temProximo() {
            return posicao < itens.size();
        }

        @Override
        public Object proximo() {
            if (this.temProximo()) {
                return itens.get(posicao++);
            }
            return null;
        }
    }


}
