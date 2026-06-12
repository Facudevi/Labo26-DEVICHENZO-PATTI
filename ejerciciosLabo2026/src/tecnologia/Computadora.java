package tecnologia;
import tecnologia.componentes.Componente;
import tecnologia.componentes.hardware.CPU;

import java.util.ArrayList;

public class Computadora {
    private CPU cpu;
    private ArrayList<Componente> perifericos;

    public Computadora(CPU cpu) {
        this.cpu = cpu;
        this.perifericos = new ArrayList<>();
    }

    public void agregarPeriferico(Componente c) {
        this.perifericos.add(c);
    }

    public CPU getCpu() { return cpu; }
    public ArrayList<Componente> getPerifericos() { return perifericos; }


    public boolean cumpleMinimoCompra() {
        int contEntrada = 0;
        int contSalida = 0;

        for (Componente c : perifericos) {
            if (c.getCategoria().equals("Entrada")) {
                contEntrada++;
            }
            if (c.getCategoria().equals("Salida")) {
                contSalida++;
            }
        }

        if (cpu != null && contEntrada >= 1 && contSalida >= 1) {
            return true;
        }
        return false;
    }


    public double calcularPrecioComponentes() {
        double total = cpu.getPrecioVenta();
        for (Componente c : perifericos) {
            total += c.getPrecioVenta();
        }
        return total;
    }


    public void mostrarCantidadPorTipo() {
        int contEntrada = 0;
        int contSalida = 0;

        for (Componente c : perifericos) {
            if (c.getCategoria().equals("Entrada")) {
                contEntrada++;
            }
            if (c.getCategoria().equals("Salida")) {
                contSalida++;
            }
        }
        System.out.println("Componentes de Entrada: " + contEntrada);
        System.out.println("Componentes de Salida: " + contSalida);
    }
}