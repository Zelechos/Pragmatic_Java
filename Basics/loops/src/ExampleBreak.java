public class ExampleBreak {

    public static void main(String[] args) {

//  Aqui hay ejemplo de como funciona el "break" en bucle
        for (var i = 1; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("the index for is\t" + i);
                break; // que hace el break es que a la hora de ejecutarse termina el programa
            }
        }
    }
}
