package tecnologia.componentes.hardware;

import tecnologia.componentes.Componente;

public class CPU extends Componente {
    public CPU(String nombreFabricante, String modelo, double precioVenta, int stock) {
        super(nombreFabricante, modelo, precioVenta, stock);
    }

    @Override
    public boolean esCPU() { return true; }
}