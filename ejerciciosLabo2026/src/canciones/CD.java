package canciones;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> cancion;

    public CD(){ this.cancion = new ArrayList<>(); }

    public ArrayList<Cancion> getCancion(){ return cancion; }
    public void setCancion(ArrayList<Cancion> cancion){ this.cancion = cancion; }

    public int numeroCanciones(){
        int contador = 0;
        for (Cancion song : cancion){
            contador ++;
        }
        return contador;
    }

    public String verCancion(int posicion){ return cancion.get(posicion).getTitulo(); }

    public void grabaCancion(int posicion, Cancion nuevaCancion){
        elimina(posicion);
        cancion.add(posicion, nuevaCancion);
    }

    public void agrega (Cancion cancion){ this.cancion.add(cancion); }

    public void elimina (int posicion){ cancion.remove(posicion); }

    public void listarCanciones(){
        for (Cancion c : cancion){
            System.out.println(c.getTitulo());
        }
    }
}