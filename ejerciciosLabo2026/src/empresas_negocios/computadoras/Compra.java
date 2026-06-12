package empresas_negocios.computadoras;
import pagos.Metodo_Pago;
import seres_vivos.Cliente;
import tecnologia.Computadora;
import tecnologia.componentes.Componente;

public class Compra {
    private Cliente cliente;
    private Computadora computadora;
    private Metodo_Pago pago;

    public Compra(Cliente cliente, Computadora computadora, Metodo_Pago pago) {
        this.cliente = cliente;
        this.computadora = computadora;
        this.pago = pago;
    }

    public Computadora getComputadora() { return computadora; }


    public void mostrarDetalleCompra() {
        double subtotal = computadora.calcularPrecioComponentes();
        double recargo = pago.calcularRecargo(subtotal);
        double total = subtotal + recargo;

        System.out.println("=== DETALLE DE COMPRA ===");
        System.out.println("Cliente: " + cliente.getNombreCompleto());
        System.out.println("Componentes incluidos:");
        System.out.println(" - " + computadora.getCpu().getNombreComponente() + " ($" + computadora.getCpu().getPrecioVenta() + ")");

        for (Componente c : computadora.getPerifericos()) {
            System.out.println(" - " + c.getNombreComponente() + " ($" + c.getPrecioVenta() + ")");
        }

        pago.mostrarDatosPago();
        System.out.println("-------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Recargo: $" + recargo);
        System.out.println("TOTAL FINAL: $" + total);
        System.out.println("=========================\n");
    }
}