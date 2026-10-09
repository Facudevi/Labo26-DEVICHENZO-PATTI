package prestar;

public interface Prestable {
    String prestado();
    boolean puedePrestarse() throws CondicionesException;
}