package sistemas.asistencias;
import seres_vivos.humanos.Empleado;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
        for (Empleado e : listaEmpleados) {
            if (e.getLegajo() == legajo) {
                return e;
            }
        }
        return null;
    }


    public void registrarIngreso(Empleado emp, LocalDateTime fechaHoraIngreso){
        if (!listaEmpleados.contains(emp)) System.out.println("No se encuentra el empleado");
        else {
            emp.agregarRegistro(fechaHoraIngreso);
        }
    }


    public void porcentajeAsistencia(Empleado emp, int mes, int anio){
        if (!listaEmpleados.contains(emp)) System.out.println("El empleado no se encuentra en la lista");
        else {
            double porcentaje = emp.calcularPorcentaje(mes, anio);
            System.out.println("El porcentaje de asistencia de " + emp.getNombreCompleto() + " fue del " + porcentaje + "%");
        }
    }


    public ArrayList<Empleado> obtenerEmpleadosPorcentaje(int mes, int anio){
        ArrayList<Empleado> lista = new ArrayList<>();
        for (Empleado e : listaEmpleados){
            if(e.calcularPorcentaje(mes, anio) > 80) lista.add(e);
        }
        return lista;
    }
}