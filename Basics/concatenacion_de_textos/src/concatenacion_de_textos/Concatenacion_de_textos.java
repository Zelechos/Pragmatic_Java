/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package concatenacion_de_textos;

public class Concatenacion_de_textos {

    public static void main(String[] args) {
        // Primero creamos una varible del tipo String
        String name = "Hercules";
        name = "Hacker";
        name = "Coder";
        System.out.println(name);
        
        // Ahora concatenaremos la variable name       
        System.out.println("Your name is "+ name);
        
        
        // Ahora concatenaremos la variable name con otra variable de tipo Integer       
        int followersInstagram  = 100;
        Integer followersGithub = 53;
        System.out.println("Your name is "+ name 
                +" and you have "+followersInstagram+" followers in instragram"
                +" and you have "+followersGithub+" followers in github");

        // Ahora crearemos nuestra primera condicional
        Integer age = 10;
        
        if(age > 18){
            System.out.println("You are old");
        }else{
            System.out.println("You are a children");
        }
        
        //  Operaciones logicas
        age = 19;
        
        //  Dado que la sentencia de comparacion de la edad retorna valores booleanos podemos igualar la varible        
        Boolean heIsOlder = age > 18 && age < 70;

        if(heIsOlder){
            System.out.println("You are old ");
        }else{
            System.out.println("You are a children ");
        }
        
    }
    
}
