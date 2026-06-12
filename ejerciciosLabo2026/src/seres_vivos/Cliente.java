package seres_vivos;

public class Cliente extends Persona{
    private String celular;

    public Cliente(String nombre, String apellido, String celular) {
        super(nombre, apellido);
        this.celular = celular;
    }

    public String getCelular(){ return celular; }
    public void setCelular(String celular){ this.celular = celular; }


    public String mostrarDetalle(){
        imprimirDatos();
        return imprimirDatos() + "Celular: " + this.celular;
    }
}