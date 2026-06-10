package empresas_negocios.tienda_alimentaria;

import java.time.LocalDate;

public class Producto_Alimentario {
    private String nombre;
    private int numLote;
    private LocalDate fechaVen;
    private String codId;
    private Pais pais;
    private LocalDate fechaEnv;

    public Producto_Alimentario(String nombre, int numLote, LocalDate fechaVen, String codId, Pais pais, LocalDate fechaEnv){
        this.nombre = nombre;
        this.numLote = numLote;
        this.fechaVen = fechaVen;
        this.codId = codId;
        this.pais = pais;
        this.fechaEnv = fechaEnv;
    }

    public int getNumLote(){ return numLote; }
    public String getCodId(){ return codId; }


    // metodo para obtener tipo de producto
    public String getTipo(){ return ""; }


    // retorna numero de lote y codigo de verificacion cuando se pide info del producto
    public void mostrarInfo(){
        System.out.println("Numero de lote: " + this.numLote +
                "\nCodigo de identificacion: " + this.codId);
    }


    // obtiene el producto Fresco que se envasó más recientemente
    public Producto_Alimentario obtenerMasReciente(Producto_Alimentario p){
        if(this.fechaEnv.isAfter(p.fechaEnv)){
            return this;
        }
        return p;
    }


    // compara el pais para aumentar contador de producto
    public boolean mismoPais(Pais p){
        if(this.pais.name().equals(p.name())){
            return true;
        }
        return false;
    }


    // metodo para la tabla nutricional
    public String infoNutricional(){
        return "";
    }
}