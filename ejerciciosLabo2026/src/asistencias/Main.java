package asistencias;
import fecha.Dia;
import seres_vivos.humanos.Empleado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Sistema_Asistencias sistema = new Sistema_Asistencias();
        Empleado e1 = new Empleado("Juan", "Aranda", LocalDate.of(1992, 5, 10), "11111111");
        Empleado e2 = new Empleado("Maria", "Flores", LocalDate.of(1995, 8, 20), "55555555");
        LocalDateTime fecha1 = LocalDateTime.of(2026, 3, 2, 8, 0);
        LocalDateTime fecha2 = LocalDateTime.of(2026, 3, 4, 8, 20);
        LocalDateTime fecha3 = LocalDateTime.of(2026, 3, 6, 8, 5);
        LocalDateTime fecha4 = LocalDateTime.of(2026, 3, 7, 9, 0);

        e1.agregarDia(Dia.LUNES);
        e1.agregarDia(Dia.MIERCOLES);
        e1.agregarDia(Dia.VIERNES);
        e2.agregarDia(Dia.MARTES);
        e2.agregarDia(Dia.JUEVES);

        sistema.agregarEmpleado(e1);
        sistema.agregarEmpleado(e2);
        sistema.agregarEmpleado(e1);


        System.out.println("-- BÚSQUEDA POR LEGAJO --");
        Empleado encontrado = sistema.buscarNumLegajo(1);
        if (encontrado != null) System.out.println("Empleado encontrado: " + encontrado.getNombreCompleto() + " (Legajo N° " + encontrado.getLegajo() + ")");
        else System.out.println("No se encontró un empleado con ese legajo");


        System.out.println("-- REGISTRO DE INGRESOS --");
        sistema.registrarIngreso(e1, fecha1);
        sistema.registrarIngreso(e1, fecha2);
        sistema.registrarIngreso(e1, fecha3);
        sistema.registrarIngreso(e1, fecha4);
        sistema.registrarIngreso(e1, fecha1);
        sistema.registrarIngreso(e2, LocalDateTime.of(2026, 3, 3, 8, 0));
        sistema.registrarIngreso(e2, LocalDateTime.of(2026, 3, 5, 8, 10));
        sistema.registrarIngreso(e2, LocalDateTime.of(2026, 3, 12, 8, 7));


        System.out.println("-- PORCENTAJES DE ASISTENCIA --");
        sistema.porcentajeAsistencia(e1, 3, 2026);
        sistema.porcentajeAsistencia(e2, 3, 2026);


        System.out.println("-- EMPLEADOS QUE SUPERARON EL 80% --");
        ArrayList<Empleado> lista = sistema.obtenerEmpleadosPorcentaje(3, 2026);

        if (lista.isEmpty()) System.out.println("Ningún empleado superó el 80% en el mes indicado.");
        else {
            System.out.println("Empleados con porcentaje de asistencia > 80%:");
            for (Empleado e : lista) {
                System.out.println("N° " + e.getLegajo() + "- " + e.getNombreCompleto());
            }
        }
    }
}