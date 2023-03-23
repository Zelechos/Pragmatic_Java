package person;

public class Employee extends Person {

    private static int employeeCounter;
    private int idEmployee;
    private double salary;

    public Employee() {
        this.idEmployee = ++Employee.employeeCounter;
    }

    public Employee(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, String address, double salary) {
        super(name, gender, age, address);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }


    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + this.idEmployee +
                ", salary=" + this.salary +
                ", " + super.toString() +
                '}';
    }
}
