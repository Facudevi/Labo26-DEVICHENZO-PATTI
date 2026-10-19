package bares_dianas;

public abstract class Beneficio {
    public String nombre, usuarioCreador;

    public Beneficio(String nombre, String usuarioCreador) {
        this.nombre = nombre;
        this.usuarioCreador = usuarioCreador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public boolean esTrago(){
        return false;
    }
}