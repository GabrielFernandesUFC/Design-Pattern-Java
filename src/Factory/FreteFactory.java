public class FreteFactory {
    public static IFrete criarFrete(String tipo) {
        if ("correios".equals(tipo)) {
            return new FreteCorreiosConcreto();
        } else if ("transportadora".equals(tipo)) {
            return new FreteTransportadoraConcreto();
        } else {
            throw new IllegalArgumentException("Tipo de frete válido");
        }
    }
}
