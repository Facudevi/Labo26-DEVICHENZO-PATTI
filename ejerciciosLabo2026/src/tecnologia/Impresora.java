package tecnologia;

public class Impresora extends Dispositivo_Salida{
    private String metodoImpresion;

    public Impresora(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos, String metodoImpresion) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos);
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodo() { return metodoImpresion; }
    public void setMetodo(String metodo) { this.metodoImpresion = metodoImpresion; }

    @Override
    public boolean esSalida() { return true; }
}