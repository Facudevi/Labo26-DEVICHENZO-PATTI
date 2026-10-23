package endocrinologia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Sistema_Pacientes sistema = new Sistema_Pacientes();

        Joven p1 = new Joven("Juan", "Gomez", LocalDate.of(1999, 11,27), "Masculino", Tipo_Sangre.AB_POSITIVO);
        Joven p2 = new Joven("Lautaro", "Martínez", LocalDate.of(1997, 8,11), "Masculino", Tipo_Sangre.O_NEGATIVO);
        Joven p3 = new Joven("Maria", "Paredes", LocalDate.of(2002, 4,23), "Femenino", Tipo_Sangre.B_NEGATIVO);
        Ninio p4 = new Ninio("Josefina", "Álvarez", LocalDate.of(2014, 3,6), "Femenino", Tipo_Sangre.AB_NEGATIVO, Tolerancia.TRES);
        Ninio p5 = new Ninio("Federico", "Carroza", LocalDate.of(2025, 8,14), "Masculino", Tipo_Sangre.O_POSITIVO, Tolerancia.OCHO);
        Ninio p6 = new Ninio("Agostina", "Morón", LocalDate.of(2017, 7,30), "Femenino", Tipo_Sangre.A_POSITIVO, Tolerancia.SIETE);
        Adulto p7 = new Adulto("Eduardo", "Sánchez", LocalDate.of(1978, 1,17), "Masculino", Tipo_Sangre.B_POSITIVO);

        p1.agregarDeporte("Futbol");
        p1.agregarDeporte("Tenis");
        p2.agregarDeporte("Futbol");
        p3.agregarDeporte("Hockey");
        p3.agregarDeporte("Handball");
        p3.agregarDeporte("Basket");

        sistema.agregarPaciente(p1);
        sistema.agregarPaciente(p2);
        sistema.agregarPaciente(p3);
        sistema.agregarPaciente(p4);
        sistema.agregarPaciente(p5);
        sistema.agregarPaciente(p6);
        sistema.agregarPaciente(p7);


        System.out.println("-- AGREGAR AL TRATAMIENTO --");
        try {
            sistema.iniciarTratamiento(p1);
            System.out.println(p1 + " | Costo:" + p1.costo() + " | Sangre objetivo: " + p1.conocerTipoSangre());
            sistema.iniciarTratamiento(p3);
            System.out.println(p3 + " | Costo:" + p3.costo() + " | Sangre objetivo: " + p3.conocerTipoSangre());
            sistema.iniciarTratamiento(p4);
            System.out.println(p4 + " | Costo:" + p4.costo() + " | Sangre objetivo: " + p4.conocerTipoSangre());
            sistema.iniciarTratamiento(p6);
            System.out.println(p6 + " | Costo:" + p6.costo() + " | Sangre objetivo: " + p6.conocerTipoSangre());
        } catch (TratamientoInvalidoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n-- JOVEN QUE NO CUMPLE REQUISITOS --");
        try {
            sistema.iniciarTratamiento(p2);
        } catch (TratamientoInvalidoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n-- NIÑO QUE NO CUMPLE REQUISITOS --");
        try {
            sistema.iniciarTratamiento(p5);
        } catch (TratamientoInvalidoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n-- ADULTO QUIERE TRATAMIENTO --");
        try {
            sistema.iniciarTratamiento(p7);
        } catch (TratamientoInvalidoException e){
            System.out.println(e.getMessage());
        }


        System.out.println("\n-- PACIENTES EN TRATAMIENTO --");
        sistema.mostrarEstadoTratamientos();
        sistema.avanzarTratamiento();
        System.out.println("\n-- PACIENTES EN TRATAMIENTO LUEGO DEL AVANCE--");
        sistema.mostrarEstadoTratamientos();


        System.out.println("\n-- ADULTOS Y GERONTES --");
        System.out.println(sistema.cantPacientesQueNoAplican());
    }

}