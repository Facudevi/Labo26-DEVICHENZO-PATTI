package tecnologia.componentes.periferico.entrada;
import tecnologia.componentes.periferico.Periferico;

public class Dispositivo_Entrada extends Periferico {
    private String tipoConector;

    public Dispositivo_Entrada(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos, String tipoConector) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos);
        this.tipoConector = tipoConector;
    }

    public String getTipoConector() { return tipoConector; }

    public void setTipoConector(String tipoConector) { this.tipoConector = tipoConector; }

    @Override
    public int esEntrada() { return 1; }
}