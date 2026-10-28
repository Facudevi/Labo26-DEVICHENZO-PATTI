package A0;

public class Prueba_Avanzada extends Prueba implements Jugable{
    private static int nivelMinimo = 30;

    public Prueba_Avanzada(String nombre, int dificultad, String recompensa, Escenario escenario) {
        super(nombre, dificultad, recompensa, escenario);
    }

    public static int getNivelMinimo() {
        return nivelMinimo;
    }

    @Override
    public String frase() {
        return "Pruebas que están mas o menos dificiles";
    }

    @Override
    public int calcularCostoEnergia() {
        return 50;
    }

    @Override
    public int danio() {
        return getDificultad()*3;
    }

    @Override
    public void realizarPrueba(Jugador jugador) throws RequisitosInvalidosException, JugadorEliminadoException {
        jugador.verificarEnergia();
        if (jugador.getNivelRiesgoActual() < 30){
            throw new RequisitosInvalidosException("No cumple con el nivel minimo de riesgo");
        }
        jugador.consumirEnergia(calcularCostoEnergia());
        jugador.recibirDanio(danio(), getRecompensa(), getEscenario());
        System.out.println(jugador.getNombre() + " (#" + jugador.getNum() + ") | Energia: " + jugador.getEnergiaActual() + " | Nivel de riesgo: " + jugador.getNivelRiesgoActual());
    }
}