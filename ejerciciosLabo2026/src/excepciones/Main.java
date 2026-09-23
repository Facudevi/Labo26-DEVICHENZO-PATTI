package excepciones;

public class Main {

    public static int obtenerLongitud(String nombre) throws LongNullException{
        if(nombre == null){

            throw new LongNullException("La longitud del nombre es nula");
        }
        return nombre.length();
    }

    public static void main(String[] args) {
        String nombre = null;

        try{
            System.out.println("El largo del nombre es: "+ nombre.length());
        } catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Juli y Devi");
        }

        try{
            Main.obtenerLongitud(nombre);
        } catch (LongNullException e){
            System.out.println(e.getMessage());
        }
    }
}