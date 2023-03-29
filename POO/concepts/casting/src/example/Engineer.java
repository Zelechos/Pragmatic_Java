package example;

import java.util.List;

public class Engineer extends Employee {

    private final Seniority level;
    private final List<String> technologies;

    public Engineer(String name, double salary, Seniority level, List<String> technologies) {
        super(name, salary);
        this.level = level;
        this.technologies = technologies;
    }

    //  dado que el metodo es de tipo protected no puede ser mas restrictivo por ejemplo private
    @Override
    public String getDetails() {
        return super.getDetails()
                .concat("Seniority : " + this.level + "\n")
                .concat("Seniority description : " + this.level.getDescription() + "\n")
                .concat("Technologies : " + this.technologies + "\n");
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "level=" + level +
                ", technologies=" + technologies +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Seniority getSeniority() {
        return this.level;
    }

}
