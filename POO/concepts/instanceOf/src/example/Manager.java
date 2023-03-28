package example;

public class Manager extends Employee {

    private String departament;

    public Manager(String name, double salary, String departament) {
        super(name, salary);
        this.departament = departament;
    }

    @Override
    public String getDetails() {
        return super.getDetails()
                .concat("Departament : " + this.departament);
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament =  departament;
    }

}
