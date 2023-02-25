public class ExampleLabelsInLoops {

    public static void main(String[] args) {

//        NO RECOMENDAD PARA USAR Y LA VERDAD LA FUNCIONALIDAD ES SIMPLE CASI NI SE DETECTA LA DIFERENCIA
        // esta es la etiqueta que dice a que parte del bucle te direccionara el continue
        init:
        for (var i = 1; i < 6; i++) {
            if (i % 2 == 0) continue init;
            System.out.println("the index for is\t" + i);
        }

//        tambien sirve en break
//        init:
//        for (var i = 1; i < 6; i++) {
//            if (i % 2 == 0) {
//                break init;
//            }
//            System.out.println("the index for is\t" + i);
//        }

    }
}
