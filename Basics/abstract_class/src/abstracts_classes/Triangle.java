package abstracts_classes;

public class Triangle extends GeometricFigure {

    public Triangle(String figureType) {
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("se dibujo un : " + this.getClass().getSimpleName());
    }
}
