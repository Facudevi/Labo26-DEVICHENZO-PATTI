package biblioteca_virtual;

public enum Tipo_Membresia {
    BRONCE(5), PLATA(15), ORO(50);

    private int prestamo;
    private Tipo_Membresia(int prestamo){
        this.prestamo = prestamo;
    }
    public int getPrestamo(){ return prestamo; }
}