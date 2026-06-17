package canciones;
import seres_vivos.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Persona autor1 = new Persona("David", "Bowie", LocalDate.of(1947, 1, 8), "Street 1440");

        Cancion cancion1 = new Cancion("Starman", autor1);
        Cancion cancion2 = new Cancion("Under Pressure", autor1);
        Cancion cancion3 = new Cancion("Heroes", autor1);

        CD cd1 = new CD();
        cd1.agrega(cancion1);
        cd1.agrega(cancion2);
        cd1.agrega(cancion3);

        System.out.println("-- CANCIONES DEL CD --");
        for (int i=0; i< cd1.getCancion().size(); i++){
            System.out.println(cd1.verCancion(i));
        }

        Cancion cancionNueva = new Cancion("Space Oddity", autor1);
        cd1.grabaCancion(2, cancionNueva);
        System.out.println("-- CD ACTUALIZADO --");
        cd1.listarCanciones();

        cd1.elimina(0);
        System.out.println("-- SE ELIMINA UNA CACION DEL CD --");
        cd1.listarCanciones();
    }
}