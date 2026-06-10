package deporte;
import seres_vivos.Jugador;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Turno> disponibilidad;
    private ArrayList<Jugador> lista;
    private Jugador capitan;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.disponibilidad = new ArrayList<>();
        this.lista = new ArrayList<>();
        this.capitan = null;
    }

    public String getNombre() { return nombre; }
    public ArrayList<Turno> getDisponibilidad() { return disponibilidad; }
    public ArrayList<Jugador> getLista() { return lista; }
    public Jugador getCapitan() { return capitan; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDisponibilidad(ArrayList<Turno> disponibilidad) { this.disponibilidad = disponibilidad; }
    public void setLista(ArrayList<Jugador> lista) { this.lista = lista; }
    public void setCapitan(Jugador capitan) { this.capitan = capitan; }


    public void agregarTurno(Turno t) {
        boolean existe = false;
        for (Turno turnoActual : disponibilidad) {
            if (turnoActual == t) {
                existe = true;
            }
        }
        if (!existe) {
            disponibilidad.add(t);
        }
    }


    public void agregarJugador(Jugador jugador) {
        if (cantJugadores() >= 11) {
            System.out.println("El equipo ya tiene 11 jugadores.");
        }
        else if (existeCamiseta(jugador.getnCamiseta())) {
            System.out.println("Error: Ya existe un jugador con la camiseta nro " + jugador.getnCamiseta());
        }
        else {
            lista.add(jugador);
        }
    }


    public int cantJugadores() {
        return lista.size();
    }


    public boolean existeCamiseta(int numero) {
        for (Jugador j : lista) {
            if (j.getnCamiseta() == numero) {
                return true;
            }
        }
        return false;
    }


    public boolean tieneAlJugador(Jugador jugador) {
        for (Jugador j : lista) {
            if (j.equals(jugador)) {
                return true;
            }
        }
        return false;
    }


    public boolean comprobarEquipo() {
        if (cantJugadores() != 11) return false;

        if (this.capitan == null || !tieneAlJugador(this.capitan)) return false;

        for (Jugador j1 : lista) {
            int coincidencias = 0;
            for (Jugador j2 : lista) {
                if (j1.getnCamiseta() == j2.getnCamiseta()) {
                    coincidencias++;
                }
            }
            if (coincidencias > 1) return false;
        }

        if (disponibilidad.isEmpty()) return false;

        return true;
    }
}