package abstracts_classes;

/**
 * Learn Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.3.8
 * @since 20.0.0 2024-01-30
 */
public class Rectangle extends GeometricFigure{


    public Rectangle(String figureType){
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("se dibujo un : "+ this.getClass().getSimpleName());
    }
}
