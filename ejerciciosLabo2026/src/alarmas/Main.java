package alarmas;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Sistema miSistema = new Sistema();
        Scanner entrada = new Scanner(System.in);

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

        System.out.println("Ingrese un numero del 0 al " + miSistema.obtenerLongitud() + " para conocer informacion respecto a una sensor: ");
        int num = entrada.nextInt();
        
    }
}
