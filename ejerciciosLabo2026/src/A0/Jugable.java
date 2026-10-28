package A0;

public interface Jugable {
    String frase();
    int calcularCostoEnergia();
    int danio();
    void realizarPrueba(Jugador jugador) throws RequisitosInvalidosException, JugadorEliminadoException;
}