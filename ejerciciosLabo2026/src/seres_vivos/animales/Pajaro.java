package seres_vivos.animales;

import seres_vivos.Duenio;

public class Pajaro extends Mascota {
    private boolean esCantor;
    private String canto;

    public Pajaro(String nombre, Duenio duenio, boolean esCantor, String canto) {
        super(nombre, duenio);
        this.esCantor = esCantor;
        this.canto = canto;
    }


    @Override
    public String saludo() {
        String sonido = esCantor ? canto : "pio";
        return generarSaludoAlegria(sonido);
    }


    @Override
    public String getTipo() { return "Pajaro"; }


    @Override
    public void alimentar() { setAlegria(getAlegria() + 1); }


    @Override
    public void saludar(Duenio nombreD) {
        if (this.getDuenio().equals(nombreD)) {
            System.out.println(saludo());
            if (getAlegria() > 1) {
                setAlegria(getAlegria() - 1);
            }
        }
    }
}