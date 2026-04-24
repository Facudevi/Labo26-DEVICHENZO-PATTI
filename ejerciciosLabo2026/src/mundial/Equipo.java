package mundial;

import java.util.ArrayList;

public class Equipo {
    private ArrayList <Jugador> jugadores;
    private ArrayList <String> turno;

    public Equipo(ArrayList<Jugador> jugadores, ArrayList<String> turno) {
        this.jugadores = jugadores;
        this.turno = turno;
    }

    public ArrayList<Jugador> getJugadores() { return jugadores; }
    public void setJugadores(ArrayList<Jugador> jugadores) { this.jugadores = jugadores; }

    public ArrayList<String> getTurno() { return turno; }
    public void setTurno(ArrayList<String> turno) { this.turno = turno; }

    public void agregarJugador(Jugador jugador){
        boolean esta = false;
        for (Jugador original : jugadores) {
            if (jugador.getnCamiseta() == (original.getnCamiseta())){
                esta = true;
            }
        }

        if (!esta){
            this.jugadores.add(jugador);
        }
    }

    public int cantidad(){ return jugadores.size(); }

    public int cantCapitan(){
        int cont = 0;
        for (Jugador jugadores : jugadores){
            if (jugadores.getEsCapitan()){
                cont ++;
            }
        }
        return cont;
    }


    public boolean validarEquipo(){
        if (this.cantidad() != 11 || this.cantCapitan() != 1 || this.turno.isEmpty()){
            return false;
        }

        return true;
    }







}
