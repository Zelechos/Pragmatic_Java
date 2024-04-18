package example;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public class MySql implements IDataAccess{
    @Override
    public void insert() {
        System.out.println("insertar datos en MySql");
    }

    @Override
    public void getList() {
        System.out.println("listar datos en MySql");
    }

    @Override
    public void update() {
        System.out.println("actualizar datos en MySql");
    }

    @Override
    public void delete() {
        System.out.println("eliminar datos en MySql");
    }
}
