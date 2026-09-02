package mediciones;
import seres_vivos.humanos.personas.Persona_Medida;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Sistema_Mediciones sistema = new Sistema_Mediciones();
        Persona_Medida p1 = new Persona_Medida("Juan", "Perez", LocalDate.of(1998, 4, 15));
        LocalDate fecha1 = LocalDate.of(2025, 2, 9);
        LocalDate fecha2 = LocalDate.of(2025, 5, 17);
        LocalDate fecha3 = LocalDate.of(2025, 8, 21);
        LocalDate fecha4 = LocalDate.of(2026, 6, 1);
        LocalDate fecha5 = LocalDate.of(2025,11,20);

        sistema.agregarPersona(p1);


        System.out.println("-- REGISTRO DE MEDICIONES --");
        sistema.registrarMedicion(p1, fecha1, 80.0, 175);
        sistema.registrarMedicion(p1, fecha2, 88.0, 176);
        sistema.registrarMedicion(p1, fecha3, 78.0, 180);
        sistema.registrarMedicion(p1, fecha4, 82.0, 183);


        System.out.println("-- CONSULTAS PUNTUALES POR FECHA --");
        Medicion m1 = p1.medicionFechaPerticular(fecha1);
        if (m1 != null) System.out.println("Peso: " + m1.getPeso() + "kg | Altura: " + m1.getAltura() + "cm");
        else System.out.println("No hay mediciones registradas para la fecha " + fecha1);


        Medicion m2 = p1.medicionFechaPerticular(fecha5);
        if (m2 != null) System.out.println("Peso: " + m2.getPeso() + "kg | Altura: " + m2.getAltura() + "cm");
        else System.out.println("No hay mediciones registradas para la fecha " + fecha5);


        System.out.println("-- PROMEDIOS ANUALES --");
        double promPeso = p1.promedioPesoAnio(2025);
        double promAltura = p1.promedioAlturaAnio(2025);
        System.out.println("Promedio de peso en 2025: " + promPeso + " kg");
        System.out.println("Promedio de altura en 2025: " + promAltura + " cm");


        System.out.println("-- VARIACIÓN ENTRE FECHAS --");
        double variacionP = p1.calcularVariacionPeso(fecha1, fecha2);
        double variacionA = p1.calcularVariacionAltura(fecha2, fecha3);
        System.out.println("Variación de peso entre " + fecha1 + " y " + fecha2 + ": " + variacionP + "%");
        System.out.println("Crecimiento de altura entre " + fecha2 + " y " + fecha3 + ": " + variacionA + "%");

        p1.calcularVariacionPeso(fecha1, fecha5);


        System.out.println("-- FECHAS DE MAYOR Y MENOR PESO --");
        LocalDate fechaMax = p1.registrarFechaMayorPeso();
        LocalDate fechaMin = p1.registrarFechaMenorPeso();

        if (fechaMax != null) System.out.println("Fecha de mayor peso: " + fechaMax + " (" + p1.medicionFechaPerticular(fechaMax).getPeso() + " kg)");
        if (fechaMin != null) System.out.println("Fecha de menor peso: " + fechaMin + " (" + p1.medicionFechaPerticular(fechaMin).getPeso() + " kg)");
    }
}