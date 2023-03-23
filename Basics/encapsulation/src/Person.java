/**
 * Person class
 *
 * @author Alex T.H.
 * @version v0.1.2
 */

public class Person {

    /**
     * Para aplicar la encapsulacion se debe evitar que otras clases, o metodos
     * accedan a la informacion de nuestras variables o campos de una clase
     * esto la hacemos aplicando a todas nuestras variables el modificador de
     * acceso "private"
     */

    private String name;
    private double salary;
    private boolean delete;

    public Person(String name, double salary, boolean delete) {
        this.name = name;
        this.salary = salary;
        this.delete = delete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Person {\n" +
                "name = " + name +
                "\nsalary = " + salary +
                "\ndelete = " + delete +
                "\n}";
    }
}
