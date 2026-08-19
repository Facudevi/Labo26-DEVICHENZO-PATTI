package seres_vivos.humanos.personas;
import bebidas.Bebida;

import java.util.ArrayList;

public class Persona_Bebida extends Persona{
    private ArrayList<Bebida> lista_bebida;
    private ArrayList<Integer> cantidad;

    public Persona_Bebida(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.lista_bebida = new ArrayList<>();
        this.cantidad = new ArrayList<>();
    }

    public ArrayList<Bebida> getLista_bebida() { return lista_bebida; }
    public ArrayList<Integer> getCantidad() { return cantidad; }


    public void calcularCoeficiente(){
        double resutado;
        double pos, neg;

        System.out.println(getNombreCompleto() + " consumió:");
        for (int i=0; i < cantidad.size(); i++){
            System.out.println(cantidad.get(i) + " " + lista_bebida.get(i).getNombre());
        }

        for (int i=0; i < cantidad.size(); i++){
            pos = lista_bebida.get(i).calcular_positividad();
            neg = lista_bebida.get(i).calcular_negatividad();
            resultado = cantidad.get()
        }
    }
}