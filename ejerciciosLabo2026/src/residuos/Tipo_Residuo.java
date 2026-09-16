package residuos;

public class Tipo_Residuo {
    private String nombre;
    private boolean reciclable;
    private String descripcion;

    public Tipo_Residuo(String nombre, boolean reciclable, String descripcion) {
        this.nombre = nombre;
        this.reciclable = reciclable;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public boolean isReciclable() { return reciclable; }
    public String getDescripcion() { return descripcion; }
}