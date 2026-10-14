package elecciones;

public class NoPuedeEnviarMensajeException extends RuntimeException {
    public NoPuedeEnviarMensajeException(String message) {
        super(message);
    }
}