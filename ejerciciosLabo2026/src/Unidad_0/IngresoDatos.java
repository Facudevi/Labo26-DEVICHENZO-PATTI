package Unidad_0;

public class IngresoDatos {
    public static void main(String[] args) {
        int N = 6;
        double A = 10.37;
        char C = 'J';
        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);

        double suma = N+A;
        System.out.println(N + " + " + A + " = " + suma);

        double diferencia = A-N;
        System.out.println( A + " - " + N + " = " + diferencia);

        int val = (int)C;
        System.out.println("Valor númerico del cáracter " + C + " = " + val);

    }
}
