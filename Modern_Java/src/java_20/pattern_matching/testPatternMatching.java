package java_20.pattern_matching;

import java_20.pattern_matching.example_001.Java;
import java_20.pattern_matching.example_001.JavaScript;
import java_20.pattern_matching.example_001.ProgrammingLanguage;
import java_20.pattern_matching.example_001.Python;
import java_20.pattern_matching.example_002.Colors;
import java_20.pattern_matching.example_003.Area;
import java_20.pattern_matching.example_003.Circle;
import java_20.pattern_matching.example_003.Square;

public class testPatternMatching {

    public static void main(String[] args) {
        System.out.println(testSealedExhaustive(new Python()));
        System.out.println(testColors(Colors.GREEN));
        testArea(new Square(3, 2));
        testArea(new Circle(-3, 2));
    }

    static int testSealedExhaustive(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case Java x -> 1;
            case Python x -> 2;
            case JavaScript x -> 3;
        };
    }

    static String testColors(Colors color) {
        return switch (color) {
            case RED -> "red";
            case GREEN -> "green";
            case BLUE -> "blue";
        };
    }

    static void testArea(Area area) {
        switch (area) {
            case Circle(int x, int y) when x >= 0 -> System.out.println("Circle x is positive");
            case Circle(int x, int y) when x < 0 -> System.out.println("Circle x is negative");
            case Square(int x, int y) when y % 2 == 0 && x % 2 == 0 -> System.out.println("Square y and x are pair");
            default -> System.out.println("Any of the previous options");
        }
    }
}
