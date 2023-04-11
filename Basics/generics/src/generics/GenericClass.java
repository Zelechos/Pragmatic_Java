package generics;

public class GenericClass<T> {

    private T object;

    public GenericClass(T object){
        this.object = object;
    }

    public void getType(){
        System.out.println(object.getClass().getSimpleName());
    }
}
