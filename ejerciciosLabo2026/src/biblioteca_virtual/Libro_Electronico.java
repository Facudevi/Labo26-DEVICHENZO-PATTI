package biblioteca_virtual;

import seres_vivos.humanos.Autor;

public class Libro_Electronico {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String archivoPDF;
    private int descargasDispo;
    private static int descargas = 145;

    public Libro_Electronico(String titulo, Autor autor, Genero genero, String archivoPDF) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.archivoPDF = archivoPDF;
        this.descargasDispo = descargas;
        autor.agregarLibroBibliografia(this);
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public Genero getGenero() { return genero; }
    public String getArchivoPDF() { return archivoPDF; }
    public int getDescargasDispo() { return descargasDispo; }

    public void setDescargasDispo(int descargasDispo) { this.descargasDispo = descargasDispo; }
}