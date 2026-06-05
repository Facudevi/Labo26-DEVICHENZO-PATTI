package tecnologia.componentes;

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

    public int esCPU(){ return 0; }
    public int esSalida(){ return 0; }
    public int esEntrada(){ return 0;}
}