package example;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public class Firebase extends Encryption {
    @Override
    public void insert() {
        System.out.println("insertar datos en Firebase");
    }

    @Override
    public void getList() {
        System.out.println("listar datos en Firebase");
    }

    @Override
    public void update() {
        System.out.println("actualizar datos en Firebase");
    }

    @Override
    public void delete() {
        System.out.println("eliminar datos en Firebase");
    }

    @Override
    public void encryptData() {
        System.out.println("encriptando datos de Firebase");
    }

    @Override
    public void decryptData() {
        System.out.println("desencriptando datos de Firebase");
    }

    @Override
    public void isAuth() {
        System.out.println("autorizado para usar Firebase");
    }

    @Override
    public void token() {
        System.out.println("Token Firebase -> d1092b347123401f23h");
    }
}
