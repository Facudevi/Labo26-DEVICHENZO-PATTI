package pagos;

public class Efectivo extends Metodo_Pago{
    @Override
    public double calcularTotal(double subtotal) {
        return subtotal;
    }

    @Override
    public double getMontoRecargo(double subtotal) {
        return 0.0;
    }
}