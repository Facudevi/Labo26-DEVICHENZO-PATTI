package colegio;
import comida.Pedido;
import comida.Plato;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Buffet {
    private ArrayList<Plato> menu;
    private ArrayList<Pedido> pedido;

    public Buffet(ArrayList<Plato> menu, ArrayList<Pedido> pedido) {
        this.menu = new ArrayList<>();
        this.pedido = new ArrayList<>();
    }

    public boolean buscarPlato(Plato p){
        for (Plato plato : menu){
            if (plato.getNombre().equals(p.getNombre())){
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
                    String nombre = input.next();
                    p.setNombre(nombre);
                    break;
                case 2:
                    double precio = input.nextDouble();
                    p.setPrecio(precio);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public void listarPlatosCocinar(LocalDate fecha){
        System.out.println("Platos a cocinar el día: " + fecha);
        for (Pedido p : pedido){
            if(p.getFecha().equals(fecha)){
                System.out.println("Plato a cocinar: " + p.getPlato().getNombre() + " | Precio final: $" + p.calcularPrecioFinal());
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
        System.out.println("Pedidos Pendientes:");
        for (Pedido p : pedido){
            if (!p.getEntregado()){
                System.out.println(p.getPlato().getNombre() + " | " + p.getPersona().getNombre() + " " + p.getPersona().getApellido());
            }
        }
    }

    public void top3(){

    }


}