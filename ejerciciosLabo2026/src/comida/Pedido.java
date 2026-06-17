package comida;
import comida.recetas.Plato;
import seres_vivos.PersonaEducativa;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fecha;
    private Plato plato;
    private PersonaEducativa persona;
    private LocalTime horaEntrega;
    private boolean entregado;

    public Pedido(LocalDate fecha, Plato plato, PersonaEducativa persona, LocalTime horaEntrega, boolean entregado) {
        this.fecha = fecha;
        this.plato = plato;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public double calcularDescuento(){
        double precioBase = plato.getPrecio();
        double descuento = (precioBase * persona.getDescuento()) / 100;
        return precioBase - descuento;
    }

    public double calcularPrecioFinal(){
        double pFinal;
        pFinal = calcularDescuento();
        return pFinal;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public Plato getPlato() {
        return plato;
    }
    public PersonaEducativa getPersonaEducativa() {
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
    public void setPersonaEducativa(PersonaEducativa persona) {
        this.persona = persona;
    }
    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}