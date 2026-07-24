package sistemas.mascotas;
import seres_vivos.*;

public class Main {
    public static void main(String[] args) {
        Sistema_Mascotas sistema = new Sistema_Mascotas();
        Duenio duenio1 = new Duenio("Carlos", "Gomez");
        Duenio duenio2 = new Duenio("Lucia", "Fernandez");

        Perro perro = new Perro("Firulais", duenio1);
        Gato gato = new Gato("Michi", duenio1);
        Pajaro pajaro = new Pajaro("Pepe", duenio1, true, "cucu");
        Pez pez = new Pez("Nemo", duenio1);

        System.out.println("=== REGISTRO DE MASCOTAS ===");
        sistema.altaMascota(perro);
        sistema.altaMascota(gato);
        sistema.altaMascota(pajaro);
        sistema.altaMascota(pez);

        System.out.println("\n-- PRUEBA DE ALEGRÍA Y ALIMENTACIÓN --");
        sistema.alimentarMascota(gato);
        sistema.alimentarMascota(gato);

        System.out.println("1er saludo:");
        sistema.saludar(gato, duenio1);
        System.out.println("2do saludo:");
        sistema.saludar(gato, duenio1);
        System.out.println("3er saludo:");
        sistema.saludar(gato, duenio1);

        sistema.alimentarMascota(pajaro);
        System.out.println("Saludo del pajaro:");
        sistema.saludar(pajaro, duenio1);


        System.out.println("\n-- PRUEBAS DEL PEZ --");
        System.out.println("Dueño saluda a al pez:");
        sistema.saludar(pez, duenio1);
        System.out.println("Alimentamos al pez");
        sistema.alimentarMascota(pez);

        System.out.println("Un no dueño saluda al pez:");
        sistema.saludar(pez, duenio2);

        System.out.println("Saludar nuevamente:");
        sistema.saludar(pez, duenio1);
    }
}