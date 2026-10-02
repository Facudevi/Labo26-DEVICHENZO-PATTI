package biblioteca_virtual;

import seres_vivos.humanos.Usuario_Libro;

import java.util.HashSet;

public class Biblioteca_Virtual {
    public HashSet<Libro_Electronico> listaLibros;
    public HashSet<Usuario_Libro> listaUsuarios;

    public Biblioteca_Virtual() {
        this.listaLibros = new HashSet<>();
        this.listaUsuarios = new HashSet<>();
    }

    public HashSet<Libro_Electronico> getListaLibros() { return listaLibros; }
    public HashSet<Usuario_Libro> getListaUsuarios() { return listaUsuarios; }


    public void registrarUsuario(Usuario_Libro u){ listaUsuarios.add(u); }

    public void agregarLibro(Libro_Electronico l){ listaLibros.add(l); }
    public void modificarLibro(Libro_Electronico l1, Libro_Electronico l2){
        if (listaLibros.contains(l1) && !listaLibros.contains(l2)){
            listaLibros.remove(l1);
            listaLibros.add(l2);
        }
    }
    public void eliminarLibro(Libro_Electronico l){ listaLibros.remove(l); }

    public void prestamo(Usuario_Libro u, Libro_Electronico l) throws LimiteDePrestamosAlcanzadoException, MembresiaException {
        int limiteMem = u.getMembresia().getPrestamo();

        if (l.getDescargasDispo() < 1){
            throw new LimiteDePrestamosAlcanzadoException("El libro " + l.getTitulo() + " no tiene más prestamos disponibles");
        }
        if (u.cantPrestamos()+1 > limiteMem){
            throw new MembresiaException("El usuario alcanzó su limite de prestamos según su membresía (" + u.getMembresia() + ": " + limiteMem + ")");
        }

        l.setDescargasDispo(l.getDescargasDispo()-1);
        u.getListaPrestamo().add(l);
        System.out.println("Se prestó el libro correctamente");
    }

    public void devolucion(Usuario_Libro u, Libro_Electronico l){
        if (u.getListaPrestamo().contains(l)){
            u.getListaPrestamo().remove(l);
            l.setDescargasDispo(l.getDescargasDispo()+1);
            System.out.println("Se devolvió el libro correctamente");
        }
    }
}