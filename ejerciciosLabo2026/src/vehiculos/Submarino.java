package vehiculos;
import java.util.Scanner;

public class Submarino {
    private String nombre;
    private int profMax;
    private int profundidad;

    public Submarino(String nombre, int profMax, int profundidad){
        this.nombre = nombre;
        this.profMax = profMax;
        this.profundidad = profundidad;
    }

    public int getProfMax() {
        return profMax;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public void emerger(){
        int subir;
        Scanner input = new Scanner(System.in);

        if (profundidad == 0){
            System.out.println("Ya se encuentra en los 0m.\n--------------------");
        }
        else {
            System.out.println("Su profundidad es de " + profundidad);
            System.out.println("Cuántos metros desea subir?:");
            subir = input.nextInt();
            while (profundidad - subir < 0) {
                System.out.println("Ingresar otro valor, sino se pasará de los 0m (imposible): ");
                subir = input.nextInt();
            }

            setProfundidad(profundidad - subir);
            System.out.println("Su profundidad actual es: " + profundidad + "\n--------------------");
        }
    }

    public void sumergir(){
        int bajar;
        Scanner input = new Scanner(System.in);

        if(profundidad == 200){
            System.out.println("Ya se encuentra en el maximo permitido del submarino.\n--------------------");
        }
        else {
            System.out.println("Su profundidad es de " + profundidad);
            System.out.println("Cuántos metros desea bajar?:");
            bajar = input.nextInt();
            while (profundidad + bajar > profMax) {
                System.out.println("¡ALERTA! Si se sumerge esa cantidad de metros, sobrepasará el maximo permitido de " + profMax + ".\nIngrese otro valor accesible:");
                bajar = input.nextInt();
            }

            setProfundidad(profundidad + bajar);
            System.out.println("Su profundidad actual es: " + profundidad + "\n--------------------");
        }
    }

    public static void main(String[] args){
        int opcion;
        Submarino submarino = new Submarino("ClearWater", 200, 0);
        Scanner input = new Scanner(System.in);

        System.out.println("Hola, bienvenido al submarino (profundidad maxima " + submarino.getProfMax() + ")...");
        do{
            System.out.println("Elija que quiere hacer:\n 1- Emerger\n 2- Sumergir\n 3- Salir\n Opción:");
            opcion = input.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("Reingresar una opcion correcta: ");
                opcion = input.nextInt();
            }

            switch (opcion){
                case 1:
                    submarino.emerger();
                    break;
                case 2:
                    submarino.sumergir();
                    break;
            }
        } while (opcion != 3);
        System.out.println("Ha salido del submarino. Nos vemos!");
    }
}