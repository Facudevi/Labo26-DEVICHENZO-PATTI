package telefonia;
import persona.Empleado;

public class Local extends Llamada{
    private String provOrigen;
    private String provDestino;
    private double costoPorMinuto;

    public Local(Empleado empleadoOrigen, Empleado empleadoDestino, int duracion, String provOrigen, String provDestino) {
        super(empleadoOrigen, empleadoDestino, duracion);
        this.provOrigen = provOrigen;
        this.provDestino = provDestino;
        this.costoPorMinuto = 10.5;
    }

    public String getProvOrigen() { return provOrigen; }
    public String getProvDestino() { return provDestino; }
    public double getCostoPorMinuto() {return costoPorMinuto;}

    public void setProvOrigen(String provOrigen) { this.provOrigen = provOrigen; }
    public void setProvDestino(String provDestino) { this.provDestino = provDestino; }
    public void setCostoPorMinuto(double costoPorMinuto) {this.costoPorMinuto = costoPorMinuto;}


    @Override
    public double calcularCosto() {
        return getDuracion() * costoPorMinuto;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " | Provincia origen: " + provOrigen
                + " | Provincia destino: " + provDestino
                + " | Llamada local ";
    }
}