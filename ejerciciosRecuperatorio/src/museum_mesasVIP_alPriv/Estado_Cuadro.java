package museum_mesasVIP_alPriv;

public enum Estado_Cuadro {
    UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10);

    private int estado;

    private Estado_Cuadro(int estado){ this.estado = estado; }

    public int getEstado(){ return estado; }
}