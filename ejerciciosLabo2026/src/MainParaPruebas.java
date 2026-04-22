import formas.Rectangulo;

public class MainParaPruebas {
    public static void main(String[] args){
        double area, perimetro;
        Rectangulo rectangulo = new Rectangulo(5, 7.2);

        System.out.println("base del rectangulo: " + rectangulo.getBase());
        System.out.println("altura del rectangulo: " + rectangulo.getAltura());
        area = rectangulo.obtenerArea();
        System.out.println("el area es: " + area);
        perimetro = rectangulo.obtenerPerimetro();
        System.out.println("el perimetro es: " + perimetro);
    }
}