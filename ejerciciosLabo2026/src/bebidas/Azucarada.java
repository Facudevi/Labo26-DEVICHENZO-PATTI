package bebidas;

public class Azucarada extends Bebida{
    private int cant_azucar;

    public Azucarada(String nombre, int cant_azucar) {
        super(nombre, 1, 0);
        this.cant_azucar = cant_azucar;
    }


    @Override
    public double calcular_positividad() { return 1; }


    @Override
    public double calcular_negatividad() { return (cant_azucar * 10); }
}