package formas;

public class Rectangulo extends Formas{
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

    @Override
    public double obtenerArea(){
        double area;
        area = base * altura;
        return area;
    }

    @Override
    public double obtenerPerimetro(){
        double perimetro;
        perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }
}