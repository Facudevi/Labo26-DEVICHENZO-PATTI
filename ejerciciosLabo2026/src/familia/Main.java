package familia;
import seres_vivos.humanos.Integrante_Familia;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Familia familia = new Familia();
        HashSet<String> ingredientes = new HashSet<>();
        ingredientes.add("Ingredientes varios");
        Plato_Familia pizza = new Plato_Familia("Pizza", ingredientes, 900);
        Plato_Familia ensalada = new Plato_Familia("Ensalada", ingredientes, 250);
        Plato_Familia fideos = new Plato_Familia("Fideos", ingredientes, 600);

        Integrante_Familia i1 = new Integrante_Familia("Juani", "Perez", LocalDate.of(1990, 3, 15));
        Integrante_Familia i2 = new Integrante_Familia("Valen", "Perez", LocalDate.of(1992, 7, 20));

        familia.agregarIntegrante(i1);
        familia.agregarIntegrante(i2);

        familia.registrarConsumo(i1, pizza);
        familia.registrarConsumo(i1, pizza);
        familia.registrarConsumo(i1, fideos);
        familia.registrarConsumo(i2, ensalada);


        System.out.println("-- CALORÍAS TOTALES Y PROMEDIO--");
        System.out.println("Calorías de Juani: " + i1.obtenerCalorias() + " calorías");
        System.out.println("Promedio de Juani: " + i1.promedioPersona() + " calorías");
        System.out.println("Calorías de Valen: " + i2.obtenerCalorias() + " calorías");
        System.out.println("Promedio de Valen: " + i2.promedioPersona() + " calorías");
        System.out.println("Promedio de la Familia: " + familia.promedioFamilia() + " calorías");


        System.out.println("-- MÁS Y MENOS CALORÍAS --");
        System.out.println("Consumió más calorías: " + familia.masCalorias().getNombre());
        System.out.println("Consumió menos calorías: " + familia.menosCalorias().getNombre());


        System.out.println("-- INTEGRANTES QUE COMIERON UN PLATO ESPECÍFICO --");
        for (Integrante_Familia integrante : familia.integrantesComieronPlato(pizza)) {
            System.out.println("- " + integrante.getNombre());
        }


        System.out.println("-- PLATOS DISTINTOS CONSUMIDOS --");
        for (Plato_Familia plato : familia.platosDistintosFamilia()) {
            System.out.println("- " + plato.getNombre());
        }


        System.out.println("-- PLATO PREFERIDO --");
        Plato_Familia preferido = familia.obtenerPlatoPreferido(i1);
        if (preferido != null) System.out.println("El plato preferido de Juani es: " + preferido.getNombre());


        System.out.println("-- ELIMINAR INTEGRANTE --");
        familia.eliminarIntegrante(i2);
    }
}