package elecciones;

public interface Mensajero {
    String enviarMensaje() throws NoPuedeEnviarMensajeException;
    String mensaje();
}