package deporte;
import seres_vivos.Jugador;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();

        Equipo equipo1 = new Equipo("Curling Covers");
        Equipo equipo2 = new Equipo("Plate Cambridge");
        Equipo equipo3 = new Equipo("Blue Hawks");
        Equipo equipo4 = new Equipo("Boston Warriors");
        Equipo equipo5 = new Equipo("Racing Club");

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

        equipo1.setCapitan(equipo1.getListaJugadores().get(0));
        equipo2.setCapitan(equipo2.getListaJugadores().get(5));
        equipo3.setCapitan(equipo3.getListaJugadores().get(8));
        equipo4.setCapitan(equipo4.getListaJugadores().get(10));
        equipo5.setCapitan(equipo5.getListaJugadores().get(2));

        campeonato.agregarEquipo(equipo1);
        campeonato.agregarEquipo(equipo2);
        campeonato.agregarEquipo(equipo3);
        campeonato.agregarEquipo(equipo4);
        campeonato.agregarEquipo(equipo5);
        campeonato.agregarEquipo(equipo3);

        System.out.println("\nGenerando Fixture...");
        campeonato.generarFixture();

        campeonato.mostrarFixture();
    }
}