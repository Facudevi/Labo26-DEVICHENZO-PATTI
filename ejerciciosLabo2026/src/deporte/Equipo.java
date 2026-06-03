package deporte;
import fecha.Turno;
import seres_vivos.Jugador;
import java.util.ArrayList;

public class Equipo {
    private ArrayList <Jugador> jugadores;
    private ArrayList<Turno> horariosJuego;
    private Jugador capitan;

    public Equipo(Jugador capitan, ArrayList<Turno> horarioJuego, ArrayList<Jugador> jugadores) {
        int coincide = 0;
        for (Jugador p: jugadores) {
            if(this.estaEnUso(p.getnCamiseta(), p, jugadores)){
                coincide+=1;
            }
        }
        if(coincide == 0 && jugadores.size() == 11){
            this.jugadores = jugadores;
            this.setCapitan(capitan);
        }
        if(this.esHorarioValido(horarioJuego)) {
            this.horariosJuego = horarioJuego;
        }
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public ArrayList<Turno> getHorarioJuego() {
        return horariosJuego;
    }
    public Jugador getCapitan() {
        return capitan;
    }

    public void setHorarioJuego(ArrayList<Turno> horarioJuego) {
        this.horariosJuego = horarioJuego;
    }

    public void setCapitan(Jugador capitan) {
        if(this.jugadores.contains(capitan)) {
            this.capitan = capitan;
        }
    }

    public  boolean estaEnUso(int numCamisa, Jugador jugador, ArrayList<Jugador> jugadores){
        boolean coincide = false;
        for(Jugador p: jugadores) {
            coincide = p.getnCamiseta() == numCamisa;
            if(coincide && !p.equals(jugador)){
                return coincide;
            }
        }
        return  coincide;
    }

    public boolean hasHorarioJuego(Turno horario){
        return  this.horariosJuego.contains(horario);
    }

    private boolean esHorarioValido(ArrayList<Turno> horarios){
        ArrayList<Turno> Disphorarios = new ArrayList<>();
        Disphorarios.add(Turno.MAÑANA);
        Disphorarios.add(Turno.TARDE);
        Disphorarios.add(Turno.NOCHE);
        for(Turno hora : horarios){
            if(!(Disphorarios.contains(hora))){
                return  false;
            }
        }
        return  true;
    }

    public String JugarPartido(Equipo equipo,int dia, Campeonato torneo){
        return torneo.agregarPartido(equipo,this,dia);
    }
}