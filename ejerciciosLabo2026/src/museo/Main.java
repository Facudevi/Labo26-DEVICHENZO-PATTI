package museo;
import seres_vivos.Restaurador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Cuadro> inventario = new ArrayList<>();
        inventario.add(new Cuadro("Mona Lisa", "Da Vinci", 1503, Estado_Cuadro.DIEZ));
        inventario.add(new Cuadro("Guernica", "Picasso", 1937, Estado_Cuadro.NUEVE));
        inventario.add(new Cuadro("Obra Moderna", "Nuevo Artista", 2024, Estado_Cuadro.CINCO));

        List<Restaurador> restauradores = new ArrayList<>();
        restauradores.add(new Restaurador("Elena", "Ramos", LocalDate.of(1970, 2, 20), 12354576, 25));
        restauradores.add(new Restaurador("Carlos", "Sanz", LocalDate.of(1999, 12, 18), 23542133, 3));
        restauradores.add(new Restaurador("Julia", "López", LocalDate.of(1981, 8, 11), 98309322, 19));

        System.out.println("-- JORNADA DE RESTAURACION --");
        for (int i=0; i<inventario.size(); i++){
            Restaurador r = restauradores.get(i);
            Cuadro c = inventario.get(i);

            String resultado = r.restaurar(c);
            System.out.println(resultado);
        }
    }
}