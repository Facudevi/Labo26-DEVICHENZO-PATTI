package sistemas.mascotas;
import seres_vivos.humanos.Duenio;
import seres_vivos.animales.Mascota;

import java.util.ArrayList;

public class Sistema_Mascotas {
    private ArrayList<Mascota> listaM;

    public Sistema_Mascotas() {
        this.listaM = new ArrayList<>();
    }


    public void altaMascota(Mascota nuevaMascota) {
        if (listaM.contains(nuevaMascota)) System.out.println("Error: Ya existe esta mascota en la lista");
        else {
            listaM.add(nuevaMascota);
            System.out.println("Nombre mascota: " + nuevaMascota.getNombre() + " | Dueño: " + nuevaMascota.getDuenio().getNombreCompleto() + " | Tipo: " + nuevaMascota.getTipo());
        }
    }


    public void eliminarMascota(Mascota mascota) {
        if (listaM.contains(mascota)) {
            listaM.remove(mascota);
            System.out.println("Mascota eliminada");
        }
        else System.out.println("La mascota no existe en el sistema");
    }


    public void modificarMascota(Mascota mascota, Duenio nuevoDuenio) {
        if (listaM.contains(mascota)) {
            mascota.setDuenio(nuevoDuenio);
            System.out.println("El dueño de " + mascota.getNombre() + " fue actualizado a " + nuevoDuenio.getNombre());
        }
        else System.out.println("La mascota no existe en el sistema");
    }


    public void alimentarMascota(Mascota mascota) {
        if (listaM.contains(mascota)) {
            mascota.alimentar();
            System.out.println(mascota.getNombre() + " fue alimentado/a");
        }
        else System.out.println("No se encontró la mascota en el sistema");
    }


    public void saludar(Mascota mascota, Duenio duenio) {
        if (listaM.contains(mascota)) {
            mascota.saludar(duenio);
            if (!mascota.estaViva()) {
                listaM.remove(mascota);
                System.out.println(mascota.getNombre() + " ha sido eliminado automáticamente del registro");
            }
        }
        else System.out.println("No se encontró una mascota con el nombre: " + mascota.getNombre());
    }
}