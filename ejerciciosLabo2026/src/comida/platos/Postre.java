package comida.platos;
import comida.Dificultad;
import comida.Plato;

public class Postre extends Plato {
    private double temperatura;
    private boolean apto;

    public Postre(String nombre, Dificultad dificultad, Tipo tipo, double temperatura, boolean apto) {
        super(nombre, dificultad, tipo);
        this.temperatura = temperatura;
        this.apto = apto;
    }

    public Postre(String nombre, double precio, double temperatura, boolean apto) {
        super(nombre, precio);
        this.temperatura = temperatura;
        this.apto = apto;
    }

    public double getTemperatura() { return temperatura; }
    public boolean isApto() { return apto; }

    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    public void setApto(boolean apto) { this.apto = apto; }


    @Override
    public String toString() {
        String res = "";
        res += ("Pasos de preparación: ");
        for (String p : getListaPasos()) {
            res += "- " + p +
                    "RECUERDA: en todo momento mantener la cocina limpia y el horno al mínimo";
        }
        return res;
    }
}