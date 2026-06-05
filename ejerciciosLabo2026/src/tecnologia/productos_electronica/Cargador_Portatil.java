package tecnologia.productos_electronica;

import tecnologia.Producto;

public class Cargador_Portatil extends Producto {
    private int cantCargas;

    public Cargador_Portatil(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock, Seccion.CARGADORES);
        this.cantCargas = cantCargas;
    }

    public int getCantCargas() { return cantCargas; }
    public void setCantCargas(int cantCargas) { this.cantCargas = cantCargas; }
}