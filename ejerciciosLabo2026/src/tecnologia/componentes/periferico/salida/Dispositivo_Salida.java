package tecnologia.componentes.periferico.salida;
import tecnologia.componentes.periferico.Periferico;

public class Dispositivo_Salida extends Periferico {
    public Dispositivo_Salida(String fabricante, String modelo, double precioVenta, int stock, int cantidadPuertos) {
        super(fabricante, modelo, precioVenta, stock, cantidadPuertos);
    }


    @Override
    public String getCategoria() {
        return "Salida";
    }
}