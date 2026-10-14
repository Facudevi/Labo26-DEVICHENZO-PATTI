package elecciones;
import colores.Color;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Partido_Politico partido = new Partido_Politico("Frente Estudiantil", "Av. Siempre Viva 123", 150);

        Paloma_Mensajera paloma = new Paloma_Mensajera("Paloma", Color.BLANCO, "Mensajera", true);
        Paloma_Mensajera palomaSinVuelo = new Paloma_Mensajera("Pepa", Color.GRIS, "Mensajera", false);

        Telefono_Movil celular = new Telefono_Movil("SN-001", "Samsung", "A54", Compania.CLARO, 112233445, true);
        Telefono_Movil celularSinCredito = new Telefono_Movil("SN-002", "Motorola", "G20", Compania.PERSONAL, 115566778, false);

        Trabajador trabajador = new Trabajador("Juan", "Perez", LocalDate.of(1990, 3, 15), "Calle 50", "30123456", 20301234, 500000, true);
        Trabajador trabajadorFueraDeHorario = new Trabajador("Ana", "Lopez", LocalDate.of(1985, 7, 20), "Calle 60", "27987654", 27279876, 600000, false);

        partido.agregarMensajero(paloma);
        partido.agregarMensajero(palomaSinVuelo);
        partido.agregarMensajero(celular);
        partido.agregarMensajero(celularSinCredito);
        partido.agregarMensajero(trabajador);
        partido.agregarMensajero(trabajadorFueraDeHorario);

        System.out.println("-- PARTIDO " + partido.getNombre() + " --");
        System.out.println("Afiliados: " + partido.getCantAfiliados() + " | Direccion: " + partido.getDireccion());
        System.out.println("Mensajeros registrados: " + partido.getListaMensajeros().size());

        System.out.println("-- HACER CAMPAÑA --");
        partido.hacerCampania();
    }
}
