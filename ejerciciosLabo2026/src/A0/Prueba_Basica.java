package A0;

public class Prueba_Basica extends Prueba implements Jugable{
    private static int costoEnergia = 10;

    public Prueba_Basica(String nombre, int dificultad, String recompensa, Escenario escenario) {
        super(nombre, dificultad, recompensa, escenario);
    }

    public static int getCostoEnergia() {
        return costoEnergia;
    }

    @Override
    public String frase() {
        return "Pruebas faciles";
    }

    @Override
    public int calcularCostoEnergia() {
        return costoEnergia;
    }

    @Override
    public int danio() {
        return 25;
    }

    @Override
    public void realizarPrueba(Jugador jugador) throws RequisitosInvalidosException, JugadorEliminadoException{
        jugador.verificarEnergia();
        jugador.consumirEnergia(calcularCostoEnergia());
        jugador.recibirDanio(danio(), getRecompensa(), getEscenario());
        System.out.println(jugador.getNombre() + " (#" + jugador.getNum() + ") | Energia: " + jugador.getEnergiaActual() + " | Nivel de riesgo: " + jugador.getNivelRiesgoActual());
    }
}