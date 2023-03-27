package example;

public class Manager extends Employee {

    private final String departament;

    public Manager(String name, double salary, String departament) {
        super(name, salary);
        this.departament = departament;
    }

    @Override
    public String getDetails() {
        return super.getDetails()
                .concat("Departament : " + this.departament);
    }
}
