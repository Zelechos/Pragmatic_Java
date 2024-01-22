import java.util.ArrayList;
import java.util.List;

/**
 * Main a class to test Programmer class
 *
 * @author Alex T.H.
 * @version v0.1.1
 * @since 20.0.0 2023-03-22
 */
public class Main {
    public static void main(String[] args) {

//      first test 
        Programmer programmer = new Programmer();
        System.out.println(programmer.getName());
        programmer.setName("Alex T.H.");
        System.out.println(programmer.getName());

//      second test
        Programmer programmer1 = new Programmer("Alex", "Tumiri", 19);
        System.out.println(programmer1);


        List<String> techSkills = new ArrayList<>();
        techSkills.add("Java EE");
        techSkills.add("Java SE");
        techSkills.add("Java ME");
        techSkills.add("Spring");

//      third test 
        Programmer programmer2 = new Programmer(1300.00, "Engineer", techSkills, "2 years");
        System.out.println(programmer2);


//      fourth test
        Programmer programmer3 = new Programmer("Alex", "Tumiri", 26, 1300.00, "Engineer", techSkills, "2 years");
        System.out.println(programmer3.toString());
    }
}
