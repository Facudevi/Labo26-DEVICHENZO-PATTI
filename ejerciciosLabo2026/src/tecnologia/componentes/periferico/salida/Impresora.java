package tecnologia.componentes.periferico.salida;

public class Impresora extends Dispositivo_Salida{
    private Metodo_Impresion metodo;

    public Impresora(String fabricante, String modelo, double precioVenta, int stock, int cantidadPuertos, Metodo_Impresion metodo) {
        super(fabricante, modelo, precioVenta, stock, cantidadPuertos);
        this.metodo = metodo;
    }


    @Override
    public String getNombreComponente() { return "Impresora " + getFabricante() + " (" + metodo + ")"; }
}