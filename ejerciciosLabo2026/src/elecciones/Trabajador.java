package elecciones;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;

public class Trabajador extends Persona implements Mensajero {
    private int cuil;
    private double sueldo;
    private boolean horario;

    public Trabajador(String nombre, String apellido, LocalDate fecha, String direccion, String DNI, int cuil, double sueldo, boolean horario) {
        super(nombre, apellido, fecha, direccion, DNI);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.horario = horario;
    }

    public int getCuil() { return cuil; }
    public double getSueldo() { return sueldo; }
    public boolean isHorario() { return horario; }


    @Override
    public String enviarMensaje() {
        if (!isHorario()) throw new NoPuedeEnviarMensajeException("El/la trabajador/a no puede enviar el mensaje");
        return mensaje();
    }

    @Override
    public String mensaje() {
        return "Yo " + getNombreCompleto() + " te invito a que... Vote por el partido para un mejor futuro";
    }
}