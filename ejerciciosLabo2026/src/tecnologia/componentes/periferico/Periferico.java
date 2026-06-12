package tecnologia.componentes.periferico;
import tecnologia.componentes.Componente;

public class Periferico extends Componente {
    private int cantidadPuertos;

    public Periferico(String fabricante, String modelo, double precioVenta, int stock, int cantidadPuertos) {
        super(fabricante, modelo, precioVenta, stock);
        this.cantidadPuertos = cantidadPuertos;
    }

    public int getCantidadPuertos() {
        return cantidadPuertos;
    }


    @Override
    public String getCategoria() {
        return "Periferico";
    }
}