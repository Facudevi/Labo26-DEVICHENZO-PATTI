package submarino;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        int opcion;
        Submarino2 submarino = new Submarino2("ClearWater", 200, 0);
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