package tecnologia.componentes.periferico.entrada;

public class Mouse extends Dispositivo_Entrada{
    public Mouse(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos, String tipoConector) {
        super(nombreFabricante, modelo, precioVenta, stock, puertosValidos, tipoConector);
    }

    @Override
    public boolean esEntrada() { return true; }
}