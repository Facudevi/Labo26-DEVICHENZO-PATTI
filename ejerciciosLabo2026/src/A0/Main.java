package A0;

public class Main {
    public static void main(String[] args){
        Sistema sistema = new Sistema();

        Jugador j1 = new Jugador("Juan", 21);
        Jugador j2 = new Jugador("Maria", 15);
        Jugador j3 = new Jugador("Paula", 66);
        Jugador j4 = new Jugador("Nacho", 2);

        Prueba_Basica pb = new Prueba_Basica("Prueba 1", 2, "Inmunidad", Escenario.LUZ_ROJA_LUZ_VERDE);
        Prueba_Avanzada pa = new Prueba_Avanzada("Prueba 2", 10, "Comida de calidad", Escenario.CANICAS);
        Prueba_Mortal pm = new Prueba_Mortal("Prueba 3", 100, "Muchas armas", Escenario.PUENTE_DE_VIDRIO, 123);

        sistema.registrarJugador(j1);
        sistema.registrarJugador(j2);
        sistema.registrarJugador(j3);
        sistema.registrarJugador(j4);

        System.out.println("AGREGAR PRUEBAS");
        try {
            sistema.agregarPrueba(pb);
            sistema.agregarPrueba(pa);
            sistema.agregarPrueba(pm);
            sistema.agregarPrueba(pb);
        } catch (PruebaInvalidaException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nELEGIR PRUEBAS FAVORITAS");
        try {
            j1.elegirPruebaFav(pa);
            j2.elegirPruebaFav(pa);
            j3.elegirPruebaFav(pm);
            j4.elegirPruebaFav(pb);
            j1.elegirPruebaFav(pa);
        } catch (PruebaFavoritaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nREALIZAR PRUEBA: JUGADOR 1");
        try {
            sistema.intentarEjecutarPrueba(j1, pb);
            sistema.intentarEjecutarPrueba(j1, pb);
            sistema.intentarEjecutarPrueba(j1, pa);
            sistema.intentarEjecutarPrueba(j1, pa);
        } catch (PruebaInvalidaException e){
            System.out.println(e.getMessage());
        } catch (JugadorEliminadoException e){
            System.out.println(e.getMessage());
        } catch (RequisitosInvalidosException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nREALIZAR PRUEBA: JUGADOR 2");
        try {
            sistema.intentarEjecutarPrueba(j2, pb);
            sistema.intentarEjecutarPrueba(j2, pa);
        } catch (PruebaInvalidaException e){
            System.out.println(e.getMessage());
        } catch (JugadorEliminadoException e){
            System.out.println(e.getMessage());
        } catch (RequisitosInvalidosException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nCANTIDAD PRUEBAS JUGABLES");
        System.out.println(sistema.cantidadPruebasJugables());
    }
}