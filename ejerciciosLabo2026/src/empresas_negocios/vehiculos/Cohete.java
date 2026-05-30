package empresas_negocios.vehiculos;
import seres_vivos.Tecnico;
import java.time.LocalDate;
import java.util.Scanner;

public class Cohete {
    private String nombre;
    private int velMax;
    private double largo;
    private double ancho;
    private int cantP;

    public Cohete(String nombre, int velMax, double largo, double ancho, int cantP){
        this.nombre = nombre;
        this.velMax = velMax;
        this.largo = largo;
        this.ancho = ancho;
        this.cantP = cantP;
    }

    public String getNombre() {
        return nombre;
    }
    public int getVelMax() {
        return velMax;
    }
    public double getLargo() {
        return largo;
    }
    public int getCantP() {
        return cantP;
    }

    public boolean despegar(){
        if ((cantP >= 2) && (velMax > 25000)){
            return true;
        }
        return false;
    }

    public void activar(int cant){
        if (despegar()){
            System.out.println("Despegando...");
            if (cant > cantP){
                System.out.println("¡Error! Al querer activar más propulsores de los que el cohete tiene, no se ha activado ninguno");
            }
            else {
                for (int i=0; i<cant; i++){
                    System.out.println("Propulsor " + (i+1) + " activado");
                }
            }
        }
        else {
            System.out.println("El cohete no logró despegar");
        }
    }

    public double tiempo (double distancia){
        if (distancia <= 0){
            return -1;
        }
        else {
            return (distancia / velMax);
        }
    }

    public static void main(String[] args) {
        int distancia;
        Scanner input = new Scanner(System.in);
        Cohete cohete1 = new Cohete("Jeffrey", 27500, 40, 60, 5);
        Cohete cohete2 = new Cohete("Trempstein", 10500, 80, 50, 8);
        Cohete cohete3 = new Cohete("Castor", 35000, 100, 70, 3);
        Tecnico tec1 = new Tecnico("Facundo", "Gonzalez", LocalDate.of(1980, 5, 18), "Av. del Castillo 3002","Propulsion", cohete1);
        Tecnico tec2 = new Tecnico("Agustin", "Gomez", LocalDate.of(1991, 11, 28), "Aquino 900","Navegacion", cohete2);

        tec1.tecActivar();
        System.out.println("Cuanta distancia recorre el cohete?:");
        distancia = input.nextInt();
        System.out.println(cohete3.tiempo(distancia));
        tec1.cambiar(cohete3);
        tec2.cambiar(cohete1);
    }
}