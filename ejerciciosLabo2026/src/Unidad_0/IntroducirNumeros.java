package Unidad_0;
import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args){
        int numero;
        int cantidad = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número (si desea parar, ponga -1): ");
            numero = input.nextInt();
            if (numero != -1){
                cantidad ++;
            }
        } while (numero != -1);

        System.out.println("La cantidad de numeros introducidos es " + cantidad);
    }
}