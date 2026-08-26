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


    public void mostrarCoeficiente(){
        double res = 0;

        System.out.println(this.getNombreCompleto() + " consumió:");
        for (int i=0; i < cantidad.size(); i++){
            System.out.println(cantidad.get(i) + " " + lista_bebida.get(i).getNombre());
        }

        res = calcularCoeficiente();
        System.out.println("Coeficiente de " + this.getNombreCompleto() + ": " + res);
    }


    public double calcularCoeficiente(){
        double resultado = 0;
        double pos, neg;

        for (int i=0; i < cantidad.size(); i++){
            pos = lista_bebida.get(i).calcular_positividad();
            neg = lista_bebida.get(i).calcular_negatividad();
            resultado += cantidad.get(i)*(pos - neg);
        }
        return resultado;
    }


    public Persona_Bebida maxCoef(Persona_Bebida personaMax){
        if(this.calcularCoeficiente() > personaMax.calcularCoeficiente()) return this;
        return personaMax;
    }


    public Persona_Bebida minCoef(Persona_Bebida personaMin){
        if(this.calcularCoeficiente() < personaMin.calcularCoeficiente()) return this;
        return personaMin;
    }


    public void elegirBebida (Bebida bebida, int cant) {
        int indice = lista_bebida.indexOf(bebida);
        if(indice == -1){
            lista_bebida.add(bebida);
            cantidad.add(cant);
        }
        else{
            cantidad.set(indice, cantidad.get(indice) + cant);
        }
    }
}