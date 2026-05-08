package comida;
import persona.Persona;
import persona.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fecha;
    private Plato plato;
    private Persona persona;
    private LocalTime horaEntrega;
    private boolean entregado;

    public Pedido(LocalDate fecha, Plato plato, Persona persona, LocalTime horaEntrega, boolean entregado) {
        this.fecha = fecha;
        this.plato = plato;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public double calcularDescuento(Profesor profesor){
        double precioBase = plato.getPrecio();
        double descuento = (precioBase * profesor.getPorcentajeDesc()) / 100;
        return precioBase - descuento;
    }

    public double calcularPrecioFinal(){
        double pFinal;
        if(persona instanceof Profesor){
            Profesor prof = (Profesor) persona;
            pFinal = calcularDescuento(prof);
        }
        else{
            pFinal = plato.getPrecio();
        }

        return pFinal;
    }


    public LocalDate getFecha() {
        return fecha;
    }
    public Plato getPlato() {
        return plato;
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
    public void setPlato(Plato plato) {
        this.plato = plato;
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
