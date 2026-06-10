package ejercitacionRecuperatorio.curling;

import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidosProgramados;

    public Campeonato(ArrayList<Equipo> equipos) {
        this.equipos = new ArrayList<>();
        for (Equipo e : equipos) {
            if (e.comprobarEquipo()) {
                this.equipos.add(e);
            } else {
                System.out.println("El equipo '" + e.getNombre() + "' fue rechazado por no cumplir los requisitos.");
            }
        }
        this.partidosProgramados = new ArrayList<>();
    }


    public void generarFixture() {
        ArrayList<Partido> partidosPendientes = new ArrayList<>();

        for (Equipo e1 : equipos) {
            for (Equipo e2 : equipos) {
                if (!e1.equals(e2)) {
                    Partido nuevoPartido = new Partido(e1, e2);

                    if (nuevoPartido.getTurno() == null) {
                        System.out.println("ALERTA: El partido '" + e1.getNombre() + " VS " + e2.getNombre() + "' NO puede programarse por falta de turnos en común.");
                    }
                    else {
                        partidosPendientes.add(nuevoPartido);
                    }
                }
            }
        }

        int diaActual = 1;
        while (!partidosPendientes.isEmpty()) {
            ArrayList<Equipo> equiposQueYaJugaronHoy = new ArrayList<>();
            ArrayList<Partido> partidosRemovidos = new ArrayList<>();

            for (Partido p : partidosPendientes) {
                Equipo e1 = p.getEquipo1();
                Equipo e2 = p.getEquipo2();

                if (!equipoYaJugo(equiposQueYaJugaronHoy, e1) && !equipoYaJugo(equiposQueYaJugaronHoy, e2)) {
                    p.setDia(diaActual);
                    partidosProgramados.add(p);
                    partidosRemovidos.add(p);

                    equiposQueYaJugaronHoy.add(e1);
                    equiposQueYaJugaronHoy.add(e2);
                }
            }

            for (Partido p : partidosRemovidos) {
                partidosPendientes.remove(p);
            }

            diaActual++;
        }
    }


    public boolean equipoYaJugo(ArrayList<Equipo> listaEquipos, Equipo equipo) {
        for (Equipo e : listaEquipos) {
            if (e.equals(equipo)) {
                return true;
            }
        }
        return false;
    }


    public void mostrarFixture() {
        System.out.println("\n-- FIXTURE --");
        if (partidosProgramados.isEmpty()) {
            System.out.println("No hay partidos programados.");
        }
        else {
            for (Partido p : partidosProgramados) {
                System.out.println("Día " + p.getDia() + " | Turno: " + p.getTurno() + " -> " + p.getEquipo1().getNombre() + " VS " + p.getEquipo2().getNombre());
            }
        }
    }
}