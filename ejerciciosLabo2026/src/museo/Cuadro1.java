package museo;

public class Cuadro1 {
    private String titulo;
    private String pintor;
    private int anio;
    private int estado;

    public Cuadro1(String titulo, String pintor, int anio, int estado){
        this.titulo = titulo;
        this.pintor = pintor;
        this.anio = anio;
        this.estado = Math.min(estado, 10);
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnio(){
        return anio;
    }
    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado = Math.min(estado, 10);
    }
}