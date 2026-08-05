package seres_vivos.animales;

import seres_vivos.Duenio;

public class Pez extends Mascota {
    private int vidas = 10;

    public Pez(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }

    @Override
    public String saludo() { return ""; }


    @Override
    public String getTipo() { return "Pez"; }


    @Override
    public void alimentar() { this.vidas++; }


    public int getVidas() { return this.vidas; }


    @Override
    public boolean estaViva() {
        return this.vidas > 0;
    }


    @Override
    public void saludar(Duenio nombreD) {
        if (this.getDuenio().equals(nombreD)) {
            this.vidas--;
            System.out.println("El pez hace burbujitas. Vidas restantes: " + this.vidas);
        }
        else {
            this.vidas = 0;
            System.out.println("El pez se asustó con el desconocido y murió");
        }
    }
}