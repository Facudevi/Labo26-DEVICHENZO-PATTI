package alumnado;
import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
    private String nombre, apellido;
    private LocalDate fecha;
    private ArrayList<Float> listaNotas;
    private ArrayList<Materia> listaMaterias;

    public Alumno(String nombre, String apellido, LocalDate fecha, ArrayList<Float> listaNotas, ArrayList<Materia> listaMaterias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.listaNotas = listaNotas;
        this.listaMaterias = listaMaterias;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public ArrayList<Float> getListaNotas() {
        return listaNotas;
    }
    public ArrayList<Materia> getListaMaterias() {return listaMaterias;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setListaNotas(ArrayList<Float> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public void setListaMaterias(ArrayList<Materia> listaMaterias) {this.listaMaterias = listaMaterias;}

    public void AgregarNota(float nota){
        this.listaNotas.add(nota);
    }

    public float MenorNota(){
        if(listaNotas.isEmpty()){
            return 0;
        }

        float notaMenor = this.listaNotas.get(0);
        for (float menor : this.listaNotas){
            if (menor > notaMenor){
                notaMenor = menor;
            }
        }
        return notaMenor;
    }

    public float MayorNota(){
        if(listaNotas.isEmpty()){
            return 0;
        }

        float notaMayor = this.listaNotas.get(0);
        for (float mayor : this.listaNotas){
            if (mayor > notaMayor){
                notaMayor = mayor;
            }
        }
        return notaMayor;
    }

    public void AgregarMateria(Materia nuevaMateria){
        this.listaMaterias.add(nuevaMateria);
    }

    public float PromedioNota(){
        if(listaNotas.isEmpty()){
            return 0;
        }

        int sum = 0;
        int cont = 0;
        for (float nota : listaNotas){
            sum += nota;
            cont ++;
        }
        return (sum / cont);
    }

}