package seres_vivos.humanos;
import familia.Plato_Familia;
import seres_vivos.humanos.personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Integrante_Familia extends Persona {
    private HashMap<Plato_Familia, Integer> platosConsumidos;

    public Integrante_Familia(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
        this.platosConsumidos = new HashMap<>();
    }

    public HashMap<Plato_Familia, Integer> getPlatosConsumidos() { return platosConsumidos; }

    public void agregarRegistro(Plato_Familia plato){
        if (platosConsumidos.containsKey(plato)){
            platosConsumidos.put(plato, platosConsumidos.get(plato) + 1);
        }
        else {
            platosConsumidos.put(plato, 1);
        }
    }


    public int obtenerCalorias(){
        int suma = 0;
        for (Map.Entry<Plato_Familia, Integer> entry : platosConsumidos.entrySet()){
            
        }
    }
}