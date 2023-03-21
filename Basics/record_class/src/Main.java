public class Main {
    public static void main(String[] args) {

        System.out.println("Record Class = Clase Registro");

        Rectangle rectangle = new Rectangle(9, 29);
        System.out.println(rectangle.length());
        System.out.println(rectangle.width());
        System.out.println(rectangle.greeting("Alex"));
        System.out.println(rectangle.calculate());
        System.out.println(rectangle.getClass());
        System.out.println(rectangle);

        System.out.println(Rectangle.goldenRatio);
        System.out.println(Rectangle.createGoldenRectangle(10));

//        Generamos la excepcion gracias al constructor compacto de la clase de registro
        Rectangle rectangle_1 = new Rectangle(4, -1);
        System.out.println(rectangle_1);


    }
}