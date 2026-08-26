package bebidas;

public class Alcoholica extends Bebida {
    private int cant_alcohol;

    public Alcoholica(String nombre, int cant_alcohol) {
        super(nombre, 0, 0);
        this.cant_alcohol = cant_alcohol;
    }


    @Override
    public double calcular_positividad() { return 0; }


    @Override
    public double calcular_negatividad() { return (cant_alcohol * 20); }
}