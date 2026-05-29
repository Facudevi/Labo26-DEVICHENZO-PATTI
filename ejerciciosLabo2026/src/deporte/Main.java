package deporte;
import fecha.Turno;
import persona.Jugador;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> listaA = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            listaA.add(new Jugador("Gonza", "Diaz", LocalDate.of(1990, 1, 19), "Eslabones 3221", 5));
        }

        ArrayList<Jugador> listaB = new ArrayList<>();
        for (int i = 1; i <= 11; i++) {
            listaB.add(new Jugador("Maria", "Perez", LocalDate.of(1995, 5, 9), "Miller 4029", 7));
        }

        ArrayList<Turno> horarioA = new ArrayList<>(Arrays.asList(Turno.MAÑANA, Turno.NOCHE));
        ArrayList<Turno> horarioB = new ArrayList<>(Arrays.asList(Turno.TARDE, Turno.NOCHE));

        Equipo equipoA = new Equipo(listaA.get(0), horarioA, listaA);
        Equipo equipoB = new Equipo(listaB.get(0), horarioB, listaB);

        Campeonato torneo = new Campeonato();

        System.out.println("--- Intentando programar partido ---");

        String resultado = torneo.agregarPartido(equipoA, equipoB, 1);
        System.out.println("Resultado: " + resultado);
    }
}