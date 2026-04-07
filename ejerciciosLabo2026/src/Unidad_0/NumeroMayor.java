package Unidad_0;

public class NumeroMayor {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("Variable 1: " + num1);
        int num2 = 8;
        System.out.println("Variable 2: " + num2);

        if (num1 > num2) {
            System.out.println("La variable 1 es mayor a la variable 2: " + num1 + " > " + num2);
        }
        else if (num1 < num2) {
            System.out.println("La variable 2 es mayor a la variable 1: " + num2 + " > " + num1);
        }
        else {
            System.out.println("Ambas variables tienen el mismo valor: " + num1 + " = " + num2);
        }
    }
}