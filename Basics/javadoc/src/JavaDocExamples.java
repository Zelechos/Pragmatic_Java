/**
 * Class JavaDocExamples
 * Example how to use Javadoc
 *
 * @author Alex T.H.
 * @version v0.0.9
 * @since 19.0.1 2022-10-18
 * @see <ul>
 * <li>
 * <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/javadoc/index.html">
 * Javadoc
 * </a>
 * </li>
 * <li>
 * <a href="http://www.abelp.net/apuntesjava/21comments.html#Comentarios%20para%20documentaci%C3%B3n">
 * Apuntes Lenguaje Java
 * </a>
 * </li>
 * <li>
 * <a href="https://www.discoduroderoer.es/como-utilizar-javadoc/">
 * Como Utilizar Javadoc
 * </a>
 * </li>
 * </ul>
 */

public class JavaDocExamples {

    /*
    @author ===> Autor de la clase. Solo para las clases.

    @version ===> Versión de la clase. Solo para clases.

    @see ===> Referencia a otra clase, ya sea del API, del mismo proyecto o de otro. Por ejemplo:
        @see String @see paquete.clase#miembro @see enlace

    @param ===> Descripción parámetro. Una etiqueta por cada parámetro.

    @return ===> Descripción de lo que devuelve. Solo si no es void. Podrá describir valores de
    retorno especiales según las condiciones que se den, dependiendo del tipo de dato

    @throws ===> Descripción de la excepción que puede propagar. Habrá una etiqueta throws por cada tipo de excepción.

    @deprecated ===> Marca el método como obsoleto. Solo se mantiene por compatibilidad.

    @since ===> Indica el nº de versión desde la que existe el método.
     */

//    A CONTINUACION EJEMPLOS APLICADO A CODIGO

    //Atributos
    /**
     * Nombre del empleado
     */
    private final String nombre;
    /**
     * Apellido del empleado
     */
    private final String apellido;
    /**
     * Edad del empleado
     */
    private final int edad;
    /**
     * Salario del empleado
     */
    private double salario;

    //Metodos publicos

    /**
     * Constructor por defecto
     */
    public JavaDocExamples() {
        this("", "", 0, 0);
    }

    //Metodos privados

    /**
     * Constructor con 4 parametros
     *
     * @param nombre   nombre del empleado
     * @param apellido apellido del empleado
     * @param edad     edad del empleado
     * @param salario  salario del empleado
     */
    public JavaDocExamples(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    //Constructores

    /**
     * Suma un plus al salario del empleado si el empleado tiene mas de 40 años
     *
     * @param sueldoPlus
     * @return <ul>
     * <li>true: se suma el plus al sueldo</li>
     * <li>false: no se suma el plus al sueldo</li>
     * </ul>
     */
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    /**
     * Comprueba que el nombre no este vacio
     *
     * @return <ul>
     * <li>true: el nombre es una cadena vacia</li>
     * <li>false: el nombre no es una cadena vacia</li>
     * </ul>
     */
    private boolean compruebaNombre() {
        return !nombre.equals("");
    }

}
