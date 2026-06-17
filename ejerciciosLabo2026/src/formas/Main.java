package formas;

public class Main {
    public static void main(String[] args){
        double area;
        double perimetro;

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(9);
        Rectangulo rectangulo1 = new Rectangulo(5, 7.2);

        area = circulo1.obtenerArea();
        perimetro = circulo1.obtenerPerimetro();
        System.out.println("El area del circulo 1 es " + area + " y el perimetro es " + perimetro);
        area = circulo2.obtenerArea();
        perimetro = circulo2.obtenerPerimetro();
        System.out.println("El area del circulo 2 es " + area + " y el perimetro es " + perimetro);

        System.out.println("base del rectangulo: " + rectangulo1.getBase());
        System.out.println("altura del rectangulo: " + rectangulo1.getAltura());
        area = rectangulo1.obtenerArea();
        System.out.println("el area es: " + area);
        perimetro = rectangulo1.obtenerPerimetro();
        System.out.println("el perimetro es: " + perimetro);

    }
}
