package empresas_negocios.computadoras;
import pagos.Metodo_Pago;
import seres_vivos.Cliente;
import tecnologia.Computadora;
import tecnologia.componentes.Componente;

import java.util.ArrayList;

public class Sistema_Computadoras {
    private ArrayList<Compra> ventas;
    private ArrayList<Componente> catalogoGeneral;

    public Sistema_Computadoras() {
        this.ventas = new ArrayList<>();
        this.catalogoGeneral = new ArrayList<>();
    }

    public ArrayList<Compra> getVentas() { return ventas; }


    public void registrarEnCatalogo(Componente c) {
        catalogoGeneral.add(c);
    }


    public void realizarCompra(Cliente cliente, Computadora comp, Metodo_Pago pago) {
        if (!comp.cumpleMinimoCompra()) {
            System.out.println("ERROR: No se cumple la compra mínima (Falta CPU, un dispositivo de Entrada o de Salida).\n");
            return;
        }

        if (comp.getCpu().getStock() <= 0) {
            System.out.println("ERROR: No hay stock disponible para la CPU elegida.\n");
            return;
        }

        for (Componente c : comp.getPerifericos()) {
            if (c.getStock() <= 0) {
                System.out.println("ERROR: No hay suficiente stock del componente: " + c.getNombreComponente() + "\n");
                return;
            }
        }

        comp.getCpu().setStock(comp.getCpu().getStock() - 1);
        for (Componente c : comp.getPerifericos()) {
            c.setStock(c.getStock() - 1);
        }

        Compra nuevaVenta = new Compra(cliente, comp, pago);
        ventas.add(nuevaVenta);
        System.out.println("¡Compra realizada con éxito!");
    }


    public void calcularComponenteMasVendido() {
        if (ventas.isEmpty()) {
            System.out.println("No se han realizado ventas en el sistema.");
            return;
        }

        Componente masVendido = null;
        int maxVentas = -1;

        for (Componente compCatalogo : catalogoGeneral) {
            int vecesVendido = 0;

            for (Compra v : ventas) {
                Computadora pc = v.getComputadora();

                if (pc.getCpu().equals(compCatalogo)) {
                    vecesVendido++;
                }
                for (Componente p : pc.getPerifericos()) {
                    if (p.equals(compCatalogo)) {
                        vecesVendido++;
                    }
                }
            }

            if (vecesVendido > maxVentas) {
                maxVentas = vecesVendido;
                masVendido = compCatalogo;
            }
        }

        if (masVendido != null) {
            System.out.println("Componente más vendido: " + masVendido.getNombreComponente() + " (Vendido " + maxVentas + " veces)");
        }
    }
}