package A1;

import java.time.LocalDate;
import java.util.HashSet;

public class Aprendiz extends Ayudante{
    private HashSet<String> materialesProhibidos;

    private static Tamanio tamanioAceptado = Tamanio.PEQUENIO;

    public Aprendiz(String nombre, String apellido, LocalDate fechaNacimiento, String aldeaOrigen, Taller taller) {
        super(nombre, apellido, fechaNacimiento, aldeaOrigen, taller);
        this.materialesProhibidos = new HashSet<>();
    }

    public HashSet<String> getMaterialesProhibidos() {
        return materialesProhibidos;
    }

    public void agregarMaterialesProhibidos(String m){
        materialesProhibidos.add(m);
    }

    @Override
    public void prepararEstacion() {
        System.out.println("Se han guardado los materiales peligrosos:");
        for (String material : materialesProhibidos){
            System.out.println("- " + material);
        }
    }

    @Override
    public void fabricarRegalo(Regalo regalo) throws ProduccionRegalosException {
        if (regalo.getTamanio() != tamanioAceptado){
            throw new ProduccionRegalosException("No tiene permitido fabricar regalos de este tamaño");
        }

        for (String material : materialesProhibidos){
            if (regalo.getMaterialesNecesarios().contains(material)){
                throw new ProduccionRegalosException("El aprendiz necesita un material prohibido. No puede fabricar el regalo");
            }
        }

        System.out.println("El oficial " + getNombre() + " fabricó el regalo mediano: " + regalo.getNombre());
    }

    @Override
    public void envolverRegalo(Regalo regalo) throws ProduccionRegalosException {
        if (regalo.getTamanio() != tamanioAceptado){
            throw new ProduccionRegalosException("No tiene permitido envolver regalos de este tamaño");
        }

        System.out.println("El oficial " + getNombre() + " envolvió el regalo mediano: " + regalo.getNombre());
    }
}