package deporte.futbol;

import java.util.HashSet;

public class Club {
    private String nombre;
    private HashSet<Plantel> plantel;

    public Club(String nombre) {
        this.nombre = nombre;
        this.plantel = new HashSet<>();
    }

    public String getNombre() { return nombre; }
    public HashSet<Plantel> getPlantel() { return plantel; }


    public void contratar(Plantel p) throws NoCumpleRequisitosException{
        if (p.trabajoEnClub(this.nombre)) {
            throw new NoCumpleRequisitosException("No puede ser contratado porque ya trabajó anteriormente en el club");
        }

        p.requisitosContratar();

        plantel.add(p);
        p.agregarClubAlHistorial(this.nombre);
        System.out.println(p.getNombreCompleto() + " fue contratado por " + this.nombre);
    }


    public void renovar(Plantel p) throws NoCumpleRequisitosException{
        if (!plantel.contains(p)) {
            throw new NoCumpleRequisitosException("La renovación fue rechazada porque no pertenece al club");
        }

        p.requisitosRenovar();

        System.out.println(p.getNombre() + " renovó su contrato con " + this.nombre);
    }


    public void mostrarInformacionPlantel() {
        System.out.println(nombre.toUpperCase());
        if (plantel.isEmpty()) {
            System.out.println("No hay integrantes actualmente");
        }
        else {
            for (Plantel p : plantel) {
                System.out.println("- " + p);
            }
        }
    }
}