package empresas_negocios.computadoras;
import pagos.Metodo_Pago;
import seres_vivos.Cliente;
import tecnologia.Computadora;
import tecnologia.componentes.Componente;

import java.util.ArrayList;

public class Sistema_Computadoras {
    private ArrayList<Venta> listaVentas;
    private ArrayList<Componente> componentes;

    public Sistema_Computadoras() {
        this.listaVentas = new ArrayList<>();
        this.componentes = new ArrayList<>();
    }

    public ArrayList<Componente> getComponentes() { return componentes; }
    public ArrayList<Venta> getCompras() { return listaVentas; }

    public void setComponentes(ArrayList<Componente> componentes) { this.componentes = componentes; }
    public void setCompras(ArrayList<Venta> listaVentas) { this.listaVentas = listaVentas; }

    public void actualizarPrecioComponente(int aumento, Componente componente){
        float porcentaje = (float) (componente.getPrecioVenta() * ((float) aumento /100));

        componente.setPrecioVenta(componente.getPrecioVenta() + porcentaje);
    }

    public Venta compra(Cliente cliente, Metodo_Pago metodo, Computadora computadora){
        if (computadora.computadoraValida()){
            if (hayStock(computadora)){
                Venta compra = new Venta(cliente, metodo, computadora);
                actualizarStock(computadora);
                listaVentas.add(compra);
                return compra;
            }
            else {
                System.out.println("No hay stock suficiente en la tienda");
            }
        }
        else {
            System.out.println("Le faltan componentes a la computadora");
        }
        return null;
    }

    public boolean hayStock(Computadora computadora){

        for (Componente componente : computadora.getListaComponentes()){
            int cont=1;
            for (Componente componente1 : computadora.getListaComponentes()){
                if (componente.equals(componente1)){
                    cont++;
                }
            }
            if (componente.getStock()< componente.getStock()-cont){
                return false;
            }
        }
        return true;
    }

    public void actualizarStock(Computadora computadora){
        for (Componente componente : computadora.getListaComponentes()){
            componente.setStock(componente.getStock() - 1);
        }
    }

    public Componente calcularMasVendido(){
        int cont1 = 0;
        Componente top1 = null;

        for(Componente componente : componentes){
            int cont = 0;
            for(Venta compra : listaVentas){

                if (compra.getComputadora().getListaComponentes().contains(componente)){
                    cont ++;
                }
            }

            if (cont > cont1){
                cont1 = cont;
                top1 = componente;
            }
        }
        return top1;
    }

    public void cantEntradaySalida(Computadora computadora){
        String cantDisp = "";

        for (Venta compra : listaVentas){
            if (compra.getComputadora().equals(computadora)){
                cantDisp = computadora.contarDispositivos();
            }
        }
        System.out.println(cantDisp);
    }

    public void componenteMasVendido(){
        if (!listaVentas.isEmpty()){
            Componente top1 = calcularMasVendido();
            System.out.println("El componente mas vendido es: " + top1.getModelo());
        }
    }

    public void mostrarDetalledeCompra(Venta compra){
        System.out.println(compra.detalleCompra());
    }
}