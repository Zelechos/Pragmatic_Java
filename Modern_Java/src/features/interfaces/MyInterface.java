package features.interfaces;

public interface MyInterface {

// los metodos public no se pueden crear en las interfaces
//    public void publicMethod(){
//        System.out.println("public method called");
//    }

    private void privateMethod(){
        System.out.println("private method called");
    }

    default void defaultMethod() {
//        publicMethod();
        privateMethod();
        System.out.println("default method called");
    }
}
