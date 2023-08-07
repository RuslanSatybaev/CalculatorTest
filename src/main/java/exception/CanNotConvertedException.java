package exception;

public class CanNotConvertedException extends RuntimeException {
    public CanNotConvertedException(String message) {
        super(message);
    }
}