package example;

public class Manager extends Employee {

    private final String departament;

    public Manager(String name, double salary, String departament) {
        super(name, salary);
        this.departament = departament;
    }

//  dado que el metodo es de tipo protected no puede ser mas restrictivo por ejemplo private
    @Override
    public String getDetails() {
        return super.getDetails()
                .concat("Departament : " + this.departament + "\n");
    }
}
