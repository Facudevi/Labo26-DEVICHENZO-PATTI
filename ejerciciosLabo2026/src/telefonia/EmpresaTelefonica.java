package telefonia;
import persona.Empleado;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaTelefonica {
    private ArrayList<Empleado> listaEmpleado;
    private ArrayList<Llamada> registroLlamada;

    public EmpresaTelefonica() {
        this.listaEmpleado = new ArrayList<>();
        this.registroLlamada = new ArrayList<>();
    }

    public ArrayList<Empleado> getListaEmpleado() { return listaEmpleado; }
    public ArrayList<Llamada> getRegistroLlamada() { return registroLlamada; }

    public void setRegistroLlamada(ArrayList<Llamada> registroLlamada) { this.registroLlamada = registroLlamada; }
    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) { this.listaEmpleado = listaEmpleado; }


    public void agregarEmpleado(Empleado emp){ listaEmpleado.add(emp); }

    public Empleado buscarEmpleadoTel(String telefono){
        for (Empleado e : listaEmpleado){
            if (e.getNumTel().equals(telefono)){
                return e;
            }
        }
        return null;
    }

    public void registrarLlamada(String telOrigen, String telDestino, LocalDate fecha, int tiempo, String dato1, String dato2) {
        Empleado origen = buscarEmpleadoTel(telOrigen);
        Empleado destino = buscarEmpleadoTel(telDestino);

        if (origen == null || destino == null){
            System.out.println("Al menos uno de los dos empleados no es parte de la empresa. No se pudo registrar la llamada");
        }
        else {
            if (origen.getPais().equals(destino.getPais())){
                Local llamadaLoc = new Local(origen, destino, fecha, tiempo, dato1, dato2);
                registroLlamada.add(llamadaLoc);
                System.out.println("Se registró llamada local con exito");
            }
            else {
                Internacional llamadaInt = new Internacional(origen, destino, fecha, tiempo, dato1, dato2);
                registroLlamada.add(llamadaInt);
                System.out.println("Se registró llamada internacional con exito");
            }
        }
    }

    public void mostrarRegistro(){
        System.out.println("-- REGISTRO DE LLAMADAS --");
        for (Llamada llamada : registroLlamada){
            System.out.println("De: " + llamada.getEmpleadoOrigen().getNombre() + " " + llamada.getEmpleadoOrigen().getApellido() +
                               "\nPara: " + llamada.getEmpleadoDestino().getNombre() + " " + llamada.getEmpleadoDestino().getApellido() +
                               "\nFecha: " + llamada.getFechaLlamada() +
                               "\nDuracion: " + llamada.getDuracion() +
                               "\nCosto: " + llamada.calcularCosto() + "\n -----------");
        }
    }


    public static void main(String[] args) {
        EmpresaTelefonica empresa = new EmpresaTelefonica();

        Empleado emp1 = new Empleado("Juan", "Gomez", LocalDate.of(1990, 5, 12), "Av. Libertador 2236", 351511292, "Argentina", "1111-4343");
        Empleado emp2 = new Empleado("Juana", "Martinez", LocalDate.of(1993, 8, 25), "Bunghe 445", 37984275, "Argentina", "2222-5556");
        Empleado emp3 = new Empleado("Connor", "Gallaher", LocalDate.of(1988, 11, 2), "Main Street 3892", 88924001, "Inglaterra", "3003-5545");

        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);

        empresa.registrarLlamada("1111-4343", "2222-5556", LocalDate.now(), 35, "Buenos Aires", "Santa Fe");
        empresa.registrarLlamada("1111-4343", "3003-5545", LocalDate.now(), 68, "+44", "UTC+1");
        empresa.registrarLlamada("2222-5556", "3434-3434", LocalDate.now(), 20, "Santa Fe", "Cordoba");

        empresa.mostrarRegistro();
    }
}