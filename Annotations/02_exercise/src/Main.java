import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws Exception {
        TestHello test = new TestHello();
        Annotation[] a = test.getClass().getAnnotations();
//        Class<?> className = Class.forName("TestHello");
//        Annotation b[] = className.getMethod(message)
//                .getAnnotations();
//        System.out.println(a.length);
         Annotation res = test.getClass().getMethod("message").getAnnotation();
        Class<?> className = Class.forName("TestHello");

        Annotation[] b = className.getMethod("message").getAnnotations();
        System.out.println(b[0]);
    }
}