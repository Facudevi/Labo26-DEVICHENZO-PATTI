package familia;
import comida.Plato;
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
            System.out.println("Se agregó correctamente a la familia");
        }
    }


    public void eliminarIntegrante(Integrante_Familia integrante){
        if (!listaFamilia.contains(integrante)){
            System.out.println("No se encuentra en la familia");
        }
        else {
            listaFamilia.remove(integrante);
            System.out.println("Se eliminó correctamente de la familia");

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


    public Integrante_Familia masCalorias(){
        Integrante_Familia mayorC = null;
        for (Integrante_Familia integrante : listaFamilia){
            if (mayorC == null || mayorC.obtenerCalorias() < integrante.obtenerCalorias()){
                mayorC = integrante;
            }
        }
        return mayorC;
    }


    public double promedioFamilia(){
        int cant = 0;
        double suma = 0;
        for (Integrante_Familia integrante : listaFamilia){
            suma += integrante.obtenerCalorias();
            cant += integrante.cantidadPlatos();
        }
        return suma / cant;
    }


    public HashSet<Integrante_Familia> integrantesComieronPlato(Plato_Familia plato){
        HashSet<Integrante_Familia> lista = new HashSet<>();
        for (Integrante_Familia integrante : listaFamilia){
            if (integrante.tienePlato(plato)){
                lista.add(integrante);
            }
        }
        return lista;
    }


    public HashSet<Plato_Familia> platosDistintosFamilia() {
        HashSet<Plato_Familia> platosDistintos = new HashSet<>();

        for (Integrante_Familia integrante : listaFamilia) {
            for (Plato_Familia plato : integrante.getPlatosConsumidos().keySet()) {
                platosDistintos.add(plato);
            }
        }
        return platosDistintos;
    }


    public Plato_Familia obtenerPlatoPreferido(Integrante_Familia integrante) {
        if (listaFamilia.contains(integrante)) {
            return integrante.platoPreferido();
        }
        System.out.println("El integrante no pertenece a la familia.");
        return null;
    }
}