package prestar;

import colores.Color;

public class Pantalon extends Prenda implements Prestable{
    private double cintura, cadera, largo;

    public Pantalon(Color color, Material material, String marca, boolean estado, double cintura, double cadera, double largo) {
        super(color, material, marca, estado);
        this.cintura = cintura;
        this.cadera = cadera;
        this.largo = largo;
    }

    public double getCintura() { return cintura; }
    public double getCadera() { return cadera; }
    public double getLargo() { return largo; }


    @Override
    public String toString() {
        return super.toString() +
                "MEDIDAS..." +
                "\n| Cintura: " + cintura +
                "\n| Cadera: " + cadera +
                "\n| Largo: " + largo;
    }

    @Override
    public String prestado(){
        try {
            puedePrestarse();
        } catch (CondicionesException e){
            System.out.println(e.getMessage());
        }
        return "El pantalón se dará prestado";
    }

    @Override
    public boolean puedePrestarse() {
        if (this.isEstado()) throw new CondicionesException("Las condiciones no se cumplen para ser prestado");
        return true;
    }
}