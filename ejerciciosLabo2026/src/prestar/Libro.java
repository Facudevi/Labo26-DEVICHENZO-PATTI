package prestar;

import java.util.HashMap;
import java.util.Map;

public class Libro extends Lectura implements Prestable{
    HashMap<String, Integer> paginasPorCap;

    public Libro(String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        this.paginasPorCap = new HashMap<>();
    }

    public HashMap<String, Integer> getPaginasPorCap(){ return paginasPorCap; }


    @Override
    public String toString() {
        String resultado = "";
        for (Map.Entry<String, Integer> entry : paginasPorCap.entrySet()){
            resultado = resultado + "| Cap: " + entry.getKey() + ", Paginas: " + entry.getValue();
        }

        return super.toString() + "\n| Paginas por Capitulo: " + resultado;
    }

    public int cantidadCaps(){
        return this.getPaginasPorCap().size();
    }


    @Override
    public String prestado(){
        try {
            puedePrestarse();
        } catch (CondicionesException e){
            System.out.println(e.getMessage());
        }
        return "El libro se dará prestado";
    }

    @Override
    public boolean puedePrestarse() {
        if (this.cantidadCaps()%2 == 0) throw new CondicionesException("Las condiciones no se cumplen para ser prestado");
        return true;
    }
}