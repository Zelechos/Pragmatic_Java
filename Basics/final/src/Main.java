import person.domain.Person;

/**
 * Main class
 * Use to example for a final sentence in variables
 *
 * @author Alex T.H.
 * @version v0.1.3
 * @since 20.0.0 2023-03-24
 */
public class Main {
    public static void main(String[] args) {

    /**
     * Usos de la Palabra "final"
     *
     * En variables --> Evita cambiar el valor que almacena la variable (en si es una constante)
     * En metodos --> Evita que se modifique o sobrescriba la definicion de un metodo desde una subclase o clase hija
     * En clases --> Evita que se cree una subclase o clase hija
     */

        final int value = 10;
        System.out.println(value);
        // value = 5 --> esto no esta permitido

        final Person person = new Person();
//    person = new Person(); --> no se puede asignar otra instancia a un objeto final
        person.setName("ether"); // pero si se puede modificar el contenido del objeto
        System.out.println(person.getName());
    }
}