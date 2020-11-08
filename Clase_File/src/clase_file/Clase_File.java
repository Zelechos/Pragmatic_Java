/*
 * @Autor: Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
*/

package clase_file;

import java.io.File;

public class Clase_File {

    public static void main(String[] args) {
            
    //Acordarse de poner la extension del Archivo que crearas
            File archivo = new File("Prueba1.txt");
            
            if(archivo.exists()){
                System.out.println("Si Existe el archivo");
            }else{
                System.out.println("No Existe el archivo");
            }
            System.out.println("***********************************************************");
            

    //Ruta Absoluta Funciona aunque el Archivo no este adentro del Proyecto
    //File Archivo = new File("C:\\Users\\Zelec\\OneDrive\\Documentos\\NetBeansProjects\\Clase_File\\Prueba.txt");

            File Archivo = new File("C:\\Users\\Zelec\\OneDrive\\Documentos\\NetBeansProjects\\Clase_File\\Prueba.txt");

    //Ruta Relativa (Funciona si el archivo esta adentro del Proyecto)
            File Directorio = new File("Prueba.txt");
            

        if (Archivo.exists()){
            System.out.println("El Archivo Existe.");
            
            System.out.println("Ruta Absoluta del Archivo : "+Archivo.getAbsolutePath());
            
            //Para saber si es un Archivo
            System.out.println("¿Es un Archivo?: ");
            if(Archivo.isFile()){
                System.out.println("Si Efectivamente es un Archivo ...");
            }else{
                System.out.println("No Definitivamente no es un Archivo ...");
            }
             
            //Para saber si es un Directorio
            System.out.println("¿Es un Directorio?: ");            
            if(Archivo.isDirectory()){
                System.out.println("Si Efectivamente es un Directorio mas conocido como Carpeta ...");
            }else{
                System.out.println("No Definitivamente no es un Directorio ...");
            }

            //Para Saber si el archivo se puede leer
            System.out.println("¿El Achivo se Puede Leer? : ");
            if(Archivo.canRead()){
                System.out.println("Si el Archivo se Puede leer.");
            }else{
                System.out.println("No se Puedes Leer el Archivo.");
            }
            
            //Para saber si podemos ejecutar el Archivo
            System.out.println("¿Se puede Ejecutar el Archivo?");
            if(Archivo.canExecute()){
                System.out.println("Si el Archivo se puede Ejecutar ...");
            }else{
                System.out.println("No el Archivo no se puede Ejecutar ... ");
            }
            
            //Para saber el nombre del Archivo
            System.out.println("El Nombre del Archivo es : "+Archivo.getName());

            
            
        }else{
            System.out.println("El Archivo no Existe.");
        }
        
        
        
        System.out.println("***************************************************************");            
            
       
        if (Directorio.exists()) {//Si el Archivo Existe 
            System.out.println("El Directorio Existe");
            
            System.out.println("Ruta Absoluta del Directorio : "+Directorio.getAbsolutePath());//Retorna la ruta absoluta del archivo
            
            
            //Para saber si es un Archivo
            System.out.println("¿Es un Archivo?: ");
            if(Directorio.isFile()){
                System.out.println("Si efectivamente es un archivo . . .");
            }else{
                System.out.println("No definitivamente no es Archivo");
            }
            
            //Para saber si es un Directorio
            System.out.println("¿Es un Directorio?: ");
            if(Directorio.isDirectory()){
                System.out.println("Si es un Directorio o mas conocido como Carpeta.");
            }else{
                System.out.println("No es un Directorio.");
            }
            
            
            //Para Saber si se puede leer
            System.out.println("¿El Directorio se Puede Leer? : ");
            if(Directorio.canRead()){
                System.out.println("Si el Directorio se Puede leer.");
            }else{
                System.out.println("No se Puedes Leer el Directorio.");
            }
            
            //Para saber el nombre del Archivo
            System.out.println("El Nombre del Directorio es : "+Directorio.getName());
            
            
        } else {
            System.out.println("El Directorio No Existe");
        }
        
        
            
        

    }

}
