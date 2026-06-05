package empresas_negocios.vehiculos.empresa;
import colores.Color;

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




    public static void main(String[] args){
        Coche auto1 = new Coche(Marca.TOYOTA, "Corolla", Color.BLANCO, 4, LocalDate.of(2020, 6, 19), 107.8, "ABC123", false);
        Coche auto2 = new Coche(Marca.BMW, "Serie 3", Color.NEGRO, 4, LocalDate.of(2024, 4, 2), 100.5, "XYZ999", true);
        Coche auto3 = new Coche(Marca.MAZDA, "MX5", Color.ROJO, 4, LocalDate.of(2025, 10, 10), 113.2, "DEF456", true);

        Camioneta camioneta1 = new Camioneta(Marca.FORD, "Ranger", Color.AZUL, 4, LocalDate.of(2025, 10, 10), 90.4, "JKL321", 1000, 300);
        Camioneta camioneta2 = new Camioneta(Marca.CHEVROLET, "S10", Color.BLANCO, 4, LocalDate.of(2025, 9, 15), 99.5, "MNO678", 800, 450);

        Bicicleta bici1 = new Bicicleta(Marca.TREK, "FX3", Color.VERDE, 2, LocalDate.of(2024, 5, 10));
        Bicicleta bici2 = new Bicicleta(Marca.RALEIGH, "Talus", Color.AZUL, 2, LocalDate.of(2021, 7, 25));

        EmpresaVehiculos empresa = new EmpresaVehiculos("Flota Vehicular");
        empresa.agregarVehiculo(auto1);
        empresa.agregarVehiculo(auto2);
        empresa.agregarVehiculo(auto3);
        empresa.agregarVehiculo(camioneta1);
        empresa.agregarVehiculo(camioneta2);
        empresa.agregarVehiculo(bici1);
        empresa.agregarVehiculo(bici2);


        System.out.println("-- Agregar patente existente --");
        empresa.agregarVehiculo(new Coche(Marca.NISSAN, "Kicks", Color.GRIS, 4, LocalDate.of(2022, 12, 7), 115.8, "ABC123", false));

        System.out.println("-- Tipo con mas cantidad --");
        empresa.masCantidad();

        System.out.println("-- Agregar carga --");
        empresa.agregarCarga("JKL321", 600);
        empresa.agregarCarga("JKL321", 500);
        empresa.agregarCarga("MNO678", 800);
        empresa.agregarCarga("AAA333", 100);

        System.out.println("-- Descapotables --");
        empresa.porcentajeDescapotables();

        System.out.println("-- DETALLES DE VEHICULOS --");
        auto3.mostrarDetalleCoche();
        camioneta1.mostrarDetalleCamioneta();
        bici1.mostrarDetalleBicicleta();
    }
}