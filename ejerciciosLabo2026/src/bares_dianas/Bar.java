package bares_dianas;

import java.util.HashSet;

public class Bar {
    public String nombre;
    public int cantClientes;
    public double dineroRecaudado;
    public HashSet<Diana> dianas;
    public HashSet<Beneficio> beneficios;
    public HashSet<Acumulable> acumulables;

    public Bar(String nombre, int cantClientes, double dineroRecaudado) {
        this.nombre = nombre;
        this.cantClientes = cantClientes;
        this.dineroRecaudado = dineroRecaudado;
        this.dianas = new HashSet<>();
        this.beneficios = new HashSet<>();
        this.acumulables = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public HashSet<Acumulable> getAcumulables() {
        return acumulables;
    }

    public void agregarDiana(Diana d){
        dianas.add(d);
    }

    public void agregarBeneficio(Beneficio b){
        beneficios.add(b);
        if (!b.esTrago()) acumulables.add((Acumulable) b);
    }

    public int cantidadBeneficiosTragos(){
        int cant = 0;
        for (Beneficio b : beneficios){
            if (b.esTrago()) cant++;
        }
        return cant;
    }
}