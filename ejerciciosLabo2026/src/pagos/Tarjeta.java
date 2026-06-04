package pagos;

public class Tarjeta extends Metodo_Pago{
    private String numTarjeta;
    private String banco;
    private Cred_Deb flujo;

    public Tarjeta(String numTarjeta, String banco, Cred_Deb flujo) {
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.flujo = flujo;
    }

    @Override
    public double calcularTotal(double subtotal) { return subtotal + getMontoRecargo(subtotal); }

    @Override
    public double getMontoRecargo(double subtotal) { return subtotal * 0.05; }
}