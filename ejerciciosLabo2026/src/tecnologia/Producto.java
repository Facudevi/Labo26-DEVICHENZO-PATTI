package tecnologia;
import tecnologia.productos_electronica.Seccion;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private Seccion seccion;

    public Producto(String nombre, double precio, int stock, Seccion seccion) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.seccion = seccion;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public Seccion getSeccion() { return seccion; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio;}
    public void setStock(int stock) { this.stock = stock; }
    public void setSeccion(Seccion seccion) { this.seccion = seccion; }

    @Override
    public String toString(){
        return "Nombre: " + nombre +
                ", Precio: " + precio +
                ", Seccion: " + seccion.name() +
                ", Stock: " + stock +
                "\n--------------------------";
    }

    public Producto mayorStock(Producto producto){
        if(producto.stock > this.stock){
            return producto;
        }
        return this;
    }

    public Producto menorStock(Producto producto){
        if(producto.stock < this.stock){
            return producto;
        }
        return this;
    }
}