package empresas_negocios.electronica;
import tecnologia.Producto;
import tecnologia.productos_electronica.*;
import tecnologia.productos_electronica.cargadores.Cargador_Portatil;
import tecnologia.productos_electronica.multimedia.Equipo_Sonido;
import tecnologia.productos_electronica.multimedia.Tecnologia_TV;
import tecnologia.productos_electronica.multimedia.Televisor;

public class Main_Electronica {
    public static void main(String[] args){
        Tienda_Electronica tienda = new Tienda_Electronica();

        Equipo_Sonido sonido1 = new Equipo_Sonido("Parlante", 25.99, 10, true);
        Televisor televisor1 = new Televisor("Samsung TV", 42.99, 5, Tecnologia_TV.FULL_HD, 1080);
        Televisor televisor2 = new Televisor("LG TV", 50.99, 7, Tecnologia_TV.CUATRO_K, 2160);
        Cargador_Portatil cargador1 = new Cargador_Portatil("Cargador Universal", 12.05, 20, 40);

        tienda.agregarProducto(sonido1);
        tienda.agregarProducto(televisor1);
        tienda.agregarProducto(televisor2);
        tienda.agregarProducto(cargador1);
        tienda.agregarProducto(sonido1);

        System.out.println("-- MOSTRAR PRODUCTOS --");
        for (Producto p : tienda.getListaProductos()){
            System.out.println(p);
        }

        System.out.println("-- MODIFICAR PRODUCTO --");
        tienda.modificar(televisor2);

        System.out.println("-- PRODUCTO CON MAYOR STOCK --");
        System.out.println(tienda.obtenerMayorStock());

        System.out.println("-- PRODUCTO CON MENOR STOCK --");
        System.out.println(tienda.obtenerMenorStock());

        System.out.println("-- MOSTRAR PRODUCTOS DE UNA SECCION DETERMINADA --");
        tienda.mostrarDetalleSeccion(Seccion.MULTIMEDIA);

        System.out.println("-- ELIMINAR PRODUCTO --");
        tienda.eliminarProducto(televisor1);
    }
}