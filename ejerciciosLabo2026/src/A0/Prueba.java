package A0;

public class Prueba {
    private String nombre;
    private int dificultad;
    private String recompensa;
    private Escenario escenario;

    public Prueba(String nombre, int dificultad, String recompensa, Escenario escenario) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.recompensa = recompensa;
        this.escenario = escenario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public Escenario getEscenario() {
        return escenario;
    }
}