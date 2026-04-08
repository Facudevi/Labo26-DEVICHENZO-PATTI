package Unidad_0;
import java.util.Scanner;

public class MontaniaRusa {
    public static void main(String[] args){
        float altura;
        float suma = 0;
        float altProm;
        int contadorP = 0;
        int alerta = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la montaña rusa, ¡¡¡Disfrute de la atraccion!!!");
        do {
            System.out.println("Altura en metros (minimo permitido 1,40). Ingresar 0 para terminar:");
            altura = input.nextFloat();
            if (altura != 0){
                contadorP ++;
                suma += altura;
                if (altura < 1.40){
                    alerta++;
                }
            }
        } while (altura != 0);

        altProm = suma / contadorP;
        System.out.println("Han ingresado a la atracción " + contadorP + " personas");
        System.out.println("El promedio de altura es " + altProm);
        if (alerta > 0){
            System.out.println("¡ALERTA! Hay " + alerta + " persona/s que no cumple/n con la altura reglamentaria (1,40). Por favor, retirarse de la atracción");
        }
    }
}