package EjerciciosArray;

import java.util.ArrayList;

public class EjArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numEnteros = new ArrayList();
        int sumaNum = 0;

        numEnteros.add(97);
        numEnteros.add(1000);
        numEnteros.add(28673);

        for (Integer suma : numEnteros){
            sumaNum = sumaNum + suma;
        }

        System.out.println(sumaNum);
    }
}