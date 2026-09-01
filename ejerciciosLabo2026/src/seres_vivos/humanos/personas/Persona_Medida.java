package seres_vivos.humanos.personas;
import mediciones.Medicion;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona_Medida extends Persona{
    private HashMap<LocalDate, Medicion> medida;

    public Persona_Medida(String nombre, String apellido, LocalDate fecha) {
        super(nombre, apellido, fecha);
        this.medida = new HashMap<>();
    }

    public HashMap<LocalDate, Medicion> getMedida() { return medida; }


    public boolean comprobarFecha(LocalDate fecha) {
        return (medida.containsKey(fecha));
    }


    public void agregarMedicion(LocalDate fecha, double peso, int altura){
        Medicion nuevaMedicion = new Medicion(peso, altura);
        medida.put(fecha, nuevaMedicion);
    }


    public Medicion medicionFechaPerticular(LocalDate fecha){
        if (medida.containsKey(fecha)) return medida.get(fecha);
        return null;
    }


    public double promedioPesoAnio(int anio){
        double suma = 0;
        int cont = 0;
        for (Map.Entry<LocalDate, Medicion> entry : medida.entrySet()){
            if (entry.getKey().getYear() == anio){
                suma += entry.getValue().getPeso();
                cont ++;
            }
        }

        return (suma / cont);
    }


    public double promedioAlturaAnio(int anio){
        double suma = 0;
        int cont = 0;
        for (Map.Entry<LocalDate, Medicion> entry : medida.entrySet()){
            if (entry.getKey().getYear() == anio){
                suma += entry.getValue().getAltura();
                cont ++;
            }
        }

        return (suma / cont);
    }


    public double calcularVariacionPeso(LocalDate fechaInicial, LocalDate fechaFinal) {
        Medicion medicionInicial = medida.get(fechaInicial);
        Medicion medicionFinal = medida.get(fechaFinal);

        if (medicionInicial == null || medicionFinal == null) {
            System.out.println("No existe al menos una de las dos fechas seleccionadas");
            return 0;
        }

        double pesoInicial = medicionInicial.getPeso();
        double pesoFinal = medicionFinal.getPeso();

        return ((pesoInicial - pesoFinal) / pesoInicial) * 100;
    }


    public double calcularVariacionAltura(LocalDate fechaInicial, LocalDate fechaFinal){
        Medicion medicionInicial = medida.get(fechaInicial);
        Medicion medicionFinal = medida.get(fechaFinal);

        if (medicionInicial == null || medicionFinal == null) {
            System.out.println("No existe regitro de al menos una de las dos fechas seleccionadas");
            return 0;
        }

        double alturaInicial = medicionInicial.getAltura();
        double alturaFinal = medicionFinal.getAltura();

        return ((alturaInicial - alturaFinal) / alturaInicial) * 100;
    }


    public LocalDate registrarFechaMayorPeso(){
        LocalDate fechaMayor = null;
        double pesoMax = -1;
        for (Map.Entry<LocalDate, Medicion> entry : medida.entrySet()){
            double pesoActual = entry.getValue().getPeso();
            if (pesoActual > pesoMax){
                pesoMax = pesoActual;
                fechaMayor = entry.getKey();
            }
        }
        return fechaMayor;
    }


    public LocalDate registrarFechaMenorPeso(){
        LocalDate fechaMenor = null;
        double pesoMin = 0;
        boolean primero = true;

        for(Map.Entry<LocalDate, Medicion> entry : medida.entrySet()){
            double pesoActual = entry.getValue().getPeso();
            if (primero){
                pesoMin = pesoActual;
                fechaMenor = entry.getKey();
                primero = false;
            }
            else if (pesoActual < pesoMin){
                pesoMin = pesoActual;
                fechaMenor = entry.getKey();
            }
        }
        return fechaMenor;
    }
}