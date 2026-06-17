package formas;

public class Circulo extends Formas{
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

    @Override
    public double obtenerArea(){
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double obtenerPerimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}