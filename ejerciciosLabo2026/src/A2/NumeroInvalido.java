package A2;

public class NumeroInvalido extends RuntimeException {
    public NumeroInvalido(String message) {
        super(message);
    }

    public NumeroInvalido(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}