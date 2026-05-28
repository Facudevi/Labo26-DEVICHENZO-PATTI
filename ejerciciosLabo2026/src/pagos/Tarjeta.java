package pagos;

public class Tarjeta extends Metodo_Pago{
    private String numTarjeta;
    private String banco;
    private String flujo;

    public Tarjeta(String numTarjeta, String banco, String flujo) {
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.flujo = flujo;
    }

    @Override
    public double calcularTotal(double subtotal) {
        return subtotal * 1.05;
    }

    @Override
    public double getMontoRecargo(double subtotal) {
        return subtotal * 0.05;
    }
}