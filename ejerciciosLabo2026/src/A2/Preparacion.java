package A2;

public abstract class Preparacion {
    private int cantHarina, cantAzucar, cantManteca, cantHuevos;
    private int stock;
    private double precio;

    public Preparacion(int cantHarina, int cantAzucar, int cantManteca, int cantHuevos, int stock, double precio) {
        this.cantHarina = cantHarina;
        this.cantAzucar = cantAzucar;
        this.cantManteca = cantManteca;
        this.cantHuevos = cantHuevos;
        this.stock = stock;
        this.precio = precio;
    }

    public int getCantHarina() {
        return cantHarina;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public int getCantManteca() {
        return cantManteca;
    }

    public int getCantHuevos() {
        return cantHuevos;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract String conocerReceta();

    public boolean comprobarIngredientes(){
        if ((cantHarina < 1) || (cantAzucar < 1) || (cantManteca < 1) || (cantHuevos < 1)) return false;
        return true;
    }

    public void reponer(int s){
        this.stock += s;
    }
}