package Unidad_0;

public class DivididoPor {
    public static void main(String[] args) {
        int num;

        for (num = 1; num < 101; num ++){
            if (num % 2 == 0) {
                if (num % 3 == 0) {
                    System.out.println(num);
                }
            }
        }
    }
}