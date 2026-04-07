package Unidad_0;
import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.println("Digame un día laboral de la siguiente lista: ");
        for (int i=0; i < dias.length; i++){
            System.out.println((i + 1) + "-" + dias[i]);
        }

        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();

        if (dia-1 >= 0 && dia-1 <=4){
            System.out.println("El dia " + dias[dia-1] + " es laboral");
        }
        else if (dia-1 == 5 || dia-1 == 6){
            System.out.println("El dia " + dias[dia-1] + " no es laboral");
        }
        else {
            System.out.println("Esa opcion no es valida, intentelo más tarde");
        }
    }
}