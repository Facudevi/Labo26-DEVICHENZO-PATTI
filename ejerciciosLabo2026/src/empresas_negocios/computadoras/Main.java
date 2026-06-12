package empresas_negocios.computadoras;
import pagos.Efectivo;
import pagos.Metodo_Pago;
import pagos.Tarjeta;
import pagos.Tipo_Tarjeta;
import seres_vivos.Cliente;
import tecnologia.Computadora;
import tecnologia.componentes.hardware.CPU;
import tecnologia.componentes.periferico.entrada.Mouse;
import tecnologia.componentes.periferico.entrada.Teclado;
import tecnologia.componentes.periferico.salida.Impresora;
import tecnologia.componentes.periferico.salida.Metodo_Impresion;
import tecnologia.componentes.periferico.salida.Pantalla;

public class Main {
    public static void main(String[] args) {
        Sistema_Computadoras tienda = new Sistema_Computadoras();

        CPU cpu1 = new CPU("Intel", "i7 12700K", 400.0, 5);
        CPU cpu2 = new CPU("AMD", "Ryzen 5 5600X", 250.0, 10);

        Teclado teclado1 = new Teclado("Logitech", "G213", 60.0, 4, "USB", 1);
        Mouse mouse1 = new Mouse("Razer", "Deathadder", 40.0, 8, "USB", 1);

        Pantalla pantalla1 = new Pantalla("Asus", "24'' IPS", 180.0, 3, 2);
        Impresora impresora1 = new Impresora("HP", "LaserJet", 150.0, 2, 1, Metodo_Impresion.LASER);

        tienda.registrarEnCatalogo(cpu1);
        tienda.registrarEnCatalogo(cpu2);
        tienda.registrarEnCatalogo(teclado1);
        tienda.registrarEnCatalogo(mouse1);
        tienda.registrarEnCatalogo(pantalla1);
        tienda.registrarEnCatalogo(impresora1);

        System.out.println("-- ACTUALIZACIÓN DE PRECIOS --");
        System.out.println("Precio original del Mouse Razer: $" + mouse1.getPrecioVenta());
        mouse1.actualizarPrecio(10.0);
        System.out.println("Precio actualizado del Mouse Razer (10% aumento): $" + mouse1.getPrecioVenta());

        System.out.println("\n-- REALIZAR COMPRAS Y MODIFICAR STOCK --");

        Cliente cliente1 = new Cliente("Juan", "Pérez", "1123456789");
        Metodo_Pago pago1 = new Efectivo();

        Computadora pc1 = new Computadora(cpu1);
        pc1.agregarPeriferico(teclado1);
        pc1.agregarPeriferico(mouse1);
        pc1.agregarPeriferico(pantalla1);

        System.out.println("Stock de CPU Intel antes de la compra: " + cpu1.getStock());
        tienda.realizarCompra(cliente1, pc1, pago1);
        System.out.println("Stock de CPU Intel después de la compra: " + cpu1.getStock());

        Cliente cliente2 = new Cliente("Ana", "Gómez", "1198765432");
        Metodo_Pago pago2 = new Tarjeta("4517-1234-5678-9999", "Banco Galicia", Tipo_Tarjeta.CREDITO);

        Computadora pc2 = new Computadora(cpu2);
        pc2.agregarPeriferico(mouse1);
        pc2.agregarPeriferico(impresora1);

        tienda.realizarCompra(cliente2, pc2, pago2);

        System.out.println("\nIntentando comprar sin cumplir periféricos mínimos:");
        Computadora pc3 = new Computadora(cpu1);
        pc3.agregarPeriferico(teclado1);
        tienda.realizarCompra(cliente1, pc3, pago1);

        System.out.println("\n-- CALCULAR PRECIO TOTAL DE LA COMPUTADORA --");
        double precio1 = pc1.calcularPrecioComponentes();
        double precio2 = pc2.calcularPrecioComponentes();
        System.out.println("Precio total de los componentes de la pc1: $" + precio1);
        System.out.println("Precio total de los componentes de la pc2: $" + precio2);

        System.out.println("\n-- MOSTRAR CANTIDAD DE ENTRADA Y SALIDA POR PC --");
        System.out.println("Análisis de periféricos de PC vendida:");
        Computadora pcEspecifica = tienda.getVentas().get(0).getComputadora();
        pcEspecifica.mostrarCantidadPorTipo();

        System.out.println("\n-- CALCULAR COMPONENTE MÁS VENDIDO --");
        tienda.calcularComponenteMasVendido();

        System.out.println("\n-- DADO UNA COMPRA MOSTRAR SU DETALLE --");

        System.out.println("Detalle de la primera compra registrada (Efectivo):");
        Compra compra1 = tienda.getVentas().get(0);
        compra1.mostrarDetalleCompra();

        System.out.println("Detalle de la segunda compra registrada (Tarjeta de Crédito - Aplica 5%):");
        Compra compra2 = tienda.getVentas().get(1);
        compra2.mostrarDetalleCompra();
    }
}