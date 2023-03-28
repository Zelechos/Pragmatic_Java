/**
 * Main class
 * To prove the Encapsulation
 *
 * @author Alex T.H.
 * @version v0.1.2
 * @since 20.0.0 2023-03-23
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Alex", 1500.00, false);
//       no se puede acceder directamente a los atributos de nuestra clase como se ve a continuacion
//        person.name;
//        System.out.println("name : "+ person.name);

        System.out.println(person.toString());
//        System.out.println("name : " + person.getName());
//        System.out.println("salary : " + person.getSalary());
//        System.out.println("is delete : " + person.isDelete());

        person.setName("Estefan");
//        System.out.println("name : " + person.getName());

        System.out.println(person.toString());

    }
}