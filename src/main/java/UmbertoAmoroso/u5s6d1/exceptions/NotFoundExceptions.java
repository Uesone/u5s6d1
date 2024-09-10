package UmbertoAmoroso.u5s6d1.exceptions;

public class NotFoundExceptions extends RuntimeException {
    public NotFoundExceptions(int id) {
        super("Elemento con ID " + id + " non trovato");
    }
}