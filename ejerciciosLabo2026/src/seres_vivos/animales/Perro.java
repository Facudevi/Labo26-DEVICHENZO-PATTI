package seres_vivos.animales;

import seres_vivos.humanos.Duenio;

public class Perro extends Mascota {
    public Perro(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }


    @Override
    public String saludo() {
        return generarSaludoAlegria("guau");
    }


    @Override
    public String getTipo() { return "Perro"; }


    @Override
    public void alimentar() { setAlegria(getAlegria() + 1); }


    @Override
    public void saludar(Duenio nombreD) {
        super.saludar(nombreD);
        if (getAlegria() > 1) {
            setAlegria(getAlegria() - 1);
        }
    }
}