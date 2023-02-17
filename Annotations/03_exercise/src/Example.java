import java.lang.annotation.Annotation;

public class Example {
    public static void main(String[] args) {
        @Ether
        String code = "fail";
        Annotation[] res = code.getClass().getAnnotatedSuperclass().getDeclaredAnnotations();
//                .getDeclaredAnnotations();
        System.out.println(res[0]);
    }
}
