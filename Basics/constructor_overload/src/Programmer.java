import java.util.List;

/**
 * Programmer a class to learn Constructor overload
 *
 * @author Alex T.H.
 * @version v0.1.1
 */
public class Programmer {

    private String name;
    private String lastname;
    private int age;
    private double salary;
    private String education;
    private List<String> techSkills;
    private String experience;

//    Aplicamos la sobrecarga de contructores


    /**
     * un Contructor vacio
     */
    public Programmer() {
    }

    /**
     * un Constructor con informacion personal
     *
     * @param name
     * @param lastname
     * @param age
     */
    public Programmer(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    /**
     * un Constructor con informacion para postular
     *
     * @param salary
     * @param education
     * @param techSkills
     * @param experience
     */
    public Programmer(double salary, String education, List<String> techSkills, String experience) {
        this.salary = salary;
        this.education = education;
        this.techSkills = techSkills;
        this.experience = experience;
    }

    /**
     * un Constructor con informacion laboral
     *
     * @param name
     * @param salary
     * @param techSkills
     * @param experience
     */
    public Programmer(String name, double salary, List<String> techSkills, String experience) {
        this.name = name;
        this.salary = salary;
        this.techSkills = techSkills;
        this.experience = experience;
    }

    /**
     * un Contructor global
     *
     * @param name
     * @param lastname
     * @param age
     * @param salary
     * @param education
     * @param techSkills
     * @param experience
     */
    public Programmer(String name, String lastname, int age, double salary, String education, List<String> techSkills, String experience) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.education = education;
        this.techSkills = techSkills;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public List<String> getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(List<String> techSkills) {
        this.techSkills = techSkills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", education='" + education + '\'' +
                ", techSkills=" + techSkills +
                ", experience='" + experience + '\'' +
                '}';
    }
}
