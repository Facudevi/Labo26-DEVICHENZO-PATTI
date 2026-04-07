package Unidad_0;

public class Vocales {
    public static void main(String[] args){
        int contador = 0;
        String txt = "Ayer me compre muñecos de la marca 'ToyCo' por internet";
        String txtMinuscula = txt.toLowerCase();

        for (int i=0; i < txtMinuscula.length(); i++){
            char letra = txtMinuscula.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador ++;
            }
        }

        System.out.println("En el texto hay una cantidad de " + contador + " vocales");
    }
}