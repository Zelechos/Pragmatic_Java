package beans;

import java.io.Serializable;

/**
 * Learn Java Beans
 *
 * @author Alex T.H.
 * @version v0.4.4
 * @since 20.0.0 2024-05-08
 * <p>
 * Convenciones de un JavaBean
 *
 * <p>
 * Debe tener un constructor sin argumentos.
 * Debe ser serializable, lo que significa que puede ser guardado y restaurado en disco o transmitido a través de una red.
 * Debe tener propiedades privadas que se accedan a través de métodos "getter" y "setter" públicos.
 * <p>
 * Los JavaBeans se utilizan comúnmente en entornos de programación visual,
 * como Swing y JavaFX, donde se pueden vincular a componentes de interfaz
 * de usuario para facilitar el desarrollo de aplicaciones. Los JavaBeans también
 * se utilizan para simplificar la gestión de objetos en el código de la aplicación.
 * <p>
 * Tambien se utiliza la interfaz Serializable a la hora de mandar nuestra instancia
 * de la clase de un servidor a otro, nuestra instancia de la clase se serializa
 * a codigo de bits para que durante el envio no sufra ningun cambio y al llegar
 * al otro servidor que deserializa para obtener los datos del objeto tal cual lo
 * enviamos
 * <p>
 * Se Debe hacer serializable nuestra clase, lo que significa que puede ser guardado y restaurado en disco
 * o transmitido a través de una red.
 */
public class Person implements Serializable {

    //    Debe tener propiedades privadas que se accedan a través de métodos "getter" y "setter" públicos.
    private String name;
    private String lastname;


    //    Debe tener un constructor sin argumentos.
    public Person() {
    }


    //    Este constructor no es requerido (pero dinamicamente si se puede implementar)
    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    //    Se tienen que implementar los getters y setters de los atributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + '}';
    }
}
