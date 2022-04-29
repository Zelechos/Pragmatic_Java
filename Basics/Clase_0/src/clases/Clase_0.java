/*
 * @author: Pragmatic Coder
 * @repository: https://github.com/Zelechos/Pragmatic_Java
 */
package clases;

import java.util.List;
import morphoide.Morphoide;



public class Clase_0 {


    public static void main(String[] args) {
        
//        Clase_0 instancia_de_clase_0 = new Clase_0();
        
        
        String text = "Name : Alex : Ether";
        String[] response = Morphoide.separationByTwoPoints(text);
        System.out.println(response[0]);
        System.out.println(response[1]);
        System.out.println(response[2]);
        
        String text2 ="1234243";
        List result = Morphoide.stringReverseDestruction(text2);
        System.out.println(text2);
        System.out.println(result);
        
    }
    
}
