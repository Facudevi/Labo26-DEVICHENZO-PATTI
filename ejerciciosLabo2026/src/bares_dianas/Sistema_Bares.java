package bares_dianas;

import java.util.HashSet;

public class Sistema_Bares {
    public HashSet<Bar> listaBares;
    public HashSet<Diana> listaDianas;
    public HashSet<Beneficio> listaBeneficios;

    public Sistema_Bares() {
        this.listaBares = new HashSet<>();
        this.listaDianas = new HashSet<>();
        this.listaBeneficios = new HashSet<>();
    }

    public void registrarBar(Bar b) {
        listaBares.add(b);
    }

    public void registrarDiana(Diana d) {
        listaDianas.add(d);
    }

    public void registrarBeneficio(Beneficio b) {
        listaBeneficios.add(b);
    }

    public Diana dianaConMasPuntajes(){
        Diana diana = null;
        int puntaje = -1;

        for(Diana d : listaDianas){
            if (diana == null || d.tieneMasPuntajes(diana)){
                diana = d;
            }
        }

        return diana;
    }
}