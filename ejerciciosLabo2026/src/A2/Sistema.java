package A2;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Preparacion> preparaciones;
    private HashMap<Vendible, Integer> historial;

    public Sistema() {
        this.preparaciones = new HashSet<>();
        this.historial = new HashMap<>();
    }

    public Sistema(HashSet<Preparacion> preparaciones, HashMap<Vendible, Integer> historial) {
        this.preparaciones = preparaciones;
        this.historial = historial;
    }

    public HashSet<Preparacion> getPreparaciones() {
        return preparaciones;
    }

    public HashMap<Vendible, Integer> getHistorial() {
        return historial;
    }

    public void registrarVenta(Vendible v, int stock) {
        try {
            v.vender(stock);
            System.out.println("Venta cargada con exito");
            historial.put(v, historial.getOrDefault(v, 0) + stock); // CORREGIDO: get(v) devolvia null y producia NullPointerException
        } catch (SinStockException e) {
            System.out.println(e.getMessage());
        }
    }

    public void nuevaPreparacion(Preparacion p) throws NumeroInvalido{
        if (!p.comprobarIngredientes()){ // CORREGIDO: se nego la condicion, true significa ingredientes validos
            throw new NumeroInvalido("Ingrediente con cantidades invalidas");
        }
        else if (preparaciones.contains(p)){
            System.out.println("Ya se encuentra en la lista de preparaciones");
        }
        else {
            preparaciones.add(p);
            System.out.println("Se ha agregado correctamente la preparación");
        }
    }

    public void reponerProducto(Preparacion p, int stock) throws NumeroInvalido{
        if (!p.comprobarIngredientes() || stock < 1){ // CORREGIDO: se nego la condicion, true significa ingredientes validos
            throw new NumeroInvalido("Tiene cantidades invalidas");
        }
        else if (preparaciones.contains(p)){
            // CORREGIDO: se quito preparaciones.add(p), era redundante porque ya estaba en el HashSet
            p.reponer(stock);
            System.out.println("El stock nuevo es de " + p.getStock());
        }
        else {
            System.out.println("La preparacion no se encuentra en la lista");
        }
    }

    public void productosVendibles(){
        int cant = 0;
        for (Preparacion p : preparaciones){
            if (p instanceof Vendible){
                cant ++;
            }
        }
        System.out.println("La cantidad de productos que están a la venta son: " + cant);
    }
}