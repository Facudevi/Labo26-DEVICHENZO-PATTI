package empresas_negocios.tienda_alimentaria;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Producto_Alimentario> lista;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }


    // metodo para encontrar producto en la lista
    public boolean coincide(Producto_Alimentario producto){
        for (Producto_Alimentario p : lista){
            if (p.equals(producto)){
                return true;
            }
        }
        return false;
    }


    // metodo agregar producto a la lista
    public void agregarProducto(Producto_Alimentario producto){
        if(!coincide(producto)){
            lista.add(producto);
            System.out.println("Se agregó el producto a la lista");
        }
        else {
            System.out.println("El producto ya existe en la lista");
        }
    }


    // metodo para obtener informacion del producto
    public void obtenerInfo(Producto_Alimentario producto){
        if(coincide(producto)){
            producto.mostrarInfo();
        }
        else {
            System.out.println("No se encontró el producto");
        }
    }


    // encontrar el producto que se envasó más recientemente para mostrar su numero de lote
    public int envasadoRecientemente(){
        Producto_Alimentario frescoEnv = null;
        for (Producto_Alimentario p : lista){
            if(p.getTipo().equals("Fresco")) {
                if (frescoEnv == null) frescoEnv = p;
                 else frescoEnv = p.obtenerMasReciente(frescoEnv);
            }
        }

        return frescoEnv.getNumLote();
    }


    // mostrar cantidad de productos de la empresa por pais
    public void cantidadPorPais(){
        ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();

        for (Pais p : Pais.values()){
            paises.add(p);
            int cant = 0;
            for (Producto_Alimentario pr : lista){
                if (pr.mismoPais(p)){
                    cant ++;
                }
            }
            cantidad.add(cant);
        }

        for(int i=0; i<paises.size(); i++){
            System.out.println(paises.get(i).name() + ": " + cantidad.get(i));
        }
    }
}