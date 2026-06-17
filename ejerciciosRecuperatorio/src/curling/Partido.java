package curling;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private Turno turno;
    private int dia;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.turno = asignarTurnoPrioritario(equipo1, equipo2);
        this.dia = 0;
    }

    public Equipo getEquipo1() {return equipo1;}
    public Equipo getEquipo2() {return equipo2;}
    public Turno getTurno() {return turno;}
    public int getDia() {return dia;}

    public void setEquipo1(Equipo equipo1) { this.equipo1 = equipo1; }
    public void setEquipo2(Equipo equipo2) { this.equipo2 = equipo2; }
    public void setTurno(Turno turno) { this.turno = turno; }
    public void setDia(int dia) { this.dia = dia; }


    private Turno asignarTurnoPrioritario(Equipo equipo1, Equipo equipo2) {
        for (Turno t : Turno.values()) {
            boolean equipo1Disp = false;
            for (Turno t1 : equipo1.getDisponibilidad()) {
                if (t1.equals(t)) {
                    equipo1Disp = true;
                }
            }

            boolean equipo2Disp = false;
            for (Turno t2 : equipo2.getDisponibilidad()) {
                if (t2.equals(t)) {
                    equipo2Disp = true;
                }
            }

            if (equipo1Disp && equipo2Disp) {
                return t;
            }
        }
        return null;
    }
}