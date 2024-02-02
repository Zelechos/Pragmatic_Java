package abstracts_classes.example1;

/**
 * Learn Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.3.9
 * @since 20.0.0 2024-02-02
 */
public class TestAbstractClasses {
    public static void main(String[] args) {

        GeometricFigure rectangle = new Rectangle("Rectangle");
        rectangle.draw();

        GeometricFigure triangle = new Triangle("Triangle");
        triangle.draw();

        GeometricFigure hexagon = new Hexagon("Hexagon");
        hexagon.draw();

        // This is a abstract class here we have to implement the abstract method of GeometricFigure
        GeometricFigure square = new Square("Square") {
            @Override
            public void draw() {
                System.out.println("a was drawn : " + this.figureType);
            }
        };
        square.draw();
    }
}
