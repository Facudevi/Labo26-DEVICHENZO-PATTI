package sitios_web;
import pagos.Metodo_Pago;
import persona.Cliente;
import tecnologia.Computadora;

import java.util.ArrayList;

public class Compras_Computadora {
    private Cliente cliente;
    private Metodo_Pago pago;
    private ArrayList<Computadora> listaComputadoras;

    public Compras_Computadora(Cliente cliente, Metodo_Pago pago) {
        this.cliente = cliente;
        this.pago = pago;
        this.listaComputadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computadora compu){
        if(compu.validarArmado()){
            listaComputadoras.add(compu);
        }
        else {
            System.out.println("La computadora no tiene los componentes necesarios para comprar");
        }
    }

    public double calcularPrecioFinal(){

    }
}