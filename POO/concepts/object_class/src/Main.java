import example.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Juan", 5000);
        Employee employee2 = new Employee("Juan", 5000);

        System.out.println(employee1);
        System.out.println(employee2);

        if (employee1 == employee2) {
            System.out.println("tiene la misma referencia en memoria");
        } else {
            System.out.println("tiene distinta referencia en memoria");
        }

        if (employee1.equals(employee2)) {
            System.out.println("los objetos son iguales en contenido");
        } else {
            System.out.println("los objetos son diferentes en contenido");
        }

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        if (employee1.hashCode() == employee2.hashCode()) {
            System.out.println("los hashs son iguales");
        } else {
            System.out.println("los hashs son diferentes");
        }
    }
}