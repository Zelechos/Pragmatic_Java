import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Passwords {
    String hackPassword() default "octocat9001";

    String encryptingPassword() default "p48b5f743982n4357d342";
}


