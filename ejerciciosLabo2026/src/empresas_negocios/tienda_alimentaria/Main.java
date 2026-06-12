package empresas_negocios.tienda_alimentaria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Empresa emp = new Empresa("Productos S.A.");

        Fresco fresco1 = new Fresco("Yogurt", 101, LocalDate.of(2026, 5, 8), "C134H", Pais.ARGENTINA, LocalDate.of(2025, 4, 25));
        Fresco fresco2 = new Fresco("Queso", 104, LocalDate.of(2026, 9, 20), "111HJ", Pais.CHILE, LocalDate.of(2025, 9, 20));
        Refrigerado refrigerado1 = new Refrigerado("Pollo", 102, LocalDate.of(2027, 11, 10), "48CCC", Pais.BRASIL, LocalDate.of(2026, 5, 31), -10.5);
        Refrigerado refrigerado2 = new Refrigerado("Patitas", 103, LocalDate.of(2026, 11, 20), "5CZI1", Pais.ARGENTINA, LocalDate.of(2025, 5, 10), -3.5);
        Refrigerado refrigerado3 = new Refrigerado("Carne", 105, LocalDate.of(2028, 1, 1), "TREB2", Pais.URUGUAY, LocalDate.of(2026, 5, 18), -11.5);

        // agrego productos a la lista de la empresa
        System.out.println("-- AGREGAR PRODUCTOS --");
        emp.agregarProducto(refrigerado1);
        emp.agregarProducto(refrigerado3);
        emp.agregarProducto(fresco1);
        emp.agregarProducto(fresco2);
        emp.agregarProducto(refrigerado2);

        // producto ya agregado, debe decir error
        emp.agregarProducto(fresco1);

        // obtener info de ciertos productos
        System.out.println("-- OBTENER INFO --");
        emp.obtenerInfo(fresco1);
        emp.obtenerInfo(refrigerado2);

        // mostrar numero de lote de envasado más recientemente
        System.out.println("-- NUM. LOTE DEL MÁS RECIENTEMENTE ENVASADO --");
        System.out.println(emp.envasadoRecientemente());

        // mostrar cantidad de productos de la empresa por pais
        System.out.println("-- CANTIDAD PRODUCTOS POR PAIS --");
        emp.cantidadPorPais();

        // info nutricional
        System.out.println("-- INFO NUTRICIONAL --");
        System.out.println(fresco1.infoNutricional());
        System.out.println(refrigerado1.infoNutricional());
    }
}
