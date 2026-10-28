package A0;

import java.util.HashSet;

public class Jugador {
    private String nombre;
    private int num;
    private int energiaActual;
    private HashSet<String> historial;
    private int nivelRiesgoActual;
    private boolean eliminado;
    private Prueba pruebaFavorita;

    private static int energia = 100;
    private static int nivelRiesgo = 0;

    public Jugador(String nombre, int num) {
        this.nombre = nombre;
        this.num = num;
        this.energiaActual = energia;
        this.historial = new HashSet<>();
        this.nivelRiesgoActual = nivelRiesgo;
        this.eliminado = false;
        this.pruebaFavorita = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum() {
        return num;
    }

    public int getEnergiaActual() {
        return energiaActual;
    }

    public HashSet<String> getHistorial() {
        return historial;
    }

    public int getNivelRiesgoActual() {
        return nivelRiesgoActual;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public Prueba getPruebaFavorita() {
        return pruebaFavorita;
    }

    public static int getEnergia() {
        return energia;
    }

    public static int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public boolean verificarEnergia() throws RequisitosInvalidosException, JugadorEliminadoException{
        if (eliminado){
            throw new JugadorEliminadoException("El jugador ya se encontraba eliminado");
        }
        if (energiaActual <= 20){
            throw new RequisitosInvalidosException("No tiene energía suficiente para realizar la prueba");
        }
        return true;
    }

    public void consumirEnergia(int cantidad) {
        energiaActual = Math.max(0, energiaActual - cantidad);
    }

    public void recibirDanio(int riesgo, String recompensa, Escenario escenario) {
        nivelRiesgoActual += riesgo;

        if (nivelRiesgoActual >= 100) {
            eliminado = true;
            System.out.println("¡JUGADOR ELIMINADO! " + nombre + " (#" + num + ") superó los 100 puntos de riesgo");
        }
        else {
            String entradaHistorial = recompensa + " en escenario " + escenario;
            historial.add(entradaHistorial);
            System.out.println("¡Prueba superada! Recompensa obtenida: " + recompensa);
        }
    }

    public void elegirPruebaFav(Prueba p) throws PruebaFavoritaException{
        if ((pruebaFavorita != null) && (pruebaFavorita.equals(p))){
            throw new PruebaFavoritaException("La prueba que se escogió ya está elegida como su favorita");
        }
        pruebaFavorita = p;
        System.out.println("Se ha cambiado su prueba favorita");
    }
}