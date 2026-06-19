package empresas_negocios.vehiculos.empresa;
import colores.Color;
import empresas_negocios.vehiculos.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaVehiculos {
    private String nombre;
    private ArrayList <Vehiculo> flota;

    public EmpresaVehiculos(String nombre) {
        this.nombre = nombre;
        this.flota = new ArrayList<Vehiculo>();
    }

    public boolean agregarVehiculo(Vehiculo v){
        if (v instanceof Vehiculo_Patentado){
            Vehiculo_Patentado nuevoAM = (Vehiculo_Patentado) v;
            for (Vehiculo vehiculo : flota){
                if (vehiculo instanceof Vehiculo_Patentado){
                    Vehiculo_Patentado existenteAM = (Vehiculo_Patentado) vehiculo;
                    if (existenteAM.getPatente().equals(nuevoAM.getPatente())){
                        System.out.println("Error, la patente ya está registrada");
                        return false;
                    }
                }
            }
        }
        flota.add(v);
        return true;
    }

    public void masCantidad(){
        int cantAutos = 0;
        int cantCamionetas = 0;
        int cantBicicletas = 0;

        for (Vehiculo v : flota){
            if (v instanceof Coche){
                cantAutos ++;
            }
            else if (v instanceof Camioneta){
                cantCamionetas ++;
            }
            else {
                cantBicicletas ++;
            }
        }

        System.out.println("Cantidad de Autos: " + cantAutos);
        System.out.println("Cantidad de Camionetas: " + cantCamionetas);
        System.out.println("Cantidad de Bicicletas: " + cantBicicletas);
    }
    
    public void agregarCarga(String patente, double nuevaCarga){
        boolean encontrada = false;

        for (Vehiculo v : flota) {
            if (v instanceof Camioneta) {
                Camioneta c = (Camioneta) v;
                if (c.getPatente().equals(patente)) {
                    encontrada = true;
                    boolean resultado = c.agregaCarga(nuevaCarga);
                    if (resultado) {
                        System.out.println("Carga agregada correctamente. Carga actual: " + c.getCargaActual() + " kg");
                    } else {
                        System.out.println("No se pudo agregar la carga. Supera la capacidad maxima de " + c.getCapCarga() + " kg");
                    }
                }
            }
        }

        if (!encontrada) {
            System.out.println("No se encontro una camioneta con la patente " + patente);
        }
    }

    public double porcentaje(int v1, int v2){
        return (v1 * 100) / v2;
    }

    public void porcentajeDescapotables(){
        int descapotables = 0;
        int totalAutos = 0;
        double resultado;

        for (Vehiculo v : flota) {
            if (v instanceof Coche){
                totalAutos ++;
                Coche nuevoA = (Coche) v;
                if (nuevoA.getDescapotable()){
                    descapotables ++;
                }
            }
        }

        if (descapotables == 0){
            System.out.println("No hay autos descapotables");
        }
        else{
            resultado = porcentaje(descapotables, totalAutos);
            System.out.println("El porcentaje de autos descapotables es: " + resultado);
        }
    }
}