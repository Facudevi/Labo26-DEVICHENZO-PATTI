package empresas_negocios.telefonia;
import seres_vivos.Empleado;

public class Internacional extends Llamada {
    private String codPaisDestino;
    private String franjaHoraria;
    private double costoPorMinuto;
    private double cargoInternacional;

    public Internacional(Empleado empleadoOrigen, Empleado empleadoDestino, int duracion, String codigoPaisDestino, String franjaHoraria) {
        super(empleadoOrigen, empleadoDestino, duracion);
        this.codPaisDestino = codigoPaisDestino;
        this.franjaHoraria = franjaHoraria;
        this.costoPorMinuto = 36.5;
        this.cargoInternacional = 75;
    }

    public String getCodPaisDestino() { return codPaisDestino; }
    public String getFranjaHoraria() { return franjaHoraria; }
    public double getCostoPorMinuto() { return costoPorMinuto; }
    public double getCargoInternacional() { return cargoInternacional; }

    public void setCodPaisDestino(String codPaisDestino) { this.codPaisDestino = codPaisDestino; }
    public void setFranjaHoraria(String franjaHoraria) { this.franjaHoraria = franjaHoraria; }
    public void setCostoPorMinuto(double costoPorMinuto) { this.costoPorMinuto = costoPorMinuto; }
    public void setCargoInternacional(double cargoInternacional) { this.cargoInternacional = cargoInternacional; }

    @Override
    public double calcularCosto() {
        return cargoInternacional + getDuracion() * costoPorMinuto;
    }

    @Override
    public boolean esInternacional() {
        return true;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " | Codigo pais destino: " + codPaisDestino
                + " | Franja horaria destino: " + franjaHoraria
                + " | Llamada Internacional ";
    }

    @Override
    public int obtenerMinutosAlExteriorDe(Empleado empleado) {
        if (fueRealizadaPor(empleado)) {
            return getDuracion();
        }
        return 0;
    }
}