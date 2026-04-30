package deporte;
import java.util.ArrayList;

public class Campeonato {
    private  ArrayList<Partido> listaPartidos;
    private ArrayList<Equipo> listaEquipos;


    public Campeonato() {
        this.listaPartidos = new ArrayList<>();
        this.listaEquipos = new ArrayList<>();
    }
    private String encontrarMatchHorarios(Equipo equipo1, Equipo equipo2){
        ArrayList<String> horariosE1 = equipo1.getHorarioJuego();
        ArrayList<String> horariosE2 = equipo2.getHorarioJuego();
        if(horariosE1.contains("mañana") && horariosE2.contains("mañana")){
            return  "mañana";
        }
        else if(horariosE1.contains("tarde") && horariosE2.contains("tarde")){
            return  "tarde";
        }
        else if(horariosE1.contains("noche") && horariosE2.contains("noche")){
            return  "noche";
        }
        else {return  "NOT_FOUND";}

    }

    private int esPartidoValido(Equipo equipo1, Equipo equipo2, int fechaPartido){
        if(!(this.listaEquipos.contains(equipo1) && this.listaEquipos.contains(equipo2))){
            return  1;
        }

        if(equipo1 == equipo2){
            return  2;
        }

        for(Partido partido : this.listaPartidos ){
            boolean estaEquipo1 = partido.getEquipo1().equals(equipo1) || partido.getEquipo2().equals(equipo1);
            boolean estaEquipo2 = partido.getEquipo1().equals(equipo2) || partido.getEquipo2().equals(equipo2);
            if(estaEquipo1 && estaEquipo2){
                return  3;
            }
        }

        for (Partido partido: this.listaPartidos){
            boolean estaEquipo1 = partido.getEquipo1().equals(equipo1) || partido.getEquipo2().equals(equipo1);
            boolean estaEquipo2 = partido.getEquipo1().equals(equipo2) || partido.getEquipo2().equals(equipo2);
            if(((estaEquipo1 || estaEquipo2) && (fechaPartido == partido.getFechaPartido()))){
                return  4;
            }
        }
        if(this.encontrarMatchHorarios(equipo1,equipo2).equals("NOT_FOUND")){
            return  5;
        }
        return 0;
    }


    public String agregarPartido(Equipo equipo1,Equipo equipo2,int fecha){
        switch (esPartidoValido(equipo1,equipo2,fecha)){
            case 1:
                return "Caso repetido";
            case 2:
                return  "No se puede enfrentar un equipo con si mismo";
            case 3:
                return "Este partido esta repetido";
            case 4:
                return "uno de los equipos ya juega ese dia";
            case 5:
                return "no hay horarios en comun";
        }

        String matchingFecha = this.encontrarMatchHorarios(equipo1,equipo2);
        Partido partido = new Partido(equipo1,equipo2,fecha,matchingFecha);
        this.listaPartidos.add(partido);
        return  "exito";
    }
}