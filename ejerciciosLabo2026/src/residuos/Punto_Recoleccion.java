package residuos;

import java.util.HashMap;

public class Punto_Recoleccion {
    private String direccion;
    private double latitud, longitud;
    private String barrio, nombre;
    private HashMap<Tipo_Residuo, Integer> residuos;

    public Punto_Recoleccion(String direccion, double latitud, double longitud, String barrio, String nombre) {
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.barrio = barrio;
        this.nombre = nombre;
        this.residuos = new HashMap<>();
    }

    public String getDireccion(){ return direccion; }
    public double getLatitud() { return latitud; }
    public double getLongitud() { return longitud; }
    public String getBarrio() { return barrio; }
    public String getNombre() { return nombre; }
    public HashMap<Tipo_Residuo, Integer> getResiduos() { return residuos; }


    public void agregarResiduoPuntoRecoleccion(Tipo_Residuo r, int cant){
        if (residuos.containsKey(r)){
            residuos.put(r, residuos.get(r) + cant);
            System.out.println("Se agregó correctamente");
        }
        else{
            residuos.put(r, cant);
            System.out.println("El residuo ya se encontraba, así que se le sumó la nueva cantidad");
        }
    }

    public void modificarResiduoPuntoRecoleccion(Tipo_Residuo vResiduo, Tipo_Residuo nResiduo, int cant){
        if (residuos.containsKey(vResiduo) && !residuos.containsKey(nResiduo)){
            residuos.remove(vResiduo);
            residuos.put(nResiduo, cant);
            System.out.println("Modificado correctamente");
        }
        else System.out.println("No pudo modificarse");
    }

    public void eliminarResiduoPuntoRecoleccion(Tipo_Residuo r){
        if (residuos.containsKey(r)){
            residuos.remove(r);
            System.out.println("Se eliminó correctamente");
        }
        else System.out.println("El residuo no se encuentra en la lista");
    }

    public boolean recibeTipo(Tipo_Residuo r){
        return residuos.containsKey(r);
    }
}