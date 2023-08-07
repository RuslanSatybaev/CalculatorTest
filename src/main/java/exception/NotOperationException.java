package exception;

public class NotOperationException extends RuntimeException {
    public NotOperationException(String message) {
        super(message);
    }
}