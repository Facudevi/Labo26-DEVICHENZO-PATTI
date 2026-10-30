package A2;

public class Brownie extends Preparacion implements Vendible{
    private int cantChocolate;

    public Brownie(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, double precio, int cantChocolate) {
        super(cantHarina, cantAzucar, cantManteca, cantHuevos, stock, precio);
        this.cantChocolate = cantChocolate;
    }

    public int getCantChocolate() {
        return cantChocolate;
    }

    @Override
    public String conocerReceta() {
        return "Derretí la manteca";
    }

    @Override
    public boolean actualizarStock(int cantVender) throws SinStockException{
        if (getStock()<cantVender){
            throw new SinStockException("No hay stock suficiente");
        }
        System.out.println("Stock suficiente");
        reponer(-cantVender); // CORREGIDO: se descuenta el stock, antes solo se verificaba
        return true;
    }

    @Override
    public String descripcionVenta() {
        return "Brownies bien húmedos";
    }

    @Override
    public double calcularPrecio(int cantComprar) {
        double total = cantComprar * getPrecio();
        // CORREGIDO: se quito una impresion duplicada, vender() ya imprime el total
        return total;
    }

    @Override
    public void vender(int cantStock) throws SinStockException{
        System.out.println("Descripcion: " + descripcionVenta());
        if(actualizarStock(cantStock)){
            System.out.println("Las ganancias que se obtuvieron de la venta son: " + calcularPrecio(cantStock));
        }
    }
}