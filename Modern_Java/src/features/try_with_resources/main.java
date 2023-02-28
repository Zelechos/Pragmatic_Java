package features.try_with_resources;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        var object = new MyClass();
        var path = "X:\\Repositorios\\Pragmatic_Java\\Modern_Java\\src\\features\\try_with_resources\\MyClass.java";
        object.readFile(path);

        System.out.println("---------------------------------------------------------");

//        tambien podemos realizar la misma funcionalidad de la siguiente forma
        System.out.println(new FileInputStream(path).transferTo(System.out));
    }
}
