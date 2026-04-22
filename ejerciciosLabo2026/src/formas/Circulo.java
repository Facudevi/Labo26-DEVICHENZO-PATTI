package formas;

public class Circulo {
    private float radio;

    public Circulo(){
        this.radio = 3;
    }
    public Circulo(float radio){
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio){
        this.radio = radio;
    }

    public double obtenerArea(){
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double obtenerPerimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    public static void main(String[] args){
        double area;
        double perimetro;

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(9);

        area = circulo1.obtenerArea();
        perimetro = circulo1.obtenerPerimetro();
        System.out.println("El area del circulo 1 es " + area + " y el perimetro es " + perimetro);
        area = circulo2.obtenerArea();
        perimetro = circulo2.obtenerPerimetro();
        System.out.println("El area del circulo 2 es " + area + " y el perimetro es " + perimetro);
    }
}