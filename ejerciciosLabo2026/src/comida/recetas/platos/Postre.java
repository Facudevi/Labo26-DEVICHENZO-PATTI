package comida.recetas.platos;
import comida.recetas.Dificultad;
import comida.recetas.Plato;

public class Postre extends Plato {
    private double temperatura;
    private boolean apto;

    public Postre(String nombre, Dificultad dificultad, double temperatura, boolean apto) {
        super(nombre, dificultad);
        this.temperatura = temperatura;
        this.apto = apto;
    }

    public double getTemperatura() { return temperatura; }
    public boolean isApto() { return apto; }

    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    public void setApto(boolean apto) { this.apto = apto; }


    @Override
    public void mostrarDetalle() {
        System.out.println("Pasos de preparación: ");
        for (String p : getListaPasos()){
            System.out.println("- " + p);
            System.out.println("RECUERDA: en todo momento mantener la cocina limpia y el horno al mínimo");
        }
    }
}