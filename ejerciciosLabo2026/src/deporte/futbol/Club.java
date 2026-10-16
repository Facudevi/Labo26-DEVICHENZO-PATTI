package deporte.futbol;

import java.util.HashSet;

public class Club {
    private String nombre;
    private HashSet<Plantel> contratados;

    public Club(String nombre) {
        this.nombre = nombre;
        this.contratados = new HashSet<>();
    }

    public String getNombre() { return nombre; }
    public HashSet<Plantel> getContratados() { return contratados; }


    public void RealizarContrato(Plantel p){
        if()

        try {
            p.requisitos();
            System.out.println(p.getNombreCompleto() + " fue contratado por " + nombre);
            contratados.add(p);
        } catch (NoCumpleRequisitosException e) {
            System.out.println(e.getMessage());
        }
    }


}