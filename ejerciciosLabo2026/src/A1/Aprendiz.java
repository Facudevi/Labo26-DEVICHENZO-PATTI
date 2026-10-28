package A1;

import java.time.LocalDate;
import java.util.HashSet;

public class Aprendiz extends Ayudante{
    private HashSet<String> materialesProhibidos;

    private static Tamanio tamanioAceptado = Tamanio.PEQUENIO;

    public Aprendiz(String nombre, String apellido, LocalDate fechaNacimiento, String aldeaOrigen, Taller taller) {
        super(nombre, apellido, fechaNacimiento, aldeaOrigen, taller);
        this.materialesProhibidos = new HashSet<>();
    }

    public HashSet<String> getMaterialesProhibidos() {
        return materialesProhibidos;
    }

    @Override
    public void prepararEstacion() {
        System.out.println("Se han guardado los materiales peligrosos:");
        for (String material : materialesProhibidos){
            System.out.println("- " + material);
        }
    }
}