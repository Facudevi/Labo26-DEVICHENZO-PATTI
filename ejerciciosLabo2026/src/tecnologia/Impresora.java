package tecnologia;

public class Impresora extends Dispositivo_Salida{
    private String metodoImpresion;

    public Impresora(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos, String metodoImpresion) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos);
        this.metodoImpresion = metodoImpresion;
    }

    @Override
    public boolean esSalida() { return true; }
}