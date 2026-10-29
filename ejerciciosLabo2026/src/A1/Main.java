package A1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Sistema s = new Sistema();

        Aprendiz a1 = new Aprendiz("Juan", "Gomez", LocalDate.of(1999, 8, 20), "Aldea Dulce", Taller.VERDE);
        Aprendiz a2 = new Aprendiz("Juani", "Martinez", LocalDate.of(1999, 10, 26), "Aldea Dulce", Taller.ROJO);
        Oficial o1 = new Oficial("Maria", "Sanchez", LocalDate.of(1999, 1, 12), "Aldea Navideña", Taller.ROJO);
        Maestro_Artesano m1 = new Maestro_Artesano("Sofia", "Araujo", LocalDate.of(1980, 2, 10), "Aldea Feliz", Taller.DORADO);

        Regalo r1 = new Regalo("PlayMobil", Tamanio.PEQUENIO);
        Regalo r2 = new Regalo("Casa de muñecas", Tamanio.MEDIANO);
        Regalo r3 = new Regalo("Auto", Tamanio.GRANDE);

        a1.agregarMaterialesProhibidos("Metal");
        a2.agregarMaterialesProhibidos("Plastico");
        o1.agregarStock("Plastico", 2);
        o1.agregarStock("Pintura", 2);
        o1.agregarStock("Tornillos", 2);

        r1.agregarMaterial("Plastico");
        r1.agregarMaterial("Pintura");
        r1.agregarMaterial("Tornillos");
        r2.agregarMaterial("Plastico");
        r2.agregarMaterial("Pintura");
        r2.agregarMaterial("Tornillos");
        r3.agregarMaterial("Plastico");
        r3.agregarMaterial("Pintura");
        r3.agregarMaterial("Tornillos");

        s.agregarAyudante(a1);
        s.agregarAyudante(a2);
        s.agregarAyudante(o1);
        s.agregarAyudante(m1);
        s.agregarRegalo(r1);
        s.agregarRegalo(r2);
        s.agregarRegalo(r3);


        s.prepararRegalo(r1);
        s.prepararRegalo(r2);
        s.prepararRegalo(r3);
    }
}