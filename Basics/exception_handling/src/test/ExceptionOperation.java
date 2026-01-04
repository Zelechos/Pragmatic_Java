package test;

/**
 * Learn about Exception Handling
 *
 * @author Alex T.H.
 * @version v0.5.4
 * @since 20.0.0 2026-01-04
 */
public class ExceptionOperation extends Exception { // En la actualidad se recomienda usar la class RuntimeException

    public ExceptionOperation(String message) {
        super(message);
    }
}
