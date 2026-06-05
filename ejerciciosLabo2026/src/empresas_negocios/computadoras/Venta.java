package empresas_negocios.computadoras;
import pagos.Metodo_Pago;
import seres_vivos.Cliente;
import tecnologia.Computadora;

public class Venta {
    private Cliente cliente;
    private Metodo_Pago pago;
    private Computadora computadora;
    private double precio;

    public Venta(Cliente cliente, Metodo_Pago pago, Computadora computadoras) {
        this.cliente = cliente;
        this.pago = pago;
        this.computadora = computadoras;
        this.precio = agegarRecargo();
    }

    public Cliente getCliente() { return cliente; }
    public Metodo_Pago getMetodo() { return pago; }
    public Computadora getComputadora() { return computadora; }
    public double getPrecio() { return precio; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setMetodo(Metodo_Pago pago) { this.pago = pago; }
    public void setComputadora(Computadora computadora) { this.computadora = computadora; }
    public void setPrecio(double precio) { this.precio = precio; }

    public float agegarRecargo(){
        double recargo = computadora.getPrecioT() * pago.recargo();

        return (float) (computadora.getPrecioT() + recargo);
    }

    public void detalleCompra(){
        System.out.println("Cliente: " + cliente.mostrarDetalle() +
                "\nMetodo de Pago: " + pago.metodo() +
                "\n--Componentes PC --" + '\n' +
                computadora.detalleComponentes() +
                "-------------------" +
                "\nSubtotal: $" + computadora.calcularPrecio() +
                "\nRecargo: " + (pago.recargo() * 100) + "%" +
                "\nTotal: $" + precio + '\n');
    }

}
