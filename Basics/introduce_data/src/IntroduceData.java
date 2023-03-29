/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class IntroduceData {


    public static void main(String[] args) throws IOException {

        String language;
        //  Ahora veremos dos diferentes maneras de como introducir datos por consola

        //  Opcion 1
        var inputStreamReader = new InputStreamReader(System.in);
        var reader = new BufferedReader(inputStreamReader);
        System.out.print("Type your favorite programming language : ");
        language = reader.readLine();
        System.out.println("hello "+ language);
        
        //  Opcion 2
        var inputScanner = new Scanner(System.in);
        System.out.print("Type your favorite programming framework : ");
        language = inputScanner.nextLine();
        System.out.println("hello "+ language);
        
    }
    
}
