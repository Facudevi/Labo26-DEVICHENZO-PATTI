package empresas_negocios.tienda_alimentaria;

import java.time.LocalDate;

public class Fresco extends Producto_Alimentario {
    public Fresco(String nombre, int numLote, LocalDate fechaVen, String codId, Pais pais, LocalDate fechaEnv) {
        super(nombre, numLote, fechaVen, codId, pais, fechaEnv);
    }


    // permite comprobar el tipo de producto
    @Override
    public String getTipo(){ return "Fresco"; };


    // info tabla nutricional
    @Override
    public String infoNutricional(){ return "Calorías: 80 kcal \nSodio: 10 mg"; }
}