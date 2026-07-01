package comida.platos;
import comida.Dificultad;
import comida.Plato;

public class Entrada extends Plato {
    private Estado_Entrada estado;

    public Entrada(String nombre, Dificultad dificultad, Tipo tipo, Estado_Entrada estado) {
        super(nombre, dificultad, tipo);
        this.estado = estado;
    }

    public Entrada(String nombre, double precio, Estado_Entrada estado) {
        super(nombre, precio);
        this.estado = estado;
    }

    public Estado_Entrada getEstado() { return estado; }
    public void setEstado(Estado_Entrada estado) { this.estado = estado; }


    @Override
    public String toString() {
        if(this.estado.equals(Estado_Entrada.FRIO)){
            return "Pasos: " + getListaPasos() +
                    "\n" + "- Guardar la preparación en la headera -";
        }
        else {
            return "- Recordar prender el horno -" +
                    "\nPasos: " + getListaPasos();
        }
    }
}