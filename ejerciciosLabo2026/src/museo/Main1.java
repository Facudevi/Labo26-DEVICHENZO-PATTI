package museo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        List<Cuadro1> inventario = new ArrayList<>();
        inventario.add(new Cuadro1("Mona Lisa", "Da Vinci", 1503, 7));
        inventario.add(new Cuadro1("Guernica", "Picasso", 1937, 4));
        inventario.add(new Cuadro1("Obra Moderna", "Nuevo Artista", 2024, 8));

        List<Restaurador1> restauradores = new ArrayList<>();
        restauradores.add(new Restaurador1("Elena", "Ramos", 12354576, LocalDate.of(1970, 2, 20), 25));
        restauradores.add(new Restaurador1("Carlos", "Sanz", 23542133, LocalDate.of(1999, 12, 18), 3));
        restauradores.add(new Restaurador1("Julia", "López", 98309322, LocalDate.of(1981, 8, 11), 19));

        System.out.println("----JORNADA DE RESTAURACION----");
        for (int i=0; i<inventario.size(); i++){
            Restaurador1 r = restauradores.get(i);
            Cuadro1 c = inventario.get(i);

            String resultado = r.restaurar(c);
            System.out.println(resultado);
        }
    }
}