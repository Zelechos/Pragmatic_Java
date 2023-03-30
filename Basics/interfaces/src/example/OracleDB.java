package example;

public class OracleDB implements IDataAccess{
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
}
