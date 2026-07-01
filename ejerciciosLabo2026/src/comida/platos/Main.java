package comida.platos;

import comida.Dificultad;
import comida.Plato;
import sistemas.recetas.Sistema_Recetas;

public class Main {
    public static void main(String[] args){
        Sistema_Recetas sistema = new Sistema_Recetas();
        Plato pp1 = new Plato_Principal("lasagna", Dificultad.MEDIO, Tipo.T_PRINCIPAL, 30, 19);
        Plato pp2 = new Plato_Principal("ceviche", Dificultad.AVANZADO, Tipo.T_PRINCIPAL, 60, 3);
        Plato po = new Postre("flan", Dificultad.FACIL, Tipo.T_POSTRE, 25, false);
        Plato e = new Entrada("empanadas", Dificultad.MEDIO, Tipo.T_ENTRADA, Estado_Entrada.CALIENTE);

        System.out.println("-- INSTRUCCIONES --");
        System.out.println("PLATO PRINCIPAL:");
        System.out.println(pp1);
        System.out.println("POSTRE:");
        System.out.println(po);
        System.out.println("ENTRADA:");
        System.out.println(e);

        sistema.agregarPlato(po);
        sistema.agregarPlato(e);

        sistema.modificarPlato(pp2,pp1);
        sistema.eliminarPlato(pp2);

        sistema.agregarPlato(pp1);

        System.out.println("-- BUSCAR POR DIFICULTAD --");
        sistema.buscarPorDificultad(Dificultad.MEDIO);

        System.out.println("-- FILTRAR RECETAS --");
        sistema.filtrarRecetas(Tipo.T_PRINCIPAL);

        System.out.println("-- CANTIDAD DE RECETAS --");
        sistema.cantidadRecetas();

        System.out.println("-- RECETA CON MÁS PASOS --");
        sistema.mayorCantidadPasos();
    }
}