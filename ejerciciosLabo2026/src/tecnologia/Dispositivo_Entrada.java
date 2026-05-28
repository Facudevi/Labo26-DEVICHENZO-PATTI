package tecnologia;

public class Dispositivo_Entrada extends Periferico{
    private String tipoConector;

    public Dispositivo_Entrada(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos, String tipoConector) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos);
        this.tipoConector = tipoConector;
    }
}