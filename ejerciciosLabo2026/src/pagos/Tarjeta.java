package pagos;

public class Tarjeta extends Metodo_Pago{
    private int numTarjeta;
    private String banco;
    private Cred_Deb flujo;

    public Tarjeta(int numTarjeta, String banco, Cred_Deb flujo) {
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.flujo = flujo;
    }

    public int getNumTarjeta() { return numTarjeta; }
    public String getBanco() { return banco; }
    public Cred_Deb getFlujo() { return flujo; }

    public void setNumTarjeta(int numTarjeta) { this.numTarjeta = numTarjeta; }
    public void setBanco(String banco) { this.banco = banco; }
    public void setFlujo(Cred_Deb flujo) { this.flujo = flujo; }

    @Override
    public double recargo() {
        return 0.05;
    }

    @Override
    public String metodo() {
        return "Tipo: " + flujo +
               "\nNumero tarjeta: " + numTarjeta +
               "\nBanco: " + banco + '\n';
    }
}