package elecciones;

import java.util.HashSet;

public class Partido_Politico {
    private String nombre, direccion;
    private int cantAfiliados;
    HashSet<Mensajero> listaMensajeros;

    public Partido_Politico(String nombre, String direccion, int cantAfiliados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.listaMensajeros = new HashSet<>();
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public int getCantAfiliados() { return cantAfiliados; }
    public HashSet<Mensajero> getListaMensajeros() { return listaMensajeros; }


    public void agregarMensajero(Mensajero m){
        listaMensajeros.add(m);
    }

    public void hacerCampania(){
        for (Mensajero m : listaMensajeros){
            try {
                System.out.println(m.enviarMensaje());
            } catch (NoPuedeEnviarMensajeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}