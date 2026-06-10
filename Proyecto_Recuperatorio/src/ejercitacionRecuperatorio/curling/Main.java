package ejercitacionRecuperatorio.curling;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo> listaEquipos = new ArrayList<>();

        Equipo equipo1 = new Equipo("Boca Juniors");
        Equipo equipo2 = new Equipo("River Plate");
        Equipo equipo3 = new Equipo("San Lorenzo");
        Equipo equipo4 = new Equipo("Independiente");
        Equipo equipo5 = new Equipo("Racing");

        equipo1.agregarTurno(Turno.MAÑANA);
        equipo1.agregarTurno(Turno.TARDE);
        equipo2.agregarTurno(Turno.TARDE);
        equipo2.agregarTurno(Turno.NOCHE);
        equipo3.agregarTurno(Turno.NOCHE);
        equipo4.agregarTurno(Turno.MAÑANA);
        equipo4.agregarTurno(Turno.TARDE);
        equipo4.agregarTurno(Turno.NOCHE);
        equipo5.agregarTurno(Turno.MAÑANA);


        // Hago un for y le pongo nombre y apellido así para probarlo más rápido
        for (int i=1; i <= 11; i++) {
            equipo1.agregarJugador(new Jugador("Jugador" + i, "Diaz", LocalDate.of(2000, 7, 9), i));
            equipo2.agregarJugador(new Jugador("Jugador" + i, "Gomez", LocalDate.of(1998, 3, 13), i));
            equipo3.agregarJugador(new Jugador("Jugador" + i, "Arias", LocalDate.of(2002, 10, 1), i));
            equipo4.agregarJugador(new Jugador("Jugador" + i, "Dominguez", LocalDate.of(1988, 12, 31), i));
            equipo5.agregarJugador(new Jugador("Jugador" + i, "Arias", LocalDate.of(2001, 5, 23), i));
        }


        equipo1.setCapitan(equipo1.getLista().get(0));
        equipo2.setCapitan(equipo2.getLista().get(5));
        equipo3.setCapitan(equipo3.getLista().get(8));
        equipo4.setCapitan(equipo4.getLista().get(10));
        equipo5.setCapitan(equipo5.getLista().get(2));


        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);
        listaEquipos.add(equipo4);
        listaEquipos.add(equipo5);


        Campeonato campeonato = new Campeonato(listaEquipos);

        System.out.println("Generando Fixture...");
        campeonato.generarFixture();

        campeonato.mostrarFixture();
    }
}