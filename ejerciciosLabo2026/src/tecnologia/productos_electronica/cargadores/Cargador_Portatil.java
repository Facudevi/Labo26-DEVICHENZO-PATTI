package tecnologia.productos_electronica.cargadores;

import tecnologia.Producto;
import tecnologia.productos_electronica.Seccion;

public class Cargador_Portatil extends Producto {
    private int cantCargas;

    public Cargador_Portatil(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock, Seccion.CARGADORES);
        this.cantCargas = cantCargas;
    }

    public int getCantCargas() { return cantCargas; }
    public void setCantCargas(int cantCargas) { this.cantCargas = cantCargas; }
}