package A1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Oficial extends Ayudante{
    private HashMap<String, Integer> stock;

    public Oficial(String nombre, String apellido, LocalDate fechaNacimiento, String aldeaOrigen, Taller taller) {
        super(nombre, apellido, fechaNacimiento, aldeaOrigen, taller);
        this.stock = new HashMap<>();
    }

    public HashMap<String, Integer> getStock() {
        return stock;
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
}