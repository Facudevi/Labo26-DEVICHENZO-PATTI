package A2;

public interface Vendible {
    boolean actualizarStock(int cantVender) throws SinStockException;
    String descripcionVenta();
    double calcularPrecio(int cantComprar);
    void vender(int cantStock) throws SinStockException;
}