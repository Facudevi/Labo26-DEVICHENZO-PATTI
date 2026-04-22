package EjerciciosArray;

import java.util.ArrayList;

public class Ej2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList();
        palabras.add("museum");
        palabras.add("non");
        palabras.add("nonStop");
        palabras.add("FreeKapi");
        palabras.add("Afrika");

        for (String palabra : palabras){
            if (palabra.charAt(0) == 'n'){
                System.out.println(palabra);
            }
        }
    }
}