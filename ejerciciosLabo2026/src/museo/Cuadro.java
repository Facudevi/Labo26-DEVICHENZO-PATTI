package museo;

public class Cuadro {
    private String titulo;
    private String pintor;
    private int anio;
    private Estado_Cuadro estado;

    public Cuadro(String titulo, String pintor, int anio, Estado_Cuadro estado){
        this.titulo = titulo;
        this.pintor = pintor;
        this.anio = anio;
        this.estado = estado;
    }

    public String getTitulo() { return titulo; }
    public int getAnio(){ return anio; }
    public Estado_Cuadro getEstado(){ return estado; }

    public void setEstado(Estado_Cuadro estado){ this.estado = estado; }
}