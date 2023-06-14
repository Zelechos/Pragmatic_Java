package java_20.pattern_matching;

import java_20.pattern_matching.example_001.Java;
import java_20.pattern_matching.example_001.JavaScript;
import java_20.pattern_matching.example_001.ProgrammingLanguage;
import java_20.pattern_matching.example_001.Python;
import java_20.pattern_matching.example_002.Colors;
import java_20.pattern_matching.example_003.Area;
import java_20.pattern_matching.example_003.Circle;
import java_20.pattern_matching.example_003.Square;
import java_20.pattern_matching.example_004.Imperial;
import java_20.pattern_matching.example_004.Mate;

public class testPatternMatching {

    public static void main(String[] args) {
//        System.out.println(testSealedExhaustive(new JavaScript(10000)));
//        System.out.println(getNameOfLanguage(new JavaScript(100)));
//        System.out.println(getDateOfCreation(new Java()));
//        System.out.println(getData(new Java()));
//        System.out.println(testColors(Colors.GREEN));
//        testArea(new Square(3, 2));
        testArea(new Circle(0, 2));
//        testArea(new Circle(-3, 2));
    }

    //  Example -> 1
    static int testSealedExhaustive(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case Java x -> 1;
            case Python x -> 2;
            case JavaScript x -> 3;
        };
    }

    static String getNameOfLanguage(ProgrammingLanguage programmingLanguage) throws IllegalStateException {
        String name = programmingLanguage.getName();
        return switch (name) {
            case "JAVA" -> "<h1>JAVA</h1>";
            case "PYTHON" -> "<h1>PYTHON</h1>";
            case "JAVASCRIPT" -> "<h1>JAVASCRIPT</h1>";
            default -> throw new IllegalStateException("Unexpected value: " + name);
        };
    }

    static String getDateOfCreation(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case Java object -> object.getDate();
            case Python object -> object.getDate();
            case JavaScript object -> object.getDate();
        };
    }

    static String getData(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case Java object -> object.show();
            case JavaScript object -> object.show();
            case Python object -> object.show();
        };
    }

    //  Example -> 2
    static String testColors(Colors color) {
        return switch (color) {
            case RED -> "red";
            case GREEN -> "green";
            case BLUE -> "blue";
        };
    }

    //  Example -> 3
    static void testArea(Area area) {
        switch (area) {
            case Circle(int x, int y) when (x >= 0) -> System.out.println("Circle x is mayor or equals to 0");
            case Circle(int x, int y) when (x < 0) -> System.out.println("Circle x is negative");
            case Square(int x, int y) when (y % 2 == 0) && (x % 2 == 0) -> System.out.println("Square y and x are pair");
            default -> System.out.println("Any of the previous options");
        }
    }


    //  Example -> 4
    static String testMate(Mate mate) throws IllegalStateException {
        return switch (mate){
            case Imperial(String type, boolean lightBulb, boolean herb, boolean sugar)
                    when (!lightBulb) -> "No se puede Tomar el Mate!!!";
            case Imperial(String type, boolean lightBulb, boolean herb, boolean sugar)
                    when (lightBulb && !sugar) -> "El Mate es Amargo";

            default -> throw new IllegalStateException("Unexpected value: " + mate);
        };
    }

}
