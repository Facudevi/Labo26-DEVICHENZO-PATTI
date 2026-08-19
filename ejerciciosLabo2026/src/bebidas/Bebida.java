package bebidas;

public abstract class Bebida {
    private String nombre;
    private double coef_pos;
    private double coef_neg;

    public Bebida(String nombre, double coef_pos, double coef_neg) {
        this.nombre = nombre;
        this.coef_pos = coef_pos;
        this.coef_neg = coef_neg;
    }

    public String getNombre() { return nombre; }
    public double getCoef_pos() { return coef_pos; }
    public double getCoef_neg() { return coef_neg; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCoef_pos(double coef_pos) { this.coef_pos = coef_pos; }
    public void setCoef_neg(double coef_neg) { this.coef_neg = coef_neg; }


    public abstract double calcular_positividad();
    public abstract double calcular_negatividad();
}