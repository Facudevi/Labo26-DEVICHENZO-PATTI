package comida;

public class Cafeteria {
    private  double cantidadMaximaCafe;
    private  double cantidadActualCafe;

    public  Cafeteria(){
        this.cantidadActualCafe = 1000;
        this.cantidadMaximaCafe = 0;
    }
    public  Cafeteria(double cantidadMaximaCafe){
        this.cantidadActualCafe = cantidadMaximaCafe;
        this.cantidadMaximaCafe = cantidadMaximaCafe;
    }
    public  Cafeteria(double cantidadMaximaCafe, double cantidadActualCafe){
        if(cantidadMaximaCafe < cantidadActualCafe){
            this.cantidadActualCafe = cantidadMaximaCafe;
            this.cantidadMaximaCafe = cantidadMaximaCafe;
        }
        else {
            this.cantidadActualCafe = cantidadMaximaCafe;
            this.cantidadMaximaCafe = cantidadMaximaCafe;
        }
    }
    public void llenarCafetera(){
        this.cantidadActualCafe =this.cantidadMaximaCafe;
    }
    public void servirTaza(double capacidad){
        if(this.cantidadActualCafe < capacidad){
            this.cantidadActualCafe = 0;
        }
        else {
            this.cantidadActualCafe -= capacidad;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActualCafe = 0;
    }

    public void agregarCafe(double catidad){
        if(catidad > cantidadMaximaCafe){
            this.cantidadActualCafe = this.cantidadMaximaCafe;
        }
        this.cantidadActualCafe = catidad;
    }
}