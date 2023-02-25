import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String name = "Person";

        Map<Integer, String> attributes = new HashMap<>();
        Map<Integer, String> methods = new HashMap<>();

        attributes.put(0, "String : name");
        attributes.put(1, "String : lastName");
        attributes.put(2, "int : age");

        methods.put(0, "getName() : String");
        methods.put(1, "getLastName() : String");
        methods.put(2, "getAge() : int");

        Diagram diagram = new Diagram(name, attributes, methods);
        System.out.println(diagram.showDiagram());
    }
}