package tecnologia.componentes.periferico.salida;

public class Pantalla extends Dispositivo_Salida{
    public Pantalla(String fabricante, String modelo, double precioVenta, int stock, int cantidadPuertos) {
        super(fabricante, modelo, precioVenta, stock, cantidadPuertos);
    }


    @Override
    public String getNombreComponente() { return "Pantalla " + getFabricante(); }
}