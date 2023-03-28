import example.Employee;
import example.Manager;


public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Alex", 1500);
        determineTypes(employee);
        employee = new Manager("Alex", 1500, "IT");
        determineTypes(employee);

    }

    private static void determineTypes(Employee object) {
        if (object instanceof Manager) {
            System.out.println("es de tipo gerente");
            Manager manager = (Manager) object;
            System.out.println(manager.getDepartament());
        } else if (object instanceof Employee) {
            System.out.println("es de tipo empleado");
        } else if (object instanceof Object) {
            System.out.println("es un objeto");
        }
    }
}