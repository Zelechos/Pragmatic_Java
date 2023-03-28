package example;

public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //    metodo que vamos a sobre escribir en la clase hija
    public String getDetails() {
        StringBuilder text = new StringBuilder();
        text.append("Name : " + this.name + "\n")
            .append("Salary : " + this.salary + "\n");
        return text.toString();
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
}
