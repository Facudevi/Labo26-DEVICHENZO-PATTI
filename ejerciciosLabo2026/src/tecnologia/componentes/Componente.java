package tecnologia.componentes;

public class Componente {
    private String fabricante;
    private String modelo;
    private double precioVenta;
    private int stock;

    public Componente(String fabricante, String modelo, double precioVenta, int stock) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public String getFabricante() { return fabricante; }
    public String getModelo() { return modelo; }
    public double getPrecioVenta() { return precioVenta; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }


    public void actualizarPrecio(double porcentajeAumento) {
        this.precioVenta = this.precioVenta + (this.precioVenta * (porcentajeAumento / 100));
    }


    public String getCategoria() {
        return "General";
    }


    public String getNombreComponente() {
        return fabricante + " " + modelo;
    }
}