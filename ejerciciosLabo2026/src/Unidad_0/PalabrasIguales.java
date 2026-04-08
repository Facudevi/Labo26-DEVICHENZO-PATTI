package Unidad_0;
import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String pal1;
        String pal2;

        System.out.println("Se le pide ingresar 2 palabras\n" + "Palabra 1:");
        pal1 = input.next();
        System.out.println("Palabra 2:");
        pal2 = input.next();

        if (pal1.equals(pal2)){
            System.out.println("Ambas palabras que escribiste son iguales!");
        }
        else {
            System.out.println("Las palabras que escribiste no son iguales");
        }
    }
}