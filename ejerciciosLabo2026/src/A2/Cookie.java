package A2;

public class Cookie extends Preparacion implements Vendible{
    private int cantBicarbonato;
    private Topping topping;

    public Cookie(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, double precio, int cantBicarbonato, Topping topping) {
        super(cantHarina, cantAzucar, cantManteca, cantHuevos, stock, precio);
        this.cantBicarbonato = cantBicarbonato;
        this.topping = topping;
    }

    public int getCantBicarbonato() {
        return cantBicarbonato;
    }

    public Topping getTopping() {
        return topping;
    }

    @Override
    public String conocerReceta() {
        return "Empeza partiendo el chocolate";
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
        return "Animate a probar las mejores cookies del mercado";
    }

    @Override
    public double calcularPrecio(int cantComprar) {
        double total = cantComprar * getPrecio();
        // CORREGIDO: se quito una impresion duplicada, vender() ya imprime el total
        return total;
    }

    @Override
    public void vender(int cantStock) throws SinStockException{
        if(actualizarStock(cantStock)){
            System.out.println("Las ganancias que se obtuvieron de la venta son: " + calcularPrecio(cantStock));
        }
    }
}