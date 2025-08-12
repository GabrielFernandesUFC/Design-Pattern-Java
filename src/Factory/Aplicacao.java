public class Aplicacao {
    public static void main(String[] args) {
        IFrete freteCorreios = FreteFactory.criarFrete("correios");
        double valorCorreios = freteCorreios.calcularFrete(10.5, 150.0);
        System.out.println("Valor do frete dos correios: R$ " + valorCorreios);
    }
}
