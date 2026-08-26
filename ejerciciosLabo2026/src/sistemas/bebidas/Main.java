package sistemas.bebidas;
import bebidas.Alcoholica;
import bebidas.Azucarada;
import bebidas.Bebida;
import bebidas.Neutra;
import seres_vivos.humanos.personas.Persona_Bebida;

public class Main {
    public static void main(String[] args){
        Sistema_Bebida sistema = new Sistema_Bebida();

        Bebida agua = new Neutra("Agua", 40, 0);
        Bebida coca = new Azucarada("Coca-Cola", 5);
        Bebida vino = new Alcoholica("Vino", 10);

        Persona_Bebida juan = new Persona_Bebida("Juan", "Perez", "40123456");
        Persona_Bebida maria = new Persona_Bebida("Maria", "Gomez", "38998877");

        sistema.agregarPersona(juan);
        sistema.agregarPersona(maria);
        sistema.agregarPersona(maria);

        juan.elegirBebida(agua, 2);
        juan.elegirBebida(vino, 1);

        maria.elegirBebida(coca, 3);
        maria.elegirBebida(vino, 2);

        System.out.println("---- Consumos ----");
        juan.mostrarCoeficiente();
        System.out.println();
        maria.mostrarCoeficiente();

        System.out.println("---- Mejor coeficiente ----");
        sistema.mejorCoeficiente().mostrarCoeficiente();

        System.out.println("---- Peor coeficiente ----");
        sistema.peorCoeficiente().mostrarCoeficiente();
    }
}