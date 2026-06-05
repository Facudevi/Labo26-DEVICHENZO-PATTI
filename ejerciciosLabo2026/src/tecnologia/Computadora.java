package tecnologia;
import tecnologia.componentes.Componente;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componente> listaComponentes;
    private double precioT;

    public Computadora(){
        this.listaComponentes = new ArrayList<>();
        this.precioT= 0;
    }

    public ArrayList<Componente> getListaComponentes() { return listaComponentes; }
    public double getPrecioT() { return precioT; }

    public void setListaComponentes(ArrayList<Componente> listaComponentes) { this.listaComponentes = listaComponentes; }
    public void setPrecioT(double precioT) { this.precioT = precioT; }

    public void aniadirComponente(Componente componente){
        listaComponentes.add(componente);
        this.precioT = calcularPrecio();
    }

    public float calcularPrecio(){
        float total = 0;

        for(Componente componente : listaComponentes){
            total += componente.getPrecioVenta();
        }
        return total;
    }

    public boolean computadoraValida(){
        int cantCPU = 0;
        int cantEntrada = 0;
        int cantSalida = 0;

        for (Componente componente : listaComponentes){
            cantCPU+=componente.esCPU();
            cantEntrada+=componente.esEntrada();
            cantSalida+=componente.esSalida();
        }

        if (cantCPU>0 && cantEntrada>0 && cantSalida>0){
            return true;
        }
        else {
            return false;
        }
    }

    public String detalleComponentes(){
        String detalle = "";

        for (Componente componente : listaComponentes){
            detalle += "- " + componente.getModelo() + " " + componente.getPrecioVenta() + '\n';
        }
        return detalle;
    }

    public String contarDispositivos(){
        int cantEntrada = 0;
        int cantSalida = 0;

        for(Componente componente : listaComponentes){
            cantSalida+=componente.esSalida();
            cantEntrada+=componente.esEntrada();

        }
        return "Salida: " + cantSalida +
               "\nEntrada: " + cantEntrada;
    }



    /*
    private ArrayList<Componente> listaComponentes;

    public Computadora() {
        this.listaComponentes = new ArrayList<>();
    }

    public ArrayList<Componente> getComponentes() { return listaComponentes; }

    public void agregarComponente(Componente comp){
        if (comp.hayStock()){
            comp.reducirStock();
            listaComponentes.add(comp);
        }
    }

    public boolean validarArmado(){
        int cpu = 0;
        int entrada = 0;
        int salida = 0;

        for (Componente c : listaComponentes){
            if (c.esCPU()) cpu++;
            if (c.esEntrada()) entrada++;
            if (c.esSalida()) salida++;
        }
        return ((cpu > 1) && (entrada > 1) && (salida > 1));
    }

    public double calcularSubtotal(){
        double suma = 0;
        for (Componente c : listaComponentes){
            suma += c.getPrecioVenta();
        }
        return suma;
    }

     */
}