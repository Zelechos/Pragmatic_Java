import abstracts_classes.GeometricFigure;
import abstracts_classes.Rectangle;
import abstracts_classes.Triangle;

public class Main {
    public static void main(String[] args) {

        GeometricFigure rectangle = new Rectangle("Rectangle");
        rectangle.draw();

        GeometricFigure triangle = new Triangle("Triangle");
        triangle.draw();
    }
}