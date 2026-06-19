package empresas_negocios.vehiculos.empresa;
import colores.Color;

import java.time.LocalDate;

public class Main {
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
