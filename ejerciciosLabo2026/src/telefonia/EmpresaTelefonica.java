package telefonia;
import seres_vivos.humanos.Empleado_Telefonia;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaTelefonica {
    private String nombre;
    private ArrayList<Empleado_Telefonia> listaEmpleado;
    private ArrayList<Llamada> registroLlamada;

    public EmpresaTelefonica(String nombre) {
        this.nombre = nombre;
        this.listaEmpleado = new ArrayList<>();
        this.registroLlamada = new ArrayList<>();
    }

    public String getNombreEmpresa() { return nombre; }
    public ArrayList<Empleado_Telefonia> getListaEmpleado() { return listaEmpleado; }
    public ArrayList<Llamada> getRegistroLlamada() { return registroLlamada; }

    public void setNombreEmpresa(String nombre) { this.nombre = nombre; }
    public void setRegistroLlamada(ArrayList<Llamada> registroLlamada) { this.registroLlamada = registroLlamada; }
    public void setListaEmpleado(ArrayList<Empleado_Telefonia> listaEmpleado) { this.listaEmpleado = listaEmpleado; }


    public boolean agregarEmpleado(Empleado_Telefonia empleado) {
        if (existeDni(empleado.getDNI()) || existeTelefono(empleado.getNumTel())) {
            return false;
        }
        listaEmpleado.add(empleado);
        return true;
    }

    public Empleado_Telefonia buscarEmpleadoTel(String telefono){
        for (Empleado_Telefonia e : listaEmpleado){
            if (e.getNumTel().equals(telefono)){
                return e;
            }
        }
        return null;
    }

    public boolean registrarLlamada(Empleado_Telefonia origen, String telefonoDestino, int duracion) {
        if (origen == null || telefonoDestino == null || duracion <= 0) {
            return false;
        }

        if (!existeEmpleado(origen)) {
            return false;
        }

        Empleado_Telefonia destino = buscarEmpleadoPorTelefono(telefonoDestino);

        if (destino == null) {
            return false;
        }

        if (origen.tieneMismoDniQue(destino.getDNI())) {
            return false;
        }

        Llamada llamada = crearLlamada(origen, destino, duracion);
        registroLlamada.add(llamada);
        return true;
    }

    public Llamada crearLlamada(Empleado_Telefonia origen, Empleado_Telefonia destino, int duracion) {
        if (origen.viveEnElMismoPaisQue(destino)) {
            return new Local(origen, destino, duracion, origen.getProvincia(), destino.getProvincia());
        }
        return new Internacional(origen, destino, duracion, destino.getCodigoPais(), destino.getFranjaHoraria());
    }

    public ArrayList<Llamada> obtenerLlamadasDe(Empleado_Telefonia empleado) {
        ArrayList<Llamada> llamadasDelEmpleado = new ArrayList<>();

        for (Llamada llamada : registroLlamada) {
            if (llamada.fueRealizadaPor(empleado)) {
                llamadasDelEmpleado.add(llamada);
            }
        }
        return llamadasDelEmpleado;
    }

    public void mostrarRankingEmpleadosQueMasTiempoLlamaronAlExterior() {
        ArrayList<Empleado_Telefonia> empleadosRanking = new ArrayList<>();
        ArrayList<Integer> minutosRanking = new ArrayList<>();

        cargarMinutosAlExterior(empleadosRanking, minutosRanking);

        if (empleadosRanking.isEmpty()) {
            System.out.println("No se registraron llamadas al exterior.");
            return;
        }

        ordenarRankingPorMinutosDescendente(empleadosRanking, minutosRanking);
        imprimirRankingExterior(empleadosRanking, minutosRanking);
    }

    public void cargarMinutosAlExterior(ArrayList<Empleado_Telefonia> empleadosRanking, ArrayList<Integer> minutosRanking) {
        for (Empleado_Telefonia empleado : listaEmpleado) {
            int minutos = calcularMinutosAlExteriorDe(empleado);

            if (minutos > 0) {
                empleadosRanking.add(empleado);
                minutosRanking.add(minutos);
            }
        }
    }
    public int calcularMinutosAlExteriorDe(Empleado_Telefonia empleado) {
        int total = 0;

        for (Llamada llamada : registroLlamada) {

            total = total + llamada.obtenerMinutosAlExteriorDe(empleado);
        }
        return total;
    }

    public void ordenarRankingPorMinutosDescendente(ArrayList<Empleado_Telefonia> empleadosRanking, ArrayList<Integer> minutosRanking) {
        for (int i=0; i < minutosRanking.size() - 1; i++){
            for (int j=0; j < minutosRanking.size() - i - 1; j++){
                if (minutosRanking.get(j) < minutosRanking.get(j + 1)){
                    Empleado_Telefonia aux = empleadosRanking.get(j);
                    empleadosRanking.set(j, empleadosRanking.get(j+1));
                    empleadosRanking.set(j+1, aux);

                    int aux2 = minutosRanking.get(j);
                    minutosRanking.set(j, minutosRanking.get(j+1));
                    minutosRanking.set(j+1, aux2);
                }
            }
        }

    }

    private void imprimirRankingExterior(ArrayList<Empleado_Telefonia> empleadosRanking, ArrayList<Integer> minutosRanking) {

        System.out.println("Ranking de empleados que mas tiempo llamaron al exterior:");
        for (int i=0; i < empleadosRanking.size(); i++){
            System.out.println((i+1) + "- " + empleadosRanking.get(i).getNombreCompleto() + ": " + minutosRanking.get(i) + " minutos");
        }
    }

    //mostrar datos
    public void mostrarLlamadasDe(Empleado_Telefonia empleado) {
        ArrayList<Llamada> listaLlamadas;
        listaLlamadas = obtenerLlamadasDe(empleado);

        if(listaLlamadas.isEmpty()){
            System.out.println("El empleado no realizó llamadas");
        }
        else {
            for (Llamada ll : listaLlamadas) {
                System.out.println(ll.obtenerDetalle());
                System.out.println("-------------------");
            }
        }
    }

    public void mostrarTodasLasLlamadas() {
        System.out.println("-- LLAMADAS DE LA EMPRESA POR EMPLEADO --");
        for (Empleado_Telefonia e : listaEmpleado){
            System.out.println("Llamadas de " + e.getNombreCompleto() + ": ");
            mostrarLlamadasDe(e);
        }
    }
    
    //verificaciones
    public boolean existeEmpleado(Empleado_Telefonia empleado) {
        for (Empleado_Telefonia empleadoActual : listaEmpleado) {
            if (empleadoActual.tieneMismoDniQue(empleado.getDNI())) {
                return true;
            }
        }
        return false;
    }

    public boolean existeDni(String dni) {
        for (Empleado_Telefonia empleado : listaEmpleado) {
            if (empleado.tieneMismoDniQue(dni)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeTelefono(String telefono) {
        return buscarEmpleadoPorTelefono(telefono) != null;
    }

    public Empleado_Telefonia buscarEmpleadoPorTelefono(String telefono) {
        for (Empleado_Telefonia empleado : listaEmpleado) {
            if (empleado.tieneTelefono(telefono)) {
                return empleado;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        EmpresaTelefonica empresa = new EmpresaTelefonica("IPM Sistemas");

        Empleado_Telefonia ana = new Empleado_Telefonia("Ana", "Lopez", LocalDate.of(1980, 5, 6), "Malvinas 544", 11111111, "Argentina", "4444-1111", Provincia.BUENOS_AIRES, "+54", "GMT-3");
        Empleado_Telefonia juan = new Empleado_Telefonia("Juan", "Perez", LocalDate.of(1989, 5, 16), "Bolivia 44", 12121212, "Argentina", "3333-3333", Provincia.CORDOBA, "+54", "GMT-3");
        Empleado_Telefonia maria = new Empleado_Telefonia("Maria", "Silva", LocalDate.of(1986, 4, 20), "Gloria 4400", 22222222, "Uruguay", "6666-3333", Provincia.MONTEVIDEO, "+598", "GMT-3");

        empresa.agregarEmpleado(ana);
        empresa.agregarEmpleado(juan);
        empresa.agregarEmpleado(maria);

        empresa.registrarLlamada(juan, "6666-3333", 5);
        empresa.registrarLlamada(ana, "3333-3333", 20);
        empresa.registrarLlamada(maria, "4444-1111", 12);
        empresa.registrarLlamada(ana, "6666-3333", 8);

        // No se registra porque el numero no pertenece a ningun empleado cargado.
        boolean seRegistro = empresa.registrarLlamada(ana, "9999-9999", 10);
        System.out.println("Se registro la llamada al 9999-9999? " + seRegistro + "\n");

        empresa.mostrarTodasLasLlamadas();

        System.out.println("-- MOSTRAR LLAMADAS DE EMPLEADO ESPECIFICO --");
        empresa.mostrarLlamadasDe(ana);

        empresa.mostrarRankingEmpleadosQueMasTiempoLlamaronAlExterior();
    }
}