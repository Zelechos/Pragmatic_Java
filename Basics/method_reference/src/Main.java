import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Class Main
 * Example how to use Method Reference
 *
 * @author Alex T.H.
 * @version v0.1.0
 */
public class Main {
    public static void main(String[] args) {

//      ClassName::MethodName

        List<String> technologies = new ArrayList<>();
        technologies.add("Java");
        technologies.add("Spring");
        technologies.add("JavaScript");
        technologies.add("Python");
        technologies.add("Github");

        var programmer = new Programmer("Alex", 26, "Algorithms", technologies);
        var programmer1 = new Programmer("Alan", 43, "Maths", technologies);
        var programmer2 = new Programmer("Linus", 45, "Open Source", technologies);

        List<Programmer> programmers = new ArrayList<>();
        programmers.add(programmer);
        programmers.add(programmer1);
        programmers.add(programmer2);


        List<String> coders = programmers.stream()
                .map(Programmer::getName)
                .toList();
        System.out.println(coders);


        Runnable runnable = Programmer::greeting;
        Thread thread = new Thread(runnable);
        thread.start();


        Supplier<Programmer> supplier = Programmer::new;
        Programmer programmer3 = supplier.get();
        programmer3.setName("Error Programmer");
        System.out.println(programmer3.getName());
    }
}