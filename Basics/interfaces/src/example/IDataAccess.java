package example;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public interface IDataAccess {

    int MAX_RECORDS = 10;

    void insert();

    void getList();

    void update();

    void delete();

}
