package cohete;

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
}