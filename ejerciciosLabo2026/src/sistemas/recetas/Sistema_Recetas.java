package sistemas.recetas;
import comida.Dificultad;
import comida.Plato;

import java.util.ArrayList;

public class Sistema_Recetas {
    private ArrayList<Plato> listaRecetas;

    public Sistema_Recetas() {
        this.listaRecetas = new ArrayList<>();
    }

    public ArrayList<Plato> getListaRecetas() { return listaRecetas; }
    public void setListaRecetas(ArrayList<Plato> listaRecetas) { this.listaRecetas = listaRecetas; }


    public void agregarPlato(Plato plato){ //Plato p1 = new Entrada()
        if(!listaRecetas.contains(plato)){
            listaRecetas.add(plato);
            System.out.println("Agregado con exito");
        }
        else {
            System.out.println("Ya se encuentra en la lista");
        }
    }


    public void eliminarPlato(Plato plato){
        if(listaRecetas.contains(plato)){
            listaRecetas.remove(plato);
            System.out.println("Eliminado con exito");
        }
        else {
            System.out.println("No se encuentra en la lista");
        }
    }


    public boolean modificarPlato(Plato nuevoP, Plato viejoP){
        if(!this.listaRecetas.contains(viejoP)){
            return  false;
        }
        listaRecetas.set(this.listaRecetas.indexOf(viejoP),nuevoP);
        return  true;
    }


    public void buscarPorDificultad(Dificultad dificultad){
        for(Plato p : listaRecetas){
            if (p.getDificultad().equals(dificultad)){
                System.out.println(p);
            }
        }
    }


    public void filtrarRecetas(){

    }


    public int cantidadRecetas(){
        return listaRecetas.size();
    }


    public Plato mayorCantidadPasos(){
        Plato mayor = null;
        for (Plato p : listaRecetas){
            if(mayor == null )
        }
    }


}