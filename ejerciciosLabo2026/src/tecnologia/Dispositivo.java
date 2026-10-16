package tecnologia;

public abstract class Dispositivo {
    private String numSerie, fabricante, modelo;

    public Dispositivo(String numSerie, String fabricante, String modelo) {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getNumSerie() { return numSerie; }
    public String getFabricante() { return fabricante; }
    public String getModelo() { return modelo; }
}