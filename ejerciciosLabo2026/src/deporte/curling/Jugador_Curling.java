package deporte.curling;
import deporte.futbol.NoCumpleRequisitosException;
import seres_vivos.humanos.Jugador;

import java.time.LocalDate;

public class Jugador_Curling extends Jugador {
    public Jugador_Curling(String nombre, String apellido, LocalDate fecha, int nCamiseta) {
        super(nombre, apellido, fecha, nCamiseta);
    }

    @Override
    public void requisitosRenovar() {
        return;
    }

    @Override
    public void requisitosContratar() throws NoCumpleRequisitosException {
        return;
    }
}