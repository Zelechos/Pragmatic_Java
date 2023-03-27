import example.Employee;
import example.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alex", 1500, "IT");
        System.out.println(manager.getDetails());
    }
}