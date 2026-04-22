package formas;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double obtenerArea(){
        double area;
        area = base * altura;
        return area;
    }

    public double obtenerPerimetro(){
        double perimetro;
        perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

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