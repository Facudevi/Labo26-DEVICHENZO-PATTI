package ejercitacionRecuperatorio.tienda.productos_electronica.multimedia;
import ejercitacionRecuperatorio.tienda.Producto;
import ejercitacionRecuperatorio.tienda.productos_electronica.Seccion;

public class Equipo_Sonido extends Producto {
    private boolean bluetooth;

    public Equipo_Sonido(String nombre, double precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() { return bluetooth; }
}