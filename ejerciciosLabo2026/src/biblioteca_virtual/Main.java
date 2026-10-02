package biblioteca_virtual;
import seres_vivos.humanos.Autor;
import seres_vivos.humanos.Usuario_Libro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Biblioteca_Virtual biblio = new Biblioteca_Virtual();

        Autor a1 = new Autor("Facundo", "De Vichenzo", LocalDate.of(1954,7,4), "18980213");
        Autor a2 = new Autor("Matias", "Patti", LocalDate.of(1972,9,4), "22843565");

        Libro_Electronico l1 = new Libro_Electronico("Alienigenas", a1, Genero.CIENCIA_FICCION, "Alienigenas.pdf");
        Libro_Electronico l2 = new Libro_Electronico("No toqué nada", a2, Genero.NO_FICCION, "No_Toque_Nada.pdf");
        Libro_Electronico l3 = new Libro_Electronico("Leyenda", a1, Genero.SAGA, "Leyendas.pdf");
        Libro_Electronico l4 = new Libro_Electronico("Perrito Faldero", a2, Genero.ROMANCE, "Perrito_Faldero.pdf");

        Usuario_Libro u1 = new Usuario_Libro("Lucca", "Rossatti", LocalDate.of(2008,7,4),"48092312", "lucca@gmail.com", Tipo_Membresia.BRONCE);
        Usuario_Libro u2 = new Usuario_Libro("Facundo", "Feistel", LocalDate.of(2008,9,8),"49129453", "facu@gmail.com", Tipo_Membresia.PLATA);

        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarLibro(l3);
        biblio.agregarLibro(l4);
        biblio.registrarUsuario(u1);
        biblio.registrarUsuario(u2);

        System.out.println("Pedir préstamo de libro");
        try {
            for (int i = 0; i < 6; i++) {
                biblio.prestamo(u1, l1);
                System.out.println("Cantidad descargas disponibles: " + l1.getDescargasDispo() +
                        "\nPréstamos del usuario " + u1.getNombreCompleto() + ": " + u1.cantPrestamos() +
                        " (Máximo de " + u1.getMembresia().getPrestamo() + ")");
            }
        } catch (LimiteDePrestamosAlcanzadoException e){
            System.out.println(e.getMessage());
        } catch (MembresiaException e){
            System.out.println(e.getMessage());
        }
    }
}