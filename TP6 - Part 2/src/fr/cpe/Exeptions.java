package fr.cpe;

public class Exeptions extends Exception {
    public Exeptions() {
        super();
    }
    public Exeptions(String message) {
        super(message);
    }
    public Exeptions(Throwable cause) {
        super(cause);
    }

    public Exeptions(String message, Throwable cause) {
        super(message, cause);
    }
}
