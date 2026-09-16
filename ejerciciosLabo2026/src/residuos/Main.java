package residuos;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Sistema_Residuo sistema = new Sistema_Residuo();

        Tipo_Residuo papel = new Tipo_Residuo("Papel", true, "Reciclaje seco en fardos");
        Tipo_Residuo plastico = new Tipo_Residuo("Plástico", true, "Tratamiento y triturado");
        Tipo_Residuo organico = new Tipo_Residuo("Orgánico", false, "Compostaje o disposición final");
        Tipo_Residuo electronicos = new Tipo_Residuo("Electrónicos", false, "Desmantelamiento especial");
        Tipo_Residuo carton = new Tipo_Residuo("Cartón", true, "Prensado y reciclaje");

        Punto_Recoleccion punto1 = new Punto_Recoleccion("Av. Medrano 951", -34.5986, -58.4201, "Almagro", "Escuela");
        Punto_Recoleccion punto2 = new Punto_Recoleccion("Sarmiento 3900", -34.6058, -58.4190, "Almagro", "Plaza Almagro");
        Punto_Recoleccion punto3 = new Punto_Recoleccion("Calle 123", -33.0084, -60.6664, "Rosario", "Mac Donalds");

        Camion_Residuo camion1 = new Camion_Residuo("AA123CD", "Mercedes-Benz", "Atego", 500.0);
        Camion_Residuo camion2 = new Camion_Residuo("AB987ZY", "Ford", "Cargo", 50.0);

        ArrayList<Punto_Recoleccion> recorridoLargo = new ArrayList<>();
        ArrayList<Punto_Recoleccion> recorridoCorto = new ArrayList<>();


        sistema.registrarNuevoTipo(papel);
        sistema.registrarNuevoTipo(plastico);
        sistema.registrarNuevoTipo(organico);
        sistema.registrarNuevoTipo(electronicos);
        sistema.modificarTipo(electronicos, carton);

        sistema.agregarResiduoAceptado(papel, 50, punto1);
        sistema.agregarResiduoAceptado(plastico, 30, punto1);
        sistema.agregarResiduoAceptado(organico, 20, punto1);
        sistema.agregarResiduoAceptado(carton, 100, punto2);
        sistema.agregarResiduoAceptado(organico, 150, punto2);
        sistema.agregarResiduoAceptado(papel, 110, punto3);
        sistema.agregarResiduoAceptado(plastico, 30, punto3);
        sistema.modificarResiduoAceptado(organico, carton, 25, punto1);
        sistema.eliminarResiduoAceptado(carton, punto1);
        sistema.agregarResiduoAceptado(organico, 20, punto1);

        sistema.agregarPuntoRecoleccion(punto1);
        sistema.agregarPuntoRecoleccion(punto2);
        sistema.agregarPuntoRecoleccion(punto3);

        camion1.autorizarResiduo(papel);
        camion1.autorizarResiduo(plastico);
        sistema.agregarCamion(camion1);
        camion2.autorizarResiduo(papel);
        camion2.autorizarResiduo(plastico);
        sistema.agregarCamion(camion2);

        recorridoLargo.add(punto1);
        recorridoLargo.add(punto3);
        recorridoCorto.add(punto1);
        recorridoCorto.add(punto2);


        System.out.println("-- CONSULTAR RECICLABLES --");
        sistema.consultarReciclables();


        System.out.println("-- BUSCAR PUNTO MEDIANTE DIRECCIÓN --");
        Punto_Recoleccion puntoBuscado = sistema.buscarPuntoPorDireccion("Av. Medrano 951");
        if (puntoBuscado != null) System.out.println("Punto encontrado por dirección: " + puntoBuscado.getNombre());


        System.out.println("-- UN PUNTO RECIBE UN TIPO DETERMINADO --");
        boolean recibePapel = sistema.consultarTipo(punto1, papel);
        System.out.println("¿La escuela recibe Papel?: " + recibePapel);


        System.out.println("-- MOSTRAR PUNTOS DE UN BARRIO --");
        sistema.puntosPorBarrio("Almagro");


        System.out.println("-- LISTA DE PUNTOS QUE RECIBEN CIERTO RESIDUO --");
        HashSet<Punto_Recoleccion> puntosConPapel = sistema.puntoQueRecibeCiertoResiduo(plastico);
        System.out.println("Puntos que reciben Plástico:");
        for (Punto_Recoleccion pr : puntosConPapel) {
            System.out.println("- " + pr.getNombre());
        }


        System.out.println("-- CANTIDAD DE PUNTOS EN UN BARRIO QUE TIENEN CIERTO RESIDUO --");
        sistema.puntosParaCadaResiduoPorBarrio("Almagro");


        System.out.println("-- INICIO DE RECOLECCIONES --");
        // Se superan 45km
        sistema.iniciarRecoleccion(camion1, recorridoLargo);
        // Se supera capacidad max
        sistema.iniciarRecoleccion(camion2, recorridoCorto);
        // Prueba exitosa
        sistema.iniciarRecoleccion(camion1, recorridoCorto);


        System.out.println("-- PORCENTAJE DE EFICIENCIA --");
        double eficiencia = sistema.porcentajeEficienciaRegistros();
        System.out.println("Porcentaje de eficiencia de recolección: " + eficiencia + "%");
    }
}