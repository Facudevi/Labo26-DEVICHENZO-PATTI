package tecnologia.productos_electronica.multimedia;
import tecnologia.Producto;
import tecnologia.productos_electronica.Seccion;

public class Equipo_Sonido extends Producto {
    private boolean bluetooth;

    public Equipo_Sonido(String nombre, double precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() { return bluetooth; }


    @Override
    public String toString(){
        return super.toString() +
                " | Bluetooth: " + bluetooth +
                "\n--------------------------";
    }
}