package sistemas.alarmas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Sistema miSistema = new Sistema();

        SensorIndividual humo = new Sensor_Humo(40.0, true, LocalDate.of(2025, 1, 1));
        SensorIndividual temp = new Sensor_Temperatura(30.0, true, LocalDate.of(2024, 5, 10));
        SensorIndividual pres = new Sensor_Presion(100.0, true, LocalDate.of(2026, 2, 20));

        Sensor_Complejo miGrupo = new Sensor_Complejo(50.0);
        miGrupo.agregar(humo);
        miGrupo.agregar(temp);
        miGrupo.agregar(pres);

        miSistema.agregarSensor(humo);
        miSistema.agregarSensor(temp);
        miSistema.agregarSensor(pres);
        miSistema.agregarSensor(miGrupo);

        System.out.println("Iniciando escaneo de sensores...");
        miSistema.recorrerAlarma();
    }
}
