/**
 * Class Main
 * Example how to use Static Context
 *
 * @author Alex T.H.
 * @version v0.1.2
 * @since 20.0.0 2023-03-23
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex");
        printPerson(person);

        Person person1 = new Person("Linus");
        printPerson(person1);

        Person person2 = new Person("Alan");
        printPerson(person2);
    }

//  static public void printPerson(Person person) { "tambien podemos declarar asi nuestro metodo estatico"
    public static void printPerson(Person person) {
        System.out.println(person.toString());
    }

}