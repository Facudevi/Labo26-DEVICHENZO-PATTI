package prestar;

public abstract class Lectura {
    private String codigo, titulo;
    private int anio;

    public Lectura(String codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }


    @Override
    public String toString(){
        return "Codigo: " + codigo +
                "\n| Titulo: " + titulo +
                "\n| Año: " + anio;
    }
}