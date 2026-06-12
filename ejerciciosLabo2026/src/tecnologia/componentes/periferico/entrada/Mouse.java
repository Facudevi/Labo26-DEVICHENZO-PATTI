package tecnologia.componentes.periferico.entrada;

public class Mouse extends Dispositivo_Entrada{
    public Mouse(String fabricante, String modelo, double precioVenta, int stock, String tipoConector, int cantidadPuertos) {
        super(fabricante, modelo, precioVenta, stock, tipoConector, cantidadPuertos);
    }


    @Override
    public String getNombreComponente() { return "Mouse " + getFabricante(); }
}