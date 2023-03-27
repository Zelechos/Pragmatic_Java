package package01;

public class Class01 {

    protected String protectedAttribute = "valor de atributo protegido";

    protected Class01(){
        System.out.println("constructor protegido");
    }

    public Class01(String arg){
        System.out.println("constructor publico");
    }

    protected void protectedMethod() {
        System.out.println("metodo protegido");
    }
}
