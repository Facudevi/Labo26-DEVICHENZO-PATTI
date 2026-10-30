package A2;

public class Main {
    public static void main(String[] args){
        Sistema s = new Sistema();

        Brownie p1 = new Brownie(12,3,32,1,5,20.5,21);
        Cookie p2 = new Cookie(1,1,1,10, 5, 30, 21, Topping.NUTELLA);
        Bizcochuelo p3 = new Bizcochuelo(12,12,32,1,10, 30.5, 11, 7);

        System.out.println("AGREGAR PREPARACIONES");
        try {
            s.nuevaPreparacion(p1);
            s.nuevaPreparacion(p2);
            s.nuevaPreparacion(p3);
        } catch (NumeroInvalido e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nREPONER STOCK");
        try {
            s.reponerProducto(p1,3);
            s.reponerProducto(p2,1);
            s.reponerProducto(p3,2);
        } catch (NumeroInvalido e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nREGISTRAR VENTA");
        try {
            s.registrarVenta(p1, 2);
            s.registrarVenta(p2, 5);
            s.registrarVenta(p1, 100);
        } catch (SinStockException e) { // CORREGIDO: faltaba el tipo, la variable y el bloque del catch
            System.out.println(e.getMessage());
        }

        System.out.println("\nCANTIDAD DE PRODUCTOS VENDIBLES");
        s.productosVendibles();



    }
}