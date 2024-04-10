package fr.cpe.zoo.base;

public class Problemes extends Exception{
    public Problemes() {
        super();
    }
    public Problemes(String message) {
        super(message);
    }
    public Problemes(Throwable cause) {
        super(cause);
    }

    public Problemes(String message, Throwable cause) {
        super(message, cause);
    }
}
