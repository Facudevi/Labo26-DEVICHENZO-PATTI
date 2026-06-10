package ejercitacionRecuperatorio.tienda;
import ejercitacionRecuperatorio.tienda.productos_electronica.Seccion;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda_Electronica {
    private ArrayList<Producto> listaProductos;

    public Tienda_Electronica() {
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
        if(!listaProductos.contains(producto)) {
            listaProductos.add(producto);
            System.out.println("El producto " + producto.getNombre() + " se a agregado correctamente");
        }
        else {
            System.out.println("El producto ya existe en la tienda");
        }
    }

    public void eliminarProducto(Producto producto){
        if(coincide(producto)) {
            listaProductos.remove(producto);
            System.out.println("El producto " + producto.getNombre() + " se a eliminado correctamente");
        }
        else {
            System.out.println("No se encontró el producto a eliminar");
        }
    }

    public void modificar(Producto producto){
        Scanner input = new Scanner(System.in);
        if(coincide(producto)){
            System.out.println("Modificar precio:");
            double nuevoPrecio = input.nextDouble();
            producto.setPrecio(nuevoPrecio);
        }
        else {
            System.out.println("No se encontró el producto a modificar");
        }
    }

    public Producto obtenerMayorStock(){
        Producto productoMayor = listaProductos.get(0);
        for(Producto p : listaProductos){
            productoMayor = p.mayorStock(productoMayor);
        }
        return productoMayor;
    }

    public Producto obtenerMenorStock(){
        Producto productoMenor = listaProductos.get(0);
        for(Producto p : listaProductos){
            productoMenor = p.menorStock(productoMenor);
        }
        return productoMenor;
    }

    public void mostrarDetalleSeccion(Seccion seccion){
        System.out.println("Productos de: " + seccion.name());
        for (Producto p : listaProductos){
            if(p.getSeccion().equals(seccion)){
                System.out.println(p);
            }
        }
    }
}