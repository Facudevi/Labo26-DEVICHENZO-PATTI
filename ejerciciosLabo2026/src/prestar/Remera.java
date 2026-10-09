package prestar;

import colores.Color;

public class Remera extends Prenda implements Prestable{
    private double espalda, contorno, largoTorso;

    public Remera(Color color, Material material, String marca, boolean estado, double espalda, double contorno, double largoTorso) {
        super(color, material, marca, estado);
        this.espalda = espalda;
        this.contorno = contorno;
        this.largoTorso = largoTorso;
    }

    public double getEspalda() { return espalda; }
    public double getContorno() { return contorno; }
    public double getLargoTorso() { return largoTorso; }


    @Override
    public String toString() {
        return super.toString() +
                "MEDIDAS..." +
                "\n| Espalda: " + espalda +
                "\n| Contorno: " + contorno +
                "\n| Torso: " + largoTorso;
    }


    @Override
    public String prestado(){
        try {
            puedePrestarse();
        } catch (CondicionesException e){
            System.out.println(e.getMessage());
        }
        return "La remera se dará prestado";
    }

    @Override
    public boolean puedePrestarse() {
        if (this.isEstado()) throw new CondicionesException("Las condiciones no se cumplen para ser prestado");
        return true;
    }
}