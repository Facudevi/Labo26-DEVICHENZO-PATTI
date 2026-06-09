package empresas_negocios.telefonia;
import seres_vivos.Empleado;

public class Local extends Llamada{
    private Provincia provOrigen;
    private Provincia provDestino;
    private double costoPorMinuto;

    public Local(Empleado empleadoOrigen, Empleado empleadoDestino, int duracion, Provincia provOrigen, Provincia provDestino) {
        super(empleadoOrigen, empleadoDestino, duracion);
        this.provOrigen = provOrigen;
        this.provDestino = provDestino;
        this.costoPorMinuto = 10.5;
    }

    public Provincia getProvOrigen() { return provOrigen; }
    public Provincia getProvDestino() { return provDestino; }
    public double getCostoPorMinuto() {return costoPorMinuto;}

    public void setProvOrigen(Provincia provOrigen) { this.provOrigen = provOrigen; }
    public void setProvDestino(Provincia provDestino) { this.provDestino = provDestino; }
    public void setCostoPorMinuto(double costoPorMinuto) {this.costoPorMinuto = costoPorMinuto;}


    @Override
    public double calcularCosto() {
        return getDuracion() * costoPorMinuto;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " | Provincia origen: " + provOrigen.name()
                + " | Provincia destino: " + provDestino.name()
                + " | Llamada Local ";
    }
}