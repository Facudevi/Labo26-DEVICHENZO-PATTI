package entregas_drones;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Carga droneCarga = new Carga("Dron-Carga-1", LocalDate.of(2023, 5, 10), Bateria.CIEN, EstadoDrone.OPERATIVO, 1, 30);
        Vigilancia droneVigi = new Vigilancia("Dron-Vigilancia-1", LocalDate.of(2026, 2,7), Bateria.CINCUENTA, EstadoDrone.INACTIVO, 1, 100);


        System.out.println("-- PRUEBA DE RASTREO --");
        droneCarga.rastrear();
        droneVigi.rastrear();


        System.out.println("\n-- PRUEBA DE MISIÓN: CARGA --");
        droneCarga.ejecutarMision(-34.603722, -58.381592);
        droneCarga.ejecutarMision(-34.570281, -59.105151);


        System.out.println("\n-- PRUEBA DE MISIÓN: VIGILANCIA --");
        droneVigi.ejecutarMision(-34.603722, -58.381592);
        droneVigi.ejecutarMision(-36.356689, -58.381591);


        System.out.println("\n-- PRUEBA DE RECARGA --");
        System.out.println("Batería actual: " + droneCarga.getBateria() + "%");
        droneCarga.recargar();
        System.out.println("Batería luego de recargar normalmente: " + droneCarga.getBateria() + "%");

        droneCarga.setBateria(Bateria.DIEZ);
        System.out.println("Batería actual: " + droneCarga.getBateria() + "%");
        droneCarga.recargar();
        System.out.println("Batería luego de recargar en estado crítico: " + droneCarga.getBateria() + "%");
    }
}