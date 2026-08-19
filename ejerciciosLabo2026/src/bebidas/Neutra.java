package bebidas;

public class Neutra extends Bebida{
    public Neutra(String nombre, double coef_pos, double coef_neg) {
        super(nombre, coef_pos, coef_neg);
    }


    @Override
    public double calcular_positividad() { return getCoef_pos(); }


    @Override
    public double calcular_negatividad() { return getCoef_neg(); }
}