package tecnologia.componentes.hardware;
import tecnologia.componentes.Componente;

public class CPU extends Componente {
    public CPU(String fabricante, String modelo, double precioVenta, int stock) {
        super(fabricante, modelo, precioVenta, stock);
    }


    @Override
    public String getCategoria() {
        return "CPU";
    }


    @Override
    public String getNombreComponente() {
        return "CPU " + getFabricante() + " " + getModelo();
    }
}