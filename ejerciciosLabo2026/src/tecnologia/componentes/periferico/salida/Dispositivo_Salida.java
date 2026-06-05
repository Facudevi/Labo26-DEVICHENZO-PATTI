package tecnologia.componentes.periferico.salida;
import tecnologia.componentes.periferico.Periferico;

public class Dispositivo_Salida extends Periferico {
    public Dispositivo_Salida(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos);
    }

    @Override
    public int esSalida() { return 1; }
}