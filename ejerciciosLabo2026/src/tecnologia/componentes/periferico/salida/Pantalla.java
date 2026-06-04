package tecnologia.componentes.periferico.salida;

public class Pantalla extends Dispositivo_Salida{
    public Pantalla(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos);
    }

    @Override
    public boolean esSalida() { return true; }
}