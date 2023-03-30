package example;

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

        System.out.println("------------------------");

        Encryption encryption;

        encryption = new MongoDB();
        save(encryption);
        put(encryption);
        getData(encryption);
        delete(encryption);

    }

    private static void getData(IDataAccess data){
        data.getList();
    }


    private static void delete(IDataAccess data){
        data.delete();
    }

    private static void save(IDataAccess data){
        data.insert();
    }

    private static void put(IDataAccess data){
        data.update();
    }
}
