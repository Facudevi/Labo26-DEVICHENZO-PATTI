package deporte.futbol;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Club boca = new Club("Boca Juniors");
        Club river = new Club("River Plate");

        Plantel a1 = new Arquero("Emiliano", "Martínez", LocalDate.of(1992, 9, 2), Posicion.ARQUERO, "Buenos Aires", 1, 75.5, 6);
        Plantel a2 = new Arquero("Juan", "Pérez", LocalDate.of(1998, 5, 10), Posicion.ARQUERO, "Córdoba", 12, 50.0, 15);

        Plantel j1 = new Jugador_Campo("Lionel", "Messi", LocalDate.of(1987, 6, 24), Posicion.DELANTERO, "Santa Fe", 10, 45.0, 18);
        Plantel j2 = new Jugador_Campo("Pol", "Fernández", LocalDate.of(1991, 10, 11), Posicion.MEDIOCAMPISTA, "Santa Fe", 5, 20.0, 5);
        Plantel j3 = new Jugador_Campo("Ángel", "Di María", LocalDate.of(1988, 2, 14), Posicion.DELANTERO, "Santa Fe", 11, 40.0, 12);

        Plantel e1 = new Entrenador("Lionel", "Scaloni", LocalDate.of(1978, 5, 16), "Director Técnico Profesional", 6, 5, true);
        Plantel e2 = new Entrenador("Jorge", "Sampaoli", LocalDate.of(1960, 3, 13), "Técnico Nacional", 10, 6, false);

        Preparador_Fisico pf1 = new Preparador_Fisico("Gustavo", "Silva", LocalDate.of(1985, 11, 12), "Licenciado en Educación Física", 5, "Alto Rendimiento", true);


        System.out.println("-- CONTRATACIONES --");
        try {
            boca.contratar(a1);
            boca.contratar(j1);
            boca.contratar(j3);
            boca.contratar(e1);
            boca.contratar(pf1);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de contratación: " + e.getMessage());
        }


        System.out.println("-- CONTRATACIÓN FALLIDA POR MÉTRICAS INSUFICIENTES --");
        try {
            boca.contratar(a2);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de renovación: " + e.getMessage());
        }

        try {
            boca.contratar(j2);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de renovación: " + e.getMessage());
        }


        System.out.println("-- CONTRATACIÓN FALLIDA POR FALTA DE LICENCIA --");
        try {
            boca.contratar(e2);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de renovación: " + e.getMessage());
        }


        System.out.println("-- CONTRATAR EN UN CLUB DONDE YA TRABAJÓ --");
        try {
            boca.contratar(j1);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de contratación: " + e.getMessage());
        }


        System.out.println("-- RENOVACIONES --");
        try {
            boca.renovar(a1);
            boca.renovar(e1);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de renovación: " + e.getMessage());
        }


        System.out.println("-- RENOVACIÓN FALLIDA POR EDAD --");
        try {
            boca.renovar(j3);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de renovación: " + e.getMessage());
        }


        System.out.println("-- RENOVACIÓN DE ALGUIEN QUE NO PERTENECE AL CLUB --");
        try {
            river.renovar(j1);
        } catch (NoCumpleRequisitosException e) {
            System.out.println("Error de renovación: " + e.getMessage());
        }


        System.out.println("-- MOSTRAR INFORMACIÓN DEL PLANTEL --");
        boca.mostrarInformacionPlantel();
    }
}