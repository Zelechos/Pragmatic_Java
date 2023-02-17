import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Hello {

    String message() default "hello programmer";
}


