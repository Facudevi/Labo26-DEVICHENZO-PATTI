package A0;

import java.util.HashSet;

public class Sistema {
    private HashSet<Jugador> jugadores;
    private HashSet<Prueba> pruebas;

    public Sistema() {
        this.jugadores = new HashSet<>();
        this.pruebas = new HashSet<>();
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public HashSet<Prueba> getPruebas() {
        return pruebas;
    }

    public void registrarJugador(Jugador j){
        jugadores.add(j);
    }

    public void agregarPrueba(Prueba p) throws PruebaInvalidaException{
        if (pruebas.contains(p)){
            throw new PruebaInvalidaException("La prueba ya existe en el sistema");
        }
        pruebas.add(p);
        System.out.println("Se agregó la prueba al sistema");
    }

    public int cantidadPruebasJugables() {
        int contador = 0;
        for (Prueba p : pruebas) {
            if (p instanceof Jugable) {
                contador++;
            }
        }
        return contador;
    }

    public void intentarEjecutarPrueba(Jugador j, Prueba p) throws PruebaInvalidaException, RequisitosInvalidosException, JugadorEliminadoException {
        if (!pruebas.contains(p)) {
            throw new PruebaInvalidaException("La prueba no pertenece al juego");
        }
        if (!(p instanceof Jugable)) {
            throw new PruebaInvalidaException("La prueba no puede jugarse actualmente.");
        }

        Jugable pruebaJugable = (Jugable) p;
        System.out.println("Frase de la prueba: " + pruebaJugable.frase());
        pruebaJugable.realizarPrueba(j);
        if (j.isEliminado()) jugadores.remove(j);
    }
}