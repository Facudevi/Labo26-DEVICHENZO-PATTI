package A0;

public class Prueba_Mortal extends Prueba{
    private int tiempoReac;

    public Prueba_Mortal(String nombre, int dificultad, String recompensa, Escenario escenario, int tiempoReac) {
        super(nombre, dificultad, recompensa, escenario);
        this.tiempoReac = tiempoReac;
    }

    public int getTiempoReac() {
        return tiempoReac;
    }
}