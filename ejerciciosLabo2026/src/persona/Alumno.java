package persona;
import colegio.Materia;
import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private String division;
    private ArrayList<Float> listaNotas;
    private ArrayList<Materia> listaMaterias;

    public Alumno(String nombre, String apellido, LocalDate fecha, String direccion, String division, ArrayList<Float> listaNotas, ArrayList<Materia> listaMaterias) {
        super(nombre, apellido, fecha, direccion);
        this.division = division;
        this.listaNotas = listaNotas;
        this.listaMaterias = listaMaterias;
    }

    public String getDivision() {
        return division;
    }
    public ArrayList<Float> getListaNotas() {return listaNotas;}
    public ArrayList<Materia> getListaMaterias() {return listaMaterias;}

    public void setDivision(String division) {
        this.division = division;
    }
    public void setListaNotas(ArrayList<Float> listaNotas) {this.listaNotas = listaNotas;}
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
            if (menor < notaMenor){
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