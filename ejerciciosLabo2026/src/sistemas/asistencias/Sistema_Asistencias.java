package sistemas.asistencias;
import fecha.Dia;
import seres_vivos.humanos.Empleado;

import java.time.LocalTime;
import java.util.HashSet;

public class Sistema_Asistencias {
    private HashSet<Empleado> listaEmpleados;

    public Sistema_Asistencias() {
        this.listaEmpleados = new HashSet<>();
    }


    public void agregarEmpleado(Empleado e){
        if (listaEmpleados.contains(e)) System.out.println("Ya se encuentra el empleado en la lista");
        else {
            listaEmpleados.add(e);
            System.out.println("Se agregó correctamente");
        }
    }


    public Empleado buscarNumLegajo(int legajo){
        Empleado empLejago = null;
        for (Empleado e : listaEmpleados){
            if (e.getLegajo() == legajo) empLejago = e;
        }
        if (empLejago == null) System.out.println("No existe empleado con este legajo");
        return empLejago;
    }


    public void registrarIngreso(Empleado emp, LocalTime fechaHoraIngreso){
        if (!listaEmpleados.contains(emp)) System.out.println("");
    }
}