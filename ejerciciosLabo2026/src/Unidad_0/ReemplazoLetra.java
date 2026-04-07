package Unidad_0;
import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args){
        String txt = "Ayer me compre muñecos de la marca 'ToyCo' por internet";
        String txtVacio = "";
        System.out.println("Este es el texto original: " + txt);
        System.out.println("Que letra elige para cambiar todas las 'e' del texto?:");
        Scanner input = new Scanner(System.in);
        char letraNueva = input.next().charAt(0);

        for (int i=0; i < txt.length(); i++){
            char letraActual = txt.charAt(i);
            if (letraActual == 'e'){
                txtVacio += letraNueva;
            }
            else{
                txtVacio += letraActual;
            }
        }

        System.out.println("Este es el texto modificado: " + txtVacio);
    }
}