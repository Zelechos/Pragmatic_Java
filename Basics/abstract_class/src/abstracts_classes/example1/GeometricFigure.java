package abstracts_classes.example1;

/**
 * Learn Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.3.8
 * @since 20.0.0 2024-01-30
 */
public abstract class GeometricFigure {

    protected String figureType;

    public GeometricFigure(String figureType) {
        this.figureType = figureType;
    }

    public abstract void draw();

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "figureType='" + figureType + '\'' +
                '}';
    }
}
