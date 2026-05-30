package seres_vivos;
import empresas_negocios.vehiculos.Cohete;
import java.time.LocalDate;
import java.util.Scanner;

public class Tecnico extends Persona {
    private String especialidad;
    private Cohete coheteAsig;

    public Tecnico(String nombre, String apellido, LocalDate fecha, String direccion, String especialidad, Cohete coheteAsig) {
        super(nombre, apellido, fecha, direccion);
        this.especialidad = especialidad;
        this.coheteAsig = coheteAsig;
    }

    public String getEspecialidad() {return especialidad;}
    public Cohete getCoheteAsig() {return coheteAsig;}

    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
    public void setCoheteAsig(Cohete coheteAsig) {this.coheteAsig = coheteAsig;}

    public void tecActivar(){
        int cantidad;
        Scanner input = new Scanner(System.in);
        if (coheteAsig == null){
            System.out.println("El tecnico no tiene cohete asignado");
        }
        else {
            System.out.println("Cuantos propulsores desea activar?:");
            cantidad = input.nextInt();
            coheteAsig.activar(cantidad);
        }
    }

    public boolean capacitado(Cohete coheteCambio){
        boolean cambio = false;
        switch (especialidad){
            case "Propulsion":
                if (coheteCambio.getCantP() >= 4){
                    cambio = true;
                }
            case "Navegacion":
                if (coheteCambio.getVelMax() > 28000){
                    cambio = true;
                }
            case "Estructura":
                if (coheteCambio.getLargo() > 70){
                    cambio = true;
                }
        }
        return cambio;
    }

    public void cambiar(Cohete coheteC){
        if (capacitado(coheteC)){
            setCoheteAsig(coheteC);
            System.out.println("El tecnico está capacitado. Su nuevo cohete es " + coheteC.getNombre());
        }
        else {
            System.out.println("No está capacitado para el cohete que se solicita cambiar");
        }
    }
}