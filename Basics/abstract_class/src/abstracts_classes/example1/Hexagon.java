package abstracts_classes.example1;

/**
 * Learn Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.3.9
 * @since 20.0.0 2024-02-02
 */
public class Hexagon extends GeometricFigure {

    public Hexagon(String figureType) {
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("a was drawn : " + this.getClass().getSimpleName());
    }
}
