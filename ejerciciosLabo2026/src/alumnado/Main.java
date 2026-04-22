package alumnado;
import java.time.LocalDate;

public class Main {
    static void main() {
        Alumno alumno1 = new Alumno("Juan", "Pérez", LocalDate.of(2005, 5, 15),);
        Alumno alumno2 = new Alumno("María", "García", LocalDate.of(2003, 10, 20), 10,);

        Materia materia1 = new Materia("Programación Orientada a Objetos","For Each", alumno1);
        Materia materia2 = new Materia("Base de Datos", "Joins", alumno2);

        materia1.AgregarContenido("Archivos");
        materia1.AgregarContenido("Colecciones y Listas");
        materia2.AgregarContenido("Modelado Entidad-Relación");

        System.out.println("--- Inscribiendo alumnos ---");
        materia1.InscribirAlumno(alumno1);
        materia1.InscribirAlumno(alumno2);

        materia2.InscribirAlumno(alumno1);


        alumno1.AgregarNota(8);
        alumno1.AgregarNota(9);
        alumno1.AgregarNota(7);


        System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido());
        System.out.println("Mayor nota: " + alumno1.MayorNota());
        System.out.println("Menor nota: " + alumno1.MenorNota());
        System.out.println("Promedio general: " + alumno1.PromedioNota());

        System.out.println("\n--- Información de la Materia ---");
        System.out.println("Materia: " + materia1.getNombre());
        System.out.println("Promedio de edad en la materia: " + materia1.edadMateria());
        materia1.listarAlumnos();


        Alumno alumnoNuevo = new Alumno("Carlos", "Sánchez", LocalDate.of(2000, 1, 1), 2, materia2);
        System.out.println("Mayor nota (esperado null): " + alumnoNuevo.MayorNota());
        System.out.println("Promedio (esperado 0.0): " + alumnoNuevo.PromedioNota());

        System.out.println("\n--- Materias de " + alumno1.getNombre() + " ---");
        for (Materia m : alumno1.getListaMaterias()) {
            System.out.println("- " + m.getNombre());
        }
    }
}
