package test;

/**
 * Learn about Exception Handling
 *
 * @author Alex T.H.
 * @version v0.5.4
 * @since 20.0.0 2026-01-04
 */
public class NegativeDenominatorException extends RuntimeException {
    public NegativeDenominatorException(String message) {
        super(message);
    }

    public void randomMessage(){
        System.out.println("RUN EXCEPTION!!!!!!!!");
    }
}
