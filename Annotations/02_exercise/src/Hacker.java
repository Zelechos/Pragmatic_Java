import java.lang.reflect.Field;

public class Hacker {

    public static void main(String[] args) throws Exception {
//      Manera de Obtener el valor default de una Anotacion @Target(ElementType.FIELD)
        Field field = Hack.class.getField("password");
        System.out.println(field.getAnnotation(Passwords.class).hackPassword());
    }
}