package endocrinologia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema_Pacientes {
    private HashMap<Tratable, Integer> pacientesAplicados;
    private HashSet<Paciente> pacientes;

    public Sistema_Pacientes() {
        this.pacientesAplicados = new HashMap<>();
        this.pacientes = new HashSet<>();
    }

    public HashMap<Tratable, Integer> getPacientesAplicados() {
        return pacientesAplicados;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void agregarPaciente(Paciente p){
        pacientes.add(p);
    }

    public void iniciarTratamiento(Paciente p) throws TratamientoInvalidoException {
        if (!pacientes.contains(p)){
            System.out.println("El paciente no se encuentra en el sistema");
        }

        if (!(p instanceof Tratable)) {
            throw new TratamientoInvalidoException("El paciente no califica para el tratamiento");
        }

        Tratable tratable = (Tratable) p;

        tratable.comprobarRequisitos();

        pacientesAplicados.put(tratable, 0);
        System.out.println(p.getNombreCompleto() + " fue incorporado/a al tratamiento");
    }

    public void avanzarTratamiento() {
        for (Map.Entry<Tratable, Integer> entry : pacientesAplicados.entrySet()) {
            entry.setValue(entry.getValue() + 1);
        }
    }

    public int cantPacientesAplicados(){
        return pacientesAplicados.size();
    }

    public int cantPacientes(){
        return pacientes.size();
    }

    public int cantPacientesQueNoAplican() {
        int cant = 0;
        for (Paciente p : pacientes) {
            if (p instanceof Adulto || p instanceof Geronte) {
                cant++;
            }
        }
        return cant;
    }

    public void mostrarEstadoTratamientos() {
        if (pacientesAplicados.isEmpty()) {
            System.out.println("(No hay pacientes en tratamiento active)");
        } else {
            for (Map.Entry<Tratable, Integer> entry : pacientesAplicados.entrySet()) {
                System.out.println("- " + entry.getKey() + " | Días en tratamiento: " + entry.getValue());
            }
        }
    }
}