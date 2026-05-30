package vehiculos;
import java.time.LocalDate;

public class Coche extends Vehiculo_Patentado{
    private boolean descapotable;

    public Coche(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabric, double velocidad, String patente, boolean descapotable) {
        super(marca, modelo, color, cantRuedas, fechaFabric, velocidad, patente);
        this.descapotable = descapotable;
    }

    public boolean getDescapotable() {
        return descapotable;
    }
    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void verAuto(){
        System.out.println("--Auto--");
        super.mostrarD();
        if (descapotable){ System.out.println("Descapotable: SI"); }
        else { System.out.println("Descapotable: NO"); }
    }
}