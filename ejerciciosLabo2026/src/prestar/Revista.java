package prestar;

import java.time.LocalDate;

public class Revista extends Lectura implements Prestable{
    private LocalDate fechaPub;

    public Revista(String codigo, String titulo, int anio, LocalDate fechaPub) {
        super(codigo, titulo, anio);
        this.fechaPub = fechaPub;
    }

    public LocalDate getFechaPub() { return fechaPub; }


    @Override
    public String toString() {
        return super.toString() +
                "\n| Fecha publicación: " + fechaPub;
    }


    @Override
    public String prestado(){
        try {
            puedePrestarse();
        } catch (CondicionesException e){
            System.out.println(e.getMessage());
        }
        return "El libro se dará prestado";
    }

    @Override
    public boolean puedePrestarse() {
        if (fechaPub.getMonthValue() >= 10) throw new CondicionesException("Las condiciones no se cumplen para ser prestado");
        return true;
    }
}