package tecnologia.productos_electronica;

import tecnologia.Producto;

public class Televisor extends Producto {
    private Tecnologia_TV tecnologia;
    private int resolucionPix;

    public Televisor(String nombre, double precio, int stock, Tecnologia_TV tecnologia, int resolucionPix) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.tecnologia = tecnologia;
        this.resolucionPix = resolucionPix;
    }

    public Tecnologia_TV getTecnologia() { return tecnologia; }
    public int getResolucionPix() { return resolucionPix; }

    public void setTecnologia(Tecnologia_TV tecnologia) { this.tecnologia = tecnologia; }
    public void setResolucionPix(int resolucionPix) { this.resolucionPix = resolucionPix; }
}