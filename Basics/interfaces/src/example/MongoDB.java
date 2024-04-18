package example;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public class MongoDB extends Encryption {
    @Override
    public void insert() {
        encryptData();
        System.out.println("insertar datos en MongoDB");
    }

    @Override
    public void getList() {
        decryptData();
        System.out.println("listar datos en MongoDB");
    }

    @Override
    public void update() {
        encryptData();
        System.out.println("actualizar datos en MongoDB");
    }

    @Override
    public void delete() {
        System.out.println("eliminar datos en MongoDB ");
    }

    @Override
    public void encryptData() {
        // some code..
        System.out.println("se encripto los datos");
    }

    @Override
    public void decryptData() {
        // some code..
        System.out.println("se desencripto los datos");
    }

    @Override
    public void isAuth() {
        System.out.println("esta autorizado para usar MongoDB");
    }

    @Override
    public void token() {
        System.out.println("Token MongoDB -> d3b71254723495hd3");
    }
}
