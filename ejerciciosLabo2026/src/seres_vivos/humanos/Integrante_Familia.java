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


    public double obtenerCalorias(){
        double suma = 0;
        for (Map.Entry<Plato_Familia, Integer> entry : platosConsumidos.entrySet()){
            suma += entry.getKey().getCantCalorias() * entry.getValue();
        }
        return suma;
    }


    public int cantidadPlatos(){
        int cant = 0;
        for (Map.Entry<Plato_Familia, Integer> entry : platosConsumidos.entrySet()){
            cant += entry.getValue();
        }
        return cant;
    }


    public double promedioPersona(){
        return obtenerCalorias() / cantidadPlatos();
    }


    public boolean tienePlato(Plato_Familia p){
        if (platosConsumidos.containsKey(p)) return true;
        return false;
    }


    public Plato_Familia platoPreferido() {
        Plato_Familia preferido = null;
        int maxCantidad = 0;
        for (Map.Entry<Plato_Familia, Integer> entry : platosConsumidos.entrySet()) {
            if (entry.getValue() > maxCantidad) {
                maxCantidad = entry.getValue();
                preferido = entry.getKey();
            }
        }
        return preferido;
    }
}