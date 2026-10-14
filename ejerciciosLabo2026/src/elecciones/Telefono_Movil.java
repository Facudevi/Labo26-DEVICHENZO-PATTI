package elecciones;
import tecnologia.Dispositivo;

public class Telefono_Movil extends Dispositivo implements Mensajero {
    private Compania compania;
    private int numCelular;
    private boolean prendido;
    private int credito;

    public Telefono_Movil(String numSerie, String fabricante, String modelo, Compania compania, int numCelular, boolean prendido) {
        super(numSerie, fabricante, modelo);
        this.compania = compania;
        this.numCelular = numCelular;
        this.prendido = prendido;
        this.credito = 50;
    }

    public Compania getCompania() { return compania; }
    public int getNumCelular() { return numCelular; }
    public boolean isPrendido() { return prendido; }
    public int getCredito() { return credito; }


    @Override
    public String enviarMensaje() {
        if (!isPrendido() || getCredito()<1) {
            throw new NoPuedeEnviarMensajeException("El telefono no puede enviar el mensaje");
        }
        return mensaje();
    }

    @Override
    public String mensaje() {
        return "Vote por el partido para un mejor futuro. Conectando con la antena más cercana”";
    }
}