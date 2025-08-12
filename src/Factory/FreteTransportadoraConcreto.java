public class FreteTransportadoraConcreto implements IFrete {
    @Override
    public double calcularFrete(double peso, double distancia) {
        return peso * 0.8 + distancia * 0.2;
    }
}
