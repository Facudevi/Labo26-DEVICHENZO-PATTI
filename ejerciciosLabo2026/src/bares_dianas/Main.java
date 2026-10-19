package bares_dianas;

import comida.Dificultad;

public class Main {
    public static void main(String[] args) {
        Sistema_Bares sistema = new Sistema_Bares();

        Bar bar1 = new Bar("Robin Hood Pub", 120, 450000.0);
        Bar bar2 = new Bar("La Diana Roja", 85, 290000.0);

        Beneficio_Gaseosa promoGaseosas = new Beneficio_Gaseosa("2x1 en CocaCola", "Lucas");
        Beneficio_Comida promoHamburguesa = new Beneficio_Comida("Hamburguesa gratis al blanco", "Sofía");
        Beneficio_Trago promoFernet = new Beneficio_Trago("Fernet 2x1", "Martín");
        Beneficio_Trago promoMojito = new Beneficio_Trago("Mojito gratis al verde", "Martín");

        Diana diana1 = new Diana_Circular("Diana Circular", Dificultad.AVANZADO);
        Diana diana2 = new Diana_Rectangular("Diana Rectangular", Dificultad.MEDIO, 40.5, 80.0);
        Diana diana3 = new Diana_Cuadrada("Diana Cuadrada", Dificultad.FACIL, 50.0);


        promoGaseosas.agregarGaseosa("Coca Cola");
        promoGaseosas.agregarGaseosa("Sprite");
        promoHamburguesa.agregarComida("Hamburguesa Doble");
        promoHamburguesa.agregarComida("Papas Bastón");
        promoFernet.agregarTrago("Fernet Branca");
        promoMojito.agregarTrago("Tequila José Cuervo");

        sistema.registrarBeneficio(promoGaseosas);
        sistema.registrarBeneficio(promoHamburguesa);
        sistema.registrarBeneficio(promoFernet);
        sistema.registrarBeneficio(promoMojito);


        diana1.agregarFranja(100, Color_Diana.ROJO);
        diana1.agregarFranja(50, Color_Diana.AMARILLO);
        diana1.agregarFranja(20, Color_Diana.NEGRO);

        diana2.agregarFranja(100, Color_Diana.ROJO);
        diana2.agregarFranja(80, Color_Diana.VERDE);
        diana2.agregarFranja(60, Color_Diana.AMARILLO);
        diana2.agregarFranja(40, Color_Diana.BLANCO);
        diana2.agregarFranja(10, Color_Diana.NEGRO);

        diana3.agregarFranja(100, Color_Diana.ROJO);
        diana3.agregarFranja(30, Color_Diana.VERDE);

        sistema.registrarDiana(diana1);
        sistema.registrarDiana(diana2);
        sistema.registrarDiana(diana3);


        bar1.agregarDiana(diana1);
        bar1.agregarDiana(diana2);
        bar1.agregarBeneficio(promoGaseosas);
        bar1.agregarBeneficio(promoFernet);
        bar1.agregarBeneficio(promoMojito);

        bar2.agregarDiana(diana3);
        bar2.agregarBeneficio(promoHamburguesa);
        bar2.agregarBeneficio(promoFernet);

        sistema.registrarBar(bar1);
        sistema.registrarBar(bar2);


        System.out.println("-- CALCULAR ÁREA DE CADA DIANA --");
        System.out.println("Área de " + diana1.getNombre() + ": " + diana1.calcularArea() + " cm2");
        System.out.println("Área de " + diana2.getNombre() + ": " + diana2.calcularArea() + " cm2");
        System.out.println("Área de " + diana3.getNombre() + ": " + diana3.calcularArea() + " cm2");


        System.out.println("\n-- CANTIDAD DE BENEFICIOS DE TRAGOS --");
        System.out.println("Beneficios de tragos en " + bar1.getNombre() + ": " + bar1.cantidadBeneficiosTragos());
        System.out.println("Beneficios de tragos en " + bar2.getNombre() + ": " + bar2.cantidadBeneficiosTragos());


        System.out.println("\n-- DIANA CON MÁS CANTIDAD DE PUNTAJES --");
        Diana diana = sistema.dianaConMasPuntajes();
        System.out.println("La diana con más puntajes es: " + diana.getNombre());
    }
}