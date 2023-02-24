public class ExampleContinue {

    public static void main(String[] args) {

//  Aqui hay ejemplo de como funciona el "continue" en bucle
        for (var i = 1; i < 6; i++) {
            if (i % 2 == 0) {
                continue; //cuando se ejecuta ignora todo el codigo y pasa a la siguiente iteracion
            }
            System.out.println("the index for is\t" + i);
        }
    }
}
