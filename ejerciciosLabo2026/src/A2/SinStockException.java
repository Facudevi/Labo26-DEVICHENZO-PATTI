package A2;

public class SinStockException extends RuntimeException {
    public SinStockException(String message) {
        super(message);
    }

    public SinStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}