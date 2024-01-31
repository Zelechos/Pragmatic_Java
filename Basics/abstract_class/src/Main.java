import abstracts_classes.GeometricFigure;
import abstracts_classes.Rectangle;
import abstracts_classes.Triangle;

/**
 * Learn Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.3.8
 * @since 20.0.0 2024-01-30
 */
public class Main {
    public static void main(String[] args) {

        GeometricFigure rectangle = new Rectangle("Rectangle");
        rectangle.draw();

        GeometricFigure triangle = new Triangle("Triangle");
        triangle.draw();
    }
}