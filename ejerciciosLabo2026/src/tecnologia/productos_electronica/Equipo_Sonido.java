package tecnologia.productos_electronica;

import tecnologia.Producto;

public class Equipo_Sonido extends Producto {
    private boolean bluetooth;

    public Equipo_Sonido(String nombre, double precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() { return bluetooth; }
}