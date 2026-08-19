package bebidas;

public class Azucarada extends Bebida{
    private int cant_azucar;

    public Azucarada(String nombre, double coef_pos, double coef_neg, int cant_azucar) {
        super(nombre, coef_pos, coef_neg);
        this.cant_azucar = cant_azucar;
    }


    @Override
    public double calcular_positividad() { return 1; }


    @Override
    public double calcular_negatividad() { return (getCoef_neg() * 10); }
}