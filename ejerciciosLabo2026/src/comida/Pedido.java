package comida;

import persona.Persona;
import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fecha;
    private Persona persona;
    private LocalTime horaEntrega;
    private boolean entregado;

    public Pedido(LocalDate fecha, Persona persona, LocalTime horaEntrega, boolean entregado) {
        this.fecha = fecha;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public Persona getPersona() {
        return persona;
    }
    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }
    public boolean getEntregado() {
        return entregado;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
