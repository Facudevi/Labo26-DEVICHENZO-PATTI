package Unidad_0;
import java.util.Scanner;

public class IntroducirNumeros2 {
    public static void main(String[] args){
        int numero;
        int cantidad = 0;
        int numMayor = 0;
        int numMenor = 0;
        int sumaTotal = 0;
        int sumaPos = 0;
        int sumaNeg = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número (si desea parar, ponga -1): ");
            numero = input.nextInt();
            if (numero != -1) {
                cantidad++;
                if (numero > numMayor) numMayor = numero;
                if (numero < numMenor) numMenor = numero;
                if (numero > 0) sumaPos += numero;
                if (numero < 0) sumaNeg += numero;
                sumaTotal += numero;
            }
        } while (numero != -1);

        System.out.println("La cantidad de numeros introducidos es " + cantidad);
        System.out.println("El mayor numero introducido es: " + numMayor);
        System.out.println("El menor numero introducido es: " + numMenor);
        System.out.println("La suma de todos los positivos introducidos es: " + sumaPos);
        System.out.println("La suma de todos los negativos introducidos es: " + sumaNeg);
        System.out.println("La suma total de todos los numeros introducidos es: " + sumaTotal);
    }
}