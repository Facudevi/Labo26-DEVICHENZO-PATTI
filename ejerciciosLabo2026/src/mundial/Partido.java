package mundial;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private String turno;

    public Partido(Equipo equipo1, Equipo equipo2, String turno) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.turno = turno;
    }

    public Equipo getEquipo1() { return equipo1; }
    public void setEquipo1(Equipo equipo1) { this.equipo1 = equipo1; }

    public Equipo getEquipo2() { return equipo2; }
    public void setEquipo2(Equipo equipo2) { this.equipo2 = equipo2; }

    public String getHorario() { return turno; }
    public void setHorario(String horario) { this.turno = horario; }









}