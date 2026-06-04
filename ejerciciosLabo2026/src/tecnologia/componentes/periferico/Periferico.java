package tecnologia.componentes.periferico;
import tecnologia.componentes.Componente;

public class Periferico extends Componente {
    private int puertosValidos;

    public Periferico(String nombreFabricante, String modelo, double precioVenta, int stock, int puertosValidos) {
        super(nombreFabricante, modelo, precioVenta, stock);
        this.puertosValidos = puertosValidos;
    }
}