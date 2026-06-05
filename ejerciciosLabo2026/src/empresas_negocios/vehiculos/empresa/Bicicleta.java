package empresas_negocios.vehiculos.empresa;

import colores.Color;

import java.time.LocalDate;

public class Bicicleta extends Vehiculo{

    public Bicicleta(Marca marca, String modelo, Color color, int cantRuedas, LocalDate fechaFabric) {
        super(marca, modelo, color, cantRuedas, fechaFabric);
    }

    public void mostrarDetalleBicicleta(){
        System.out.println("--Bicicleta--");
        super.mostrarDatos();
    }
}