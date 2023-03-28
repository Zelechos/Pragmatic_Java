import example.Employee;
import example.Engineer;
import example.Manager;
import example.Seniority;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Alex", 1500);
        print(employee);

        Employee manager = new Manager("Alex", 1500, "IT");
        print(manager);

        Employee engineer = new Engineer("Alex", 15000, Seniority.SENIOR, List.of("Java SE", "Java EE", "Java ME"));
        print(engineer);
    }

    public static void print(Employee morph){
        System.out.println(morph.getDetails());
    }
}
