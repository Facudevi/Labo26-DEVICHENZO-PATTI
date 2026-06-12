package tecnologia.componentes.periferico.entrada;
import tecnologia.componentes.periferico.Periferico;

public class Dispositivo_Entrada extends Periferico {
    private String tipoConector;

    public Dispositivo_Entrada(String fabricante, String modelo, double precioVenta, int stock, String tipoConector, int cantidadPuertos) {
        super(fabricante, modelo, precioVenta, stock, cantidadPuertos);
        this.tipoConector = tipoConector;
    }

    public String getTipoConector() {
        return tipoConector;
    }


    @Override
    public String getCategoria() {
        return "Entrada";
    }
}