package empresas_negocios.tienda_alimentaria;

import java.time.LocalDate;

public class Refrigerado extends Producto_Alimentario {
    private double tempRecomendada;

    public Refrigerado(String nombre, int numLote, LocalDate fechaVen, String codId, Pais pais, LocalDate fechaEnv, double tempRecomendada) {
        super(nombre, numLote, fechaVen, codId, pais, fechaEnv);
        this.tempRecomendada = tempRecomendada;
    }


    // permite comprobar el tipo de producto
    @Override
    public String getTipo(){ return "Refrigerado"; }


    // info tabla nutricional
    @Override
    public String infoNutricional(){ return "Calorías: 120 kcal \nConservantes: presencia alta"; }
}