package test;

/**
 * Learn about Exception Handling
 *
 * @author Alex T.H.
 * @version v0.4.9
 * @since 20.0.0 2024-07-10
 */
public class ExceptionOperation extends Exception { // En la actualidad se recomienda usar la class RuntimeException

    public ExceptionOperation(String message) {
        super(message);
    }
}
