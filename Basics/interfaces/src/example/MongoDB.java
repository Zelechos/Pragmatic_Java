package example;

public class MongoDB extends Encryption{
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
}
