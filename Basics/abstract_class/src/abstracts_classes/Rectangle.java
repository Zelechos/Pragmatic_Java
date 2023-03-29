package abstracts_classes;

public class Rectangle extends GeometricFigure{


    public Rectangle(String figureType){
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("se dibujo un : "+ this.getClass().getSimpleName());
    }
}
