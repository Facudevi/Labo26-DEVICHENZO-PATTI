package residuos;

import java.time.LocalDate;

public class Registro {
    private LocalDate fechaRegistro;
    private boolean exito;

    public Registro(LocalDate fechaRegistro, boolean exito) {
        this.fechaRegistro = fechaRegistro;
        this.exito = exito;
    }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public boolean isExito() { return exito; }
}