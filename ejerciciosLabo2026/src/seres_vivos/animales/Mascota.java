package seres_vivos.animales;

import seres_vivos.humanos.Duenio;

public abstract class Mascota {
    private String nombre;
    private Duenio duenio;
    private int alegria = 1;

    public Mascota(String nombre, Duenio duenio){
        this.nombre = nombre;
        this.duenio = duenio;
    }

    public String getNombre() { return nombre; }
    public Duenio getDuenio() { return duenio; }
    public int getAlegria() { return alegria; }

    public void setDuenio(Duenio duenio) { this.duenio = duenio; }
    public void setAlegria(int alegria) { this.alegria = alegria; }


    public abstract String saludo();
    public abstract String getTipo();
    public abstract void alimentar();
    public boolean estaViva() { return true; }


    public void saludar(Duenio nombreD){
        if (this.duenio.equals(nombreD)) System.out.println(saludo());
        else System.out.println(saludo().toUpperCase() + "!");
    }


    public String generarSaludoAlegria(String textoBase) {
        String resultado = textoBase;
        for(int i = 1; i < this.alegria; i++){
            resultado += " " + textoBase;
        }
        return resultado;
    }
}