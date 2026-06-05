package empresas_negocios.electronica;
import tecnologia.Producto;
import tecnologia.productos_electronica.Seccion;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema_Electronica {
    private ArrayList<Producto> listaProductos;

    public Sistema_Electronica() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() { return listaProductos; }

    public boolean coincide(Producto producto){
        for (Producto p : listaProductos){
            if (p.equals(producto)){
                return true;
            }
        }
        return false;
    }


    public void agregarProducto(Producto producto){
        if(!listaProductos.contains(listaProductos)) {
            if (producto.hayStock()) {
                listaProductos.add(producto);
                producto.reducirStock();
            }
        }
    }

    public void eliminarProducto(Producto producto){
        if(coincide(producto)) {
            listaProductos.remove(producto);
            producto.sumarStock();
        }
    }

    public void modificar(Producto producto){
        Scanner input = new Scanner(System.in);
        if(coincide(producto)){
            System.out.println("Modificar precio:");
            producto.setPrecio(input.nextDouble());
        }
    }

    public String mayorStock(){
        Producto productoMayor = listaProductos.get(0);
        for(Producto p : listaProductos){
            if (p.getStock() > productoMayor.getStock()){
                productoMayor = p;
            }
        }
        return productoMayor.getNombre();
    }

    public String menorStock(){
        Producto productoMenor = listaProductos.get(0);
        for(Producto p : listaProductos){
            if (p.getStock() < productoMenor.getStock()){
                productoMenor = p;
            }
        }
        return productoMenor.getNombre();
    }

    public void mostrarDetalle(Seccion seccion){
        System.out.println("Productos de: " + seccion.name());

        for (Producto p : listaProductos){
            if(p.getSeccion().equals(seccion)){
                System.out.println(p);
            }
        }
    }



}