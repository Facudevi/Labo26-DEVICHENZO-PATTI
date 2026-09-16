package residuos;
import entregas_drones.Distancia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Sistema_Residuo {
    private HashSet<Tipo_Residuo> listaTipoResiduos;
    private HashSet<Punto_Recoleccion> listaPuntosRecoleccion;
    private HashSet<Camion_Residuo> flota;
    private HashSet<Registro> historialRegistros;

    public Sistema_Residuo() {
        this.listaTipoResiduos = new HashSet<>();
        this.listaPuntosRecoleccion = new HashSet<>();
        this.flota = new HashSet<>();
        this.historialRegistros = new HashSet<>();
    }


    public void registrarNuevoTipo(Tipo_Residuo r){
        listaTipoResiduos.add(r);
    }

    public void modificarTipo(Tipo_Residuo vTipo, Tipo_Residuo nTipo){
        if (listaTipoResiduos.contains(vTipo) && !listaTipoResiduos.contains(nTipo)){
            listaTipoResiduos.remove(vTipo);
            listaTipoResiduos.add(nTipo);
            System.out.println("Se modificó correctamente");
        }
        else System.out.println("No se pudo modificar " + vTipo.getNombre() + " por " + nTipo.getNombre() + "por un error en alguna de las variables");
    }

    public void consultarReciclables(){
        ArrayList<Tipo_Residuo> reciclable = new ArrayList<>();
        ArrayList<Tipo_Residuo> noReciclable = new ArrayList<>();
        for(Tipo_Residuo r : listaTipoResiduos){
            if(r.isReciclable()) reciclable.add(r);
            else noReciclable.add(r);
        }

        System.out.println("Residuos reciclables: ");
        for (Tipo_Residuo r : reciclable) {
            System.out.println("- " + r.getNombre());
        }
        System.out.println("Residuos no reciclables: ");
        for (Tipo_Residuo r : noReciclable) {
            System.out.println("- " + r.getNombre());
        }
    }

    public void agregarPuntoRecoleccion(Punto_Recoleccion pr){
        if (listaPuntosRecoleccion.contains(pr)) System.out.println("El punto de recolección ya está registrado");
        else {
            listaPuntosRecoleccion.add(pr);
            System.out.println("Punto de recolección agregado correctamente.");
        }
    }

    public Punto_Recoleccion buscarPuntoPorDireccion(String dir){
        for (Punto_Recoleccion pr : listaPuntosRecoleccion){
            if (pr.getDireccion().equals(dir)) return pr;
        }
        return null;
    }

    public void agregarResiduoAceptado(Tipo_Residuo r, int cant, Punto_Recoleccion pr){
        pr.agregarResiduoPuntoRecoleccion(r, cant);
    }

    public void modificarResiduoAceptado(Tipo_Residuo vResiduo, Tipo_Residuo nResiduo, int cant, Punto_Recoleccion pr){
        pr.modificarResiduoPuntoRecoleccion(vResiduo, nResiduo, cant);
    }

    public void eliminarResiduoAceptado(Tipo_Residuo r, Punto_Recoleccion pr){
        pr.eliminarResiduoPuntoRecoleccion(r);
    }

    public boolean consultarTipo(Punto_Recoleccion pr, Tipo_Residuo r){
        return pr.recibeTipo(r);
    }

    public void puntosPorBarrio(String barrio){
        System.out.println("Puntos que se encuentran en el barrio " + barrio + ":");
        for (Punto_Recoleccion pr : listaPuntosRecoleccion){
            if (pr.getBarrio().equals(barrio)){
                System.out.println("- " + pr.getNombre());
            }
        }
    }

    public HashSet<Punto_Recoleccion> puntoQueRecibeCiertoResiduo(Tipo_Residuo r){
        HashSet<Punto_Recoleccion> listaPuntos = new HashSet<>();
        for (Punto_Recoleccion pr : listaPuntosRecoleccion){
            if (consultarTipo(pr, r)) listaPuntos.add(pr);
        }
        return listaPuntos;
    }

    public void puntosParaCadaResiduoPorBarrio(String barrio){
        for (Tipo_Residuo r : listaTipoResiduos){
            int cant = 0;
            for (Punto_Recoleccion pr : listaPuntosRecoleccion){
                if(pr.getBarrio().equals(barrio) && consultarTipo(pr, r)){
                    cant ++;
                }
            }
            System.out.println("En el barrio " + barrio + " la cantidad de puntos de recolección para " + r.getNombre() + " es: " + cant);
        }
    }

    public void agregarCamion(Camion_Residuo c){
        flota.add(c);
    }

    public boolean iniciarRecoleccion(Camion_Residuo c, ArrayList<Punto_Recoleccion> recorrido){
        Punto_Recoleccion primero = recorrido.getFirst();
        Punto_Recoleccion ultimo = recorrido.getLast();
        double distancia = Distancia.calcularDistancia(primero.getLatitud(), primero.getLongitud(), ultimo.getLatitud(), ultimo.getLongitud());

        if (distancia > Camion_Residuo.getAutonomia()){
            System.out.println("La distancia a recorrer es mayor a la autonomía. Se apagó el camión durante el recorrido");
            historialRegistros.add(new Registro(LocalDate.now(), false));
            return false;
        }

        double peso = 0;
        for (Punto_Recoleccion pr : recorrido){
            for(Map.Entry<Tipo_Residuo, Integer> entry : pr.getResiduos().entrySet()){
                Tipo_Residuo r = entry.getKey();
                int cantidad = entry.getValue();

                if (c.puedeTransportar(r)){
                    peso += cantidad;
                }
            }
        }

        if (peso > c.getCapacidadMax()){
            System.out.println("El peso recolectado supera el peso máximo de carga del camión. No pudo completarse el recorrido");
            historialRegistros.add(new Registro(LocalDate.now(), false));
            return false;
        }

        for(Punto_Recoleccion pr : recorrido){
            HashSet<Tipo_Residuo> eliminar = new HashSet<>();
            for(Tipo_Residuo r : pr.getResiduos().keySet()){
                if (c.puedeTransportar(r)){
                    eliminar.add(r);
                }
            }

            for (Tipo_Residuo r : eliminar){
                pr.getResiduos().remove(r);
            }
        }
        System.out.println("Pudo completarse el recorrido con exito");
        historialRegistros.add(new Registro(LocalDate.now(), true));
        return true;
    }

    public double porcentajeEficienciaRegistros(){
        int eficiente = 0;
        int cantidad = 0;

        for (Registro r : historialRegistros){
            if (r.isExito()){
                eficiente ++;
            }
            cantidad ++;
        }

        return ((double)eficiente * 100) / cantidad;
    }
}