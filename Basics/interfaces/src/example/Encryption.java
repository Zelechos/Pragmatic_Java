package example;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public abstract class Encryption implements IDataAccess, IAuth{

    public abstract void encryptData();

    public abstract void decryptData();
}
