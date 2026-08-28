package mediciones;

public class Medicion {
    private double peso;
    private int altura;

    public Medicion(double peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() { return peso; }
    public int getAltura() { return altura; }

    public void setPeso(double peso) { this.peso = peso; }
    public void setAltura(int altura) { this.altura = altura; }
}