/**
 * Person class
 *
 * @author Alex T.H.
 * @version v0.1.2
 */
public class Person {

    private static int personsCounter;
    private int idPerson;
    private String name;

    public Person(String name) {
        this.name = name;
//      Incrementamos en contador cada vez que se crea una nueva instancia de person
        this.idPerson = Person.personsCounter++;
    }

    public static int getPersonsCounter() {
        return personsCounter;
    }

    public static void setPersonsCounter(int personsCounter) {
        Person.personsCounter = personsCounter;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                '}';
    }
}
