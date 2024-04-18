package example;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public class Main {

    public static void main(String[] args) {

        IDataAccess data;
        data = new MySql();
        getData(data);
        delete(data);

        data = new OracleDB();
        getData(data);
        put(data);
        save(data);

        IAuth auth;
        auth = new OracleDB();
        auth.isAuth();
        auth.token();

        System.out.println("------------------------");

        Encryption encryption;

        encryption = new MongoDB();
        save(encryption);
        put(encryption);
        getData(encryption);
        delete(encryption);
        encryption.encryptData();
        encryption.decryptData();
        encryption.isAuth();
        encryption.token();

        encryption = new Firebase();
        save(encryption);
        put(encryption);
        getData(encryption);
        delete(encryption);
        encryption.encryptData();
        encryption.decryptData();
        encryption.isAuth();
        encryption.token();

    }

    private static void getData(IDataAccess data) {
        data.getList();
    }

    private static void delete(IDataAccess data) {
        data.delete();
    }

    private static void save(IDataAccess data) {
        data.insert();
    }

    private static void put(IDataAccess data) {
        data.update();
    }
}
