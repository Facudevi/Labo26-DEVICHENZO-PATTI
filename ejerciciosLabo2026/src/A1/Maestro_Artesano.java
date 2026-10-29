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

    @Override
    public void fabricarRegalo(Regalo regalo) throws ProduccionRegalosException {
        int tiempoNecesario = 30;

        if (tiempoActual < tiempoNecesario) {
            throw new ProduccionRegalosException("El Maestro Artesano excede su tiempo disponible para fabricar (" + tiempoActual + " min restantes)");
        }

        tiempoActual -= tiempoNecesario;
        System.out.println("El Maestro Artesano " + getNombre() + " fabricó un regalo " + regalo.getTamanio() + ": " + regalo.getNombre() + " | Tiempo restante: " + tiempoActual + " min");
    }

    @Override
    public void envolverRegalo(Regalo regalo) throws ProduccionRegalosException {
        int tiempoNecesario = 15;

        if (tiempoActual < tiempoNecesario) {
            throw new ProduccionRegalosException("El Maestro Artesano excede su tiempo disponible para envolver (" + tiempoActual + " min restantes)");
        }

        tiempoActual -= tiempoNecesario;
        System.out.println("El Maestro " + getNombre() + " envolvió un regalo " + regalo.getTamanio() + ": " + regalo.getNombre() + " | Tiempo restante: " + tiempoActual + " min");
    }
}