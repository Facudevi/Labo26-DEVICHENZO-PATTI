package familia;
import seres_vivos.humanos.Integrante_Familia;

import java.util.HashSet;

public class Familia {
    private HashSet<Integrante_Familia> listaFamilia;

    public Familia() {
        this.listaFamilia = new HashSet<>();
    }


    public void agregarIntegrante(Integrante_Familia integrante){
        if (listaFamilia.contains(integrante)){
            System.out.println("Ya se encuentra en la familia");
        }
        else {
            listaFamilia.add(integrante);
        }
    }


    public void eliminarIntegrante(Integrante_Familia integrante){
        if (!listaFamilia.contains(integrante)){
            System.out.println("No se encuentra en la familia");
        }
        else {
            listaFamilia.remove(integrante);
        }
    }


    public void registrarConsumo(Integrante_Familia integrante, Plato_Familia plato){
        if (!listaFamilia.contains(integrante)){
            System.out.println("El integrante no se encentra en la familia");
        }
        else {
            integrante.agregarRegistro(plato);
        }
    }


    public Integrante_Familia menosCalorias(){
        Integrante_Familia menorC = null;
        for (Integrante_Familia integrante : listaFamilia){
            if (menorC == null || menorC.obtenerCalorias() > integrante.obtenerCalorias()){
                menorC = integrante;
            }
        }
        return menorC;
    }
}