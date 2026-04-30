package vehiculos;

public class Coche {
    private  String marca;
    private  String modelo;
    private  String color;
    private double velocidad;

    public  Coche(String marca,String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public  void  acelerar (double incremento){
        this.velocidad += incremento;
    }

    public void  frenar(){
        this.velocidad = 0;
    }
}