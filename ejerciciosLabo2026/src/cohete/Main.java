package cohete;
import java.util.Scanner;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int distancia;
        Scanner input = new Scanner(System.in);
        Cohete cohete1 = new Cohete("Jeffrey", 27500, 40, 60, 5);
        Cohete cohete2 = new Cohete("Trempstein", 10500, 80, 50, 8);
        Cohete cohete3 = new Cohete("Castor", 35000, 100, 70, 3);
        Tecnico tec1 = new Tecnico("Facundo", "Gonzalez", LocalDate.of(1980, 5, 18), "Propulsion", cohete1);
        Tecnico tec2 = new Tecnico("Agustin", "Gomez", LocalDate.of(1991, 11, 28), "Navegacion", cohete2);

        tec1.tecActivar();
        System.out.println("Cuanta distancia recorre el cohete?:");
        distancia = input.nextInt();
        System.out.println(cohete3.tiempo(distancia));
        tec1.cambiar(cohete3);
        tec2.cambiar(cohete1);



    }
}
