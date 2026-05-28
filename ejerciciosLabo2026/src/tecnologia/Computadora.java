package tecnologia;

import java.util.ArrayList;

public class Computadora {
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
}