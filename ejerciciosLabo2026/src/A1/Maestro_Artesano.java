package A1;

import java.time.LocalDate;

public class Maestro_Artesano extends Ayudante{
    private int tiempoActual;

    private static int tiempoMax = 120;

    public Maestro_Artesano(String nombre, String apellido, LocalDate fechaNacimiento, String aldeaOrigen, Taller taller) {
        super(nombre, apellido, fechaNacimiento, aldeaOrigen, taller);
        this.tiempoActual = tiempoMax;
    }

    public int getTiempoActual() {
        return tiempoActual;
    }

    public static int getTiempoMax() {
        return tiempoMax;
    }

    public void consumirTiempo(int t){
        tiempoActual -= t;
    }

    @Override
    public void prepararEstacion() {
        System.out.println("Calentando herramientas...");
        consumirTiempo(10);
        System.out.println("Tiempo productivo restante: " + tiempoActual);
    }
}