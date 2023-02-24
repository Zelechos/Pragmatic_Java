import java.lang.reflect.Field;

public class Hacker {

    @Passwords
    public String encrypting = "encripting";

    public static void main(String[] args) throws Exception {
//      Manera de Obtener el valor default de una Anotacion @Target(ElementType.FIELD)
        Field field = Hack.class.getField("password");
        var password = field.getAnnotation(Passwords.class).hackPassword();
        System.out.println("Password en crypting\t" + password);

        Field fieldEncrypting = Hacker.class.getField("encrypting");
        var passwordEncrypting = fieldEncrypting.getAnnotation(Passwords.class).encryptingPassword();
        System.out.println("Password en crypting\t" + passwordEncrypting);
    }
}