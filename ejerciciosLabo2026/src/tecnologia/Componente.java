package tecnologia;

public class Componente {
    private String nombreFabricante;
    private String modelo;
    private double precioVenta;
    private int stock;

    public Componente(String nombreFabricante, String modelo, double precioVenta, int stock) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public String getModelo() { return modelo; }
    public double getPrecioVenta() { return precioVenta; }
    public int getStock() { return stock; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }
    public void setStock(int stock) { this.stock = stock; }


    public void aumentarPrecio(double porcentaje){ this.precioVenta += (this.precioVenta * porcentaje) / 100; }
    public boolean hayStock(){ return stock > 0; }
    public void reducirStock(){ stock --; }

    public boolean esCPU() { return false; }
    public boolean esEntrada() { return false; }
    public boolean esSalida() { return false; }
}