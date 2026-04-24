package mundial;
import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipo> listaEquipo;
    private ArrayList<Partido> partidos;



    public boolean validar(Equipo equipo1, Equipo equipo2){
        if (equipo1.getTurno().contains("Mañana") && equipo2.getTurno().contains("Mañana")) {
            return true;
        }
        else if (equipo1.getTurno().contains("Tarde") && equipo2.getTurno().contains("Tarde")) {
            return true;
        }
        else if (equipo1.getTurno().contains("Noche") && equipo2.getTurno().contains("Noche")){
            return true;
        }

        return false;
    }

    public String mismoTurno(Equipo equipo1, Equipo equipo2) {




    }

    public void fixture(){
        for (Equipo e1 : listaEquipo){
            for (Equipo e2 : listaEquipo)
                if (validar(e1, e2)) {
                    partidos.add(new Partido(e1, e2, mismoTurno(e1,e2)))
                }
            }
        }
    }















}
