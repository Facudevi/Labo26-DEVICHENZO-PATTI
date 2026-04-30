package deporte;
import persona.Jugador;
import java.util.ArrayList;

public class Equipo {
    private ArrayList <Jugador> jugadores;
    private ArrayList<String> horariosJuego;
    private Jugador capitan;

    public Equipo(Jugador capitan, ArrayList<String> horarioJuego, ArrayList<Jugador> jugadores) {
        int coincide = 0;
        for (Jugador p: jugadores) {
            if(this.estaEnUso(p.getnCamiseta(),p,jugadores)){
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


    public ArrayList<String> getHorarioJuego() {
        return horariosJuego;
    }

    public void setHorarioJuego(ArrayList<String> horarioJuego) {
        this.horariosJuego = horarioJuego;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        if(this.jugadores.contains(capitan)) {
            this.capitan = capitan;
        }
    }

    public  boolean estaEnUso(int numCamisa, Jugador ignorando, ArrayList<Jugador> jugadores){
        boolean coincide = false;
        for(Jugador p: jugadores) {
            coincide = p.getnCamiseta() == numCamisa;
            if(coincide && !p.equals(ignorando)){
                return coincide;
            }
        }
        return  coincide;
    }
    public boolean hasHorarioJuego(String horario){
        return  this.horariosJuego.contains(horario);
    }

    private boolean esHorarioValido(ArrayList<String> horarios){
        ArrayList<String> Disphorarios = new ArrayList<>();
        Disphorarios.add("mañana");
        Disphorarios.add("tarde");
        Disphorarios.add("noche");
        for(String hora:horarios){
            if(!(Disphorarios.contains(hora.toLowerCase()))){
                return  false;
            }
        }
        return  true;
    }

    public String JugarPartido(Equipo equipo,int dia, Campeonato torneo){
        return torneo.agregarPartido(equipo,this,dia);
    }
}