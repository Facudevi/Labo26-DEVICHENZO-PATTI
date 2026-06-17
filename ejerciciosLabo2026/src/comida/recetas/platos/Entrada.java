package comida.recetas.platos;
import comida.recetas.Dificultad;
import comida.recetas.Plato;

public class Entrada extends Plato {
    private Estado_Entrada estado;

    public Entrada(String nombre, Dificultad dificultad, Estado_Entrada estado) {
        super(nombre, dificultad);
        this.estado = estado;
    }

    public Estado_Entrada getEstado() { return estado; }
    public void setEstado(Estado_Entrada estado) { this.estado = estado; }


    @Override
    public void mostrarDetalle() {
        if(this.estado.equals(Estado_Entrada.FRIO)){
            System.out.println("Pasos: " + getListaPasos());
            System.out.println("- Guardar la preparación en la headera -");
        }
        else {
            System.out.println("- Recordar prender el horno -");
            System.out.println("Pasos: " + getListaPasos());
        }
    }
}