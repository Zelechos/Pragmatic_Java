import java.util.List;

/**
 * Class Programmer
 * Example how to use Method Reference
 *
 * @author Alex T.H.
 * @version v0.1.0
 */
public class Programmer {

    private String name;
    private int age;
    private String specialty;
    private List<String> technologies;

    public Programmer() {
    }

    public Programmer(String name, int age, String specialty, List<String> technologies) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
        this.technologies = technologies;
    }

    public static void greeting() {
        System.out.println("Hello hacker");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                ", technologies=" + technologies.toString() +
                '}';
    }

}
