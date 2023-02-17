import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.LOCAL_VARIABLE)
public @interface Ether {
    String send() default "ethernet active";
}
