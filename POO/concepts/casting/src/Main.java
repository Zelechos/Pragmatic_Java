import example.Employee;
import example.Engineer;
import example.Seniority;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee;

        //Upcasting -> de la clase hija a la clase padre
        employee = new Engineer("Alex", 10000, Seniority.SEMISENIOR, List.of("Java EE", "Java SE", "Java ME"));
        System.out.println(employee.getDetails());

        // Downcasting -> de la clase padre a la clase hija
        System.out.println(((Engineer)employee).getSeniority());

    }
}