package tecnologia.componentes.periferico.entrada;

public class Teclado extends Dispositivo_Entrada {
    public Teclado(String fabricante, String modelo, double precioVenta, int stock, String tipoConector, int cantidadPuertos) {
        super(fabricante, modelo, precioVenta, stock, tipoConector, cantidadPuertos);
    }


    @Override
    public String getNombreComponente() { return "Teclado " + getFabricante(); }
}