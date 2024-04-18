package example;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public class OracleDB implements IDataAccess, IAuth{
    @Override
    public void insert() {
        System.out.println("insertar datos en Oracle");
    }

    @Override
    public void getList() {
        System.out.println("listar datos en Oracle");
    }

    @Override
    public void update() {
        System.out.println("actualizar datos en Oracle");
    }

    @Override
    public void delete() {
        System.out.println("eliminar datos en Oracle");
    }

    @Override
    public void isAuth() {
        System.out.println("esta autorizado");
    }

    @Override
    public void token() {
        System.out.println("token => d-024-850923745h-234-5");
    }
}
