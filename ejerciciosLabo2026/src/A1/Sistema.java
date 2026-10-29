package A1;

import java.util.HashSet;

public class Sistema {
    private HashSet<Ayudante> ayudantes;
    private HashSet<Regalo> regalos;

    public Sistema() {
        this.ayudantes = new HashSet<>();
        this.regalos = new HashSet<>();
    }

    public HashSet<Ayudante> getAyudantes() {
        return ayudantes;
    }

    public HashSet<Regalo> getRegalos() {
        return regalos;
    }

    public void agregarAyudante(Ayudante a){
        ayudantes.add(a);
    }

    public void agregarRegalo(Regalo r){
        regalos.add(r);
    }

    public void prepararRegalo(Regalo r) throws ProduccionRegalosException{
        if (regalos.contains(r)) {
            for (Ayudante a : ayudantes) {
                try {
                    a.prepararEstacion();
                    a.fabricarRegalo(r);
                    a.envolverRegalo(r);
                } catch (ProduccionRegalosException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        else {
            System.out.println("El regalo no se encuentra en el sistema del Polo Norte");
        }
    }
}