package bebidas;

public class Alcoholica extends Bebida {
    private int cant_alcohol;

    public Alcoholica(String nombre, double coef_pos, double coef_neg, int cant_alcohol) {
        super(nombre, coef_pos, coef_neg);
        this.cant_alcohol = cant_alcohol;
    }


    @Override
    public double calcular_positividad() { return 0; }


    @Override
    public double calcular_negatividad() { return (getCoef_neg() * 20); }
}