package canciones;
import seres_vivos.Persona;

import java.time.LocalDate;

public class Cancion {
    private Persona autor;
    private String titulo;

    public Cancion(){
        this.titulo = "";
        this.autor = new Persona("","", LocalDate.now(), "");
    }
    public Cancion(String titulo, Persona autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Persona getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}