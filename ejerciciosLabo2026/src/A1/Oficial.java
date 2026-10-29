package A1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Oficial extends Ayudante{
    private HashMap<String, Integer> stock;

    private static Tamanio tamanioAceptado = Tamanio.MEDIANO;

    public Oficial(String nombre, String apellido, LocalDate fechaNacimiento, String aldeaOrigen, Taller taller) {
        super(nombre, apellido, fechaNacimiento, aldeaOrigen, taller);
        this.stock = new HashMap<>();
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void agregarStock(String m, int s){
        if (stock.containsKey(m)){
            stock.put(m, stock.get(m)+s);
        }
        else {
            stock.put(m, s);
        }
    }

    @Override
    public void prepararEstacion() {
        System.out.println("Revisando caja de insumos: ");
        for (Map.Entry<String, Integer> entry : stock.entrySet()){
            if (entry.getValue()>1){
                System.out.println("- " + entry.getKey());
            }
        }
        System.out.println("Listo para trabajar");
    }

    @Override
    public void fabricarRegalo(Regalo regalo) throws ProduccionRegalosException{
        if (regalo.getTamanio() != tamanioAceptado){
            throw new ProduccionRegalosException("No tiene permitido fabricar regalos de este tamaño");
        }

        for(String material : stock.keySet()){
            int dispo = stock.get(material);
            if (dispo < 1){
                throw new ProduccionRegalosException("No cuenta con al menos un material necesario para la fabricacion del regalo");
            }
        }

        for (String material : regalo.getMaterialesNecesarios()) {
            stock.put(material, stock.get(material) - 1);
        }

        System.out.println("El oficial " + getNombre() + " fabricó el regalo mediano: " + regalo.getNombre());
    }

    @Override
    public void envolverRegalo(Regalo regalo) throws ProduccionRegalosException {
        if (regalo.getTamanio() != Tamanio.MEDIANO) {
            throw new ProduccionRegalosException("No tiene permitido envolver regalos de este tamaño");
        }
        System.out.println("El oficial " + getNombre() + " envolvió el regalo mediano: " + regalo.getNombre());
    }
}