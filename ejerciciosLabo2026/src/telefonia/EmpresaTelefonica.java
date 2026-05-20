package telefonia;
import persona.Empleado;

import java.sql.Array;
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

    public boolean coincideEmp(Empleado empleado, Llamada llamada){
        return ((empleado.getNombre().equals(llamada.getEmpleadoOrigen().getNombre())) && (empleado.getApellido().equals(llamada.getEmpleadoOrigen().getApellido())));
    }

    public void mostrarRegistro(){
        System.out.println("-- REGISTRO DE LLAMADAS --");
        for (Empleado emp : listaEmpleado) {
            System.out.println("Llamadas de " + emp.getNombre() + " " + emp.getApellido() + ":");
            for (Llamada ll : registroLlamada) {
                if (coincideEmp(emp, ll)) {
                    System.out.println("Para: " + ll.getEmpleadoDestino().getNombre() + " " + ll.getEmpleadoDestino().getApellido() +
                            "\nFecha: " + ll.getFechaLlamada() +
                            "\nDuracion: " + ll.getDuracion() +
                            "\nCosto: " + ll.calcularCosto() + "\n -----------");
                }
            }
        }
    }

    public void sumarTiempo(Empleado empleado){

    }

    public void ranking(){
        ArrayList<Empleado> listaRanking = new ArrayList<Empleado>();
        ArrayList<Integer> listaDuracion = new ArrayList<Integer>();
        int tiempoTotal = 0;
        for (Empleado emp : listaEmpleado){
            for (Llamada ll : registroLlamada){
                if (coincideEmp(emp, ll)){
                    tiempoTotal += ll.getDuracion();
                }
            }
            listaDuracion.add(tiempoTotal);
            listaRanking.add(emp);
        }

        for (int i=0; i < listaDuracion.size() - 1; i++){
            for (int j=0; j < listaDuracion.size() - i - 1; j++){
                if (listaDuracion.get(j) > listaDuracion.get(j + 1)){
                    Empleado aux = listaRanking.get(j);
                    listaRanking.set(j, listaRanking.get(j+1));
                    listaRanking.set(j+1, aux);

                    int aux2 = listaDuracion.get(j+1);
                    listaDuracion.set(j, listaDuracion.get(j+1));
                    listaDuracion.set(j+1, aux2);
                }
            }
        }

        for (Empleado e : listaRanking){
            System.out.println("-- RANKING LLAMADA AL EXTERIOR --");
            System.out.println(e.getNombre() + " " + e.getApellido() + " | " + e.getPais());
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