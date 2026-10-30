package A2;

public class Bizcochuelo extends Preparacion{
    private int cantLimon, cantPolvoHornear;

    public Bizcochuelo(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, double precio, int cantLimon, int cantPolvoHornear) {
        super(cantHarina, cantAzucar, cantManteca, cantHuevos, stock, precio);
        this.cantLimon = cantLimon;
        this.cantPolvoHornear = cantPolvoHornear;
    }

    public int getCantLimon() {
        return cantLimon;
    }

    public int getCantPolvoHornear() {
        return cantPolvoHornear;
    }

    @Override
    public String conocerReceta() {
        return "El bizcochuelo arranca con...";
    }
}