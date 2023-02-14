import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Operator {

    public void operate(Invocation weapon) {
        final String className = weapon.getClass().getName();
        try {
            final Method[] methods = Class.forName(className).getMethods();
            for (final Method method : methods) {
                invokeMethod(method, weapon);
            }
        } catch (final Exception e) {
            System.err.println(e.getMessage());
        }

    }


    private void invokeMethod(Method method, Invocation weapon) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        final MultipleInvocation multipleInvocation;
        multipleInvocation = method.getAnnotation(MultipleInvocation.class);
        if (multipleInvocation != null) {
            final int timesToInvoke = multipleInvocation.timeToInvoke();
            for (int i = 0; i < timesToInvoke; i++) {
                method.invoke(weapon, (Object[]) null);
            }
        }
    }

}
