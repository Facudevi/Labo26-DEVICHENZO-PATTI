package pagos;

public class Tarjeta extends Metodo_Pago{
    private String numeroTarjeta;
    private String banco;
    private Tipo_Tarjeta tipo;

    public Tarjeta(String numeroTarjeta, String banco, Tipo_Tarjeta tipo) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.tipo = tipo;
    }


    @Override
    public double calcularRecargo(double subtotal) {
        return subtotal * 0.05; // 5% de recargo por consigna
    }


    @Override
    public void mostrarDatosPago() {
        System.out.println("Método de Pago: Tarjeta " + tipo + " | Banco: " + banco + " | Nº: " + numeroTarjeta);
    }
}