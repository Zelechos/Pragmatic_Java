package person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("alex", 10000.00);
        System.out.println(employee);

        Employee employee1 = new Employee("Alan Turing", 43, 1000000.00);
        System.out.println(employee1);

        Employee employee2 = new Employee("Alex T.H.", 'M', 29, "Software Park", 10000.00);
        System.out.println(employee2);

        Client client = new Client("Linus", 'M', 55, "Helsinsky", true, new Date());
        System.out.println(client);

        Client client2 = new Client("Linus", 'M', 55, "Helsinsky", true, new Date());
        System.out.println(client2);

    }
}
