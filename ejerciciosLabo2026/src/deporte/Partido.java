package deporte;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int fechaPartido;
    private Turno horario;

    public Partido(Equipo equipo1, Equipo equipo2, int fechaPartido, Turno horario) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;

        if(fechaPartido < 0){
            this.fechaPartido = 0;
        }
        else {
            this.fechaPartido = fechaPartido;
        }
        this.horario = horario;
    }

    public Equipo getEquipo1() {return equipo1;}
    public Equipo getEquipo2() {return equipo2;}
    public int getFechaPartido() {return fechaPartido;}
    public Turno getHorario() {return horario;}

    public void setEquipo1(Equipo equipo1) {this.equipo1 = equipo1;}
    public void setEquipo2(Equipo equipo2) {this.equipo2 = equipo2;}
    public void setFechaPartido(int fechaPartido) {this.fechaPartido = fechaPartido;}
    public void setHorario(Turno horario) {this.horario = horario;}
}