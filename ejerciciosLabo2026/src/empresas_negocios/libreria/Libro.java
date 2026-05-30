package empresas_negocios.libreria;
import fecha.Fecha;
import seres_vivos.Persona;

import java.time.LocalDate;

public class Libro {
    private String nombre;
    private Persona autor;
    private String isbn;
    private  int cantidadHojas;
    private Editorial editorial;
    private Fecha fechaPublicacion;

    public Libro(String nombre, Persona autor, String isbn, int cantidadHojas, Editorial editorial, Fecha fechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public  Libro(Persona autor, String isbn, int cantidadHojas, Editorial editorial, Fecha fechaPublicacion){
        this.nombre = "las aventuras de pepe";
        this.autor = autor;
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.editorial = Editorial.KAPELUSZ;
        this.fechaPublicacion = fechaPublicacion;
    }
    public  Libro(String isbn,int cantidadHojas, Editorial editorial, Fecha fechaPublicacion){
        this.nombre = "las aventuras de pepe";
        this.autor = new Persona("pepe","sanchez", LocalDate.of(1998, 4, 19),"Bolivia 3555");
        this.isbn = isbn;
        this.cantidadHojas = cantidadHojas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }
    public Persona getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getCantidadHojas() {
        return cantidadHojas;
    }
    public Editorial getEditorial() { return editorial; }
    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }
    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean esMasNuevo(Libro libro){
        return  this.fechaPublicacion.menorQue(libro.fechaPublicacion);
    }

    public void mostrarEditoriales(){
        Editorial[] todas = Editorial.values();
        for (Editorial edi : todas){
            System.out.println(edi);
        }
    }

    public  static  void main(String[] args){
        Libro libro = new Libro("0001278432021",30, Editorial.ALIANZA, new Fecha());
        System.out.println(libro.getCantidadHojas());

        libro.mostrarEditoriales();
    }
}