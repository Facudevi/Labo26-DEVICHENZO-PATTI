package colegio;
import comida.Pedido;
import comida.Plato;
import seres_vivos.Alumno;
import seres_vivos.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Buffet {
    private ArrayList<Plato> menu;
    private ArrayList<Pedido> pedido;

    public Buffet() {
        this.menu = new ArrayList<>();
        this.pedido = new ArrayList<>();
    }

    public ArrayList<Plato> getMenu() {
        return menu;
    }
    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setMenu(ArrayList<Plato> menu) {
        this.menu = menu;
    }
    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }


    public boolean buscarPlato(Plato pl){
        for (Plato plato : menu){
            if (plato.equals(pl)){
                return true;
            }
        }
        return false;
    }

    public void agregarPlato(Plato p){
        if (!buscarPlato(p)){
            menu.add(p);
            System.out.println("El plato fue agregado al menú");
        }
        else {
            System.out.println("El plato ya se encuentra en el menú");
        }
    }

    public void eliminarPlato(Plato p){
        if (buscarPlato(p)){
            menu.remove(p);
            System.out.println("El plato fue eliminado del menú");
        }
        else {
            System.out.println("El plato no se encuentra en el menú");
        }
    }

    public void modificarPlato(Plato p){
        Scanner input = new Scanner(System.in);

        if(buscarPlato(p)){
            System.out.println("Qué desea cambiar del plato?:\n 1- Nombre\n 2- Precio \n Opcion:");
            int opcion = input.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Nuevo nombre: ");
                    String nombre = input.next();
                    p.setNombre(nombre);
                    System.out.println("Nuevo nombre del plato: " + p.getNombre() + "\n Precio: $" + p.getPrecio());
                    break;
                case 2:
                    System.out.println("Nuevo precio");
                    double precio = input.nextDouble();
                    p.setPrecio(precio);
                    System.out.println("Plato: " + p.getNombre() + "\nNuevo precio: $" + p.getPrecio());
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        else {
            System.out.println("El plato solicitado no se encuentra en el menú");
        }
    }

    public void listarPlatosCocinar(LocalDate fecha){
        System.out.println("-- PLATOS A COCINAR --");
        System.out.println("Fecha: " + fecha);
        for (Pedido p : pedido){
            if(p.getFecha().equals(fecha)){
                System.out.println("Plato a cocinar: " + p.getPlato().getNombre() + " | Para: " + p.getPersonaEducativa().getNombre() + " " + p.getPersonaEducativa().getApellido() + " | Precio final: $" + p.calcularPrecioFinal());
            }
        }
    }

    public void marcarEntregado(Pedido p){
        boolean coincide = false;
        if (p.getEntregado()){
            System.out.println("Este pedido ya había sido entregado");
        }
        else {
            p.setEntregado(true);
            System.out.println("El pedido fue marcado como entregado con éxito");
        }
    }

    public void listarPendientes(){
        System.out.println("-- PEDIDOS PENDIENTES --");
        for (Pedido p : pedido){
            if (!p.getEntregado()){
                System.out.println(p.getPlato().getNombre() + " | " + p.getPersonaEducativa().getNombre() + " " + p.getPersonaEducativa().getApellido());
            }
        }
    }

    public void top3(){
        int[] contador = new int[menu.size()];
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        String nomPlato1 = "";
        String nomPlato2 = "";
        String nomPlato3 = "";

        for (int i = 0; i < menu.size(); i++){
            Plato pl = menu.get(i);
            for (Pedido p : pedido){
                if (p.getPlato().getNombre().equals(pl.getNombre())){
                    contador[i]++;
                }
            }

            if (contador[i] > max1){
                max3 = max2;
                nomPlato3 = nomPlato2;
                max2 = max1;
                nomPlato2 = nomPlato1;
                max1 = contador[i];
                nomPlato1 = pl.getNombre();
            }
            else if (contador[i] > max2){
                max3 = max2;
                nomPlato3 = nomPlato2;
                max2 = contador[i];
                nomPlato2 = pl.getNombre();
            }
            else if (contador[i] > max3){
                max3 = contador[i];
                nomPlato3 = pl.getNombre();
            }
        }

        System.out.println("-- PLATOS MÁS PEDIDOS --");
        System.out.println("1- " + nomPlato1 + ": " + max1);
        System.out.println("2- " + nomPlato2 + ": " + max2);
        System.out.println("3- " + nomPlato3 + ": " + max3);
    }

    public static void main(String[] args) {
        ArrayList<Float> listaNotas1 = new ArrayList<>();
        ArrayList<Float> listaNotas2 = new ArrayList<>();

        ArrayList<Materia>  listaMaterias1 = new ArrayList<>();
        ArrayList<Materia>  listaMaterias2 = new ArrayList<>();

        Alumno alumno1 = new Alumno("Juan", "Pérez", LocalDate.of(2010, 5, 15), "Estado 604", 0.00, "5°A", listaNotas1, listaMaterias1);
        Alumno alumno2 = new Alumno("María", "García", LocalDate.of(2011, 10, 20), "Carabobo 1874", 0.00, "4°B", listaNotas2, listaMaterias2);

        Profesor profesor1 = new Profesor("Martin", "Barbieri", LocalDate.of(2003, 1, 1), "Libertador 1881", 15.5);
        Profesor profesor2 = new Profesor("Franco", "Callipo", LocalDate.of(2003, 2, 2), "Carabobo 1874", 10);

        Plato plato1 = new Plato("Fideos", 6500);
        Plato plato2 = new Plato("Arroz", 5000);
        Plato plato3 = new Plato("Hamburguesa", 7000);
        Plato plato4 = new Plato("Sandwich", 6500);

        Pedido pedido1 = new Pedido(LocalDate.of(2026, 5, 8), plato1, alumno2, LocalTime.of(12,5), true);
        Pedido pedido2 = new Pedido(LocalDate.of(2026, 5, 8), plato2, alumno1, LocalTime.of(17,0), false);
        Pedido pedido3 = new Pedido(LocalDate.of(2026, 5, 8), plato2, profesor2, LocalTime.of(17,0), false);
        Pedido pedido4 = new Pedido(LocalDate.of(2026, 5, 8), plato4, profesor1, LocalTime.of(17,0), false);
        Pedido pedido5 = new Pedido(LocalDate.of(2026, 5, 7), plato4, alumno2, LocalTime.of(12,5), true);
        Pedido pedido6 = new Pedido(LocalDate.of(2026, 5, 7), plato4, profesor1, LocalTime.of(12,5), true);
        Pedido pedido7 = new Pedido(LocalDate.of(2026, 5, 8), plato3, profesor2, LocalTime.of(16,30), false);

        Buffet buffet = new Buffet();
        buffet.agregarPlato(plato1);
        buffet.agregarPlato(plato2);
        buffet.agregarPlato(plato3);
        buffet.agregarPlato(plato4);
        buffet.pedido.add(pedido1);
        buffet.pedido.add(pedido2);
        buffet.pedido.add(pedido3);
        buffet.pedido.add(pedido4);
        buffet.pedido.add(pedido5);
        buffet.pedido.add(pedido6);
        buffet.pedido.add(pedido7);

        System.out.println("\n-- PRUEBAS DE FUNCIONALIDAD --\n");

        Plato plato5 = new Plato("Pizzeta", 3500);
        System.out.println("-- AGREGAR PLATOS --");
        buffet.agregarPlato(plato1);
        buffet.agregarPlato(plato5);
        System.out.println("-- MENU DE PLATOS --");
        for (int i=0; i < buffet.menu.size(); i++){
            System.out.println((i+1) + "- " + buffet.menu.get(i).getNombre() + " | $" + buffet.menu.get(i).getPrecio());
        }

        System.out.println("-- ELIMINAR PLATO --");
        buffet.eliminarPlato(plato5);
        System.out.println("-- MODIFICAR PLATO --");
        buffet.modificarPlato(plato2);

        buffet.listarPlatosCocinar(LocalDate.of(2026, 5, 8));

        System.out.println("-- MARCAR COMO ENTREGADO --");
        buffet.marcarEntregado(pedido7);
        buffet.marcarEntregado(pedido1);
        buffet.listarPendientes();

        buffet.top3();
    }
}