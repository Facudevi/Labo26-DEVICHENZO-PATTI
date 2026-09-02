package fecha;

public enum Dia {
    LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);

    private int diaN;

    Dia(int diaN) { this.diaN = diaN; }

    public int getDiaN() { return diaN; }
}
