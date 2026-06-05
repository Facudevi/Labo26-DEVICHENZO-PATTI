package museo;
import seres_vivos.Restaurador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    public String getTitulo() {
        return titulo;
    }
    public int getAnio(){
        return anio;
    }
    public Estado_Cuadro getEstado(){
        return estado;
    }

    public void setEstado(Estado_Cuadro estado){
        this.estado = estado;
    }

    public static void main(String[] args){
        List<Cuadro> inventario = new ArrayList<>();
        inventario.add(new Cuadro("Mona Lisa", "Da Vinci", 1503, Estado_Cuadro.SIETE));
        inventario.add(new Cuadro("Guernica", "Picasso", 1937, Estado_Cuadro.CUATRO));
        inventario.add(new Cuadro("Obra Moderna", "Nuevo Artista", 2024, Estado_Cuadro.OCHO));

        List<Restaurador> restauradores = new ArrayList<>();
        restauradores.add(new Restaurador("Elena", "Ramos", LocalDate.of(1970, 2, 20), "5556", 12354576, 25));
        restauradores.add(new Restaurador("Carlos", "Sanz", LocalDate.of(1999, 12, 18), "Recolida 5555", 23542133, 3));
        restauradores.add(new Restaurador("Julia", "López", LocalDate.of(1981, 8, 11), "Poralin 2819", 98309322, 19));

        System.out.println("----JORNADA DE RESTAURACION----");
        for (int i=0; i<inventario.size(); i++){
            Restaurador r = restauradores.get(i);
            Cuadro c = inventario.get(i);

            String resultado = r.restaurar(c);
            System.out.println(resultado);
        }
    }
}