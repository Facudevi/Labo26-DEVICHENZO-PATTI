package tecnologia.componentes.periferico.salida;

public class Impresora extends Dispositivo_Salida{
    private Metodo_Impresion metodoImpresion;

    public Impresora(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos, Metodo_Impresion metodoImpresion) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos);
        this.metodoImpresion = metodoImpresion;
    }

    public Metodo_Impresion getMetodo() { return metodoImpresion; }
    public void setMetodo(Metodo_Impresion metodo) { this.metodoImpresion = metodoImpresion; }

    @Override
    public boolean esSalida() { return true; }
}