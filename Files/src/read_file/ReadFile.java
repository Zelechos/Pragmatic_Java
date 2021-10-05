/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CodingErrorAction;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class ReadFile {
    
       String TextCss = " ";
       String TextHTML = " ";
       File CSS;
       File HTML;
       File Directorio;
       File Directorioimg;
    //Metodo para leer archivos
    private void ReadText (){
        
        String Cadena, Cadena1;
        
        try {
            FileReader Lector = new FileReader("C:\\Users\\Zelec\\OneDrive\\Desktop\\Proyectos\\Pragmatic Java\\Clase_File\\landing_0\\style.css");
            FileReader Lector1 = new FileReader("C:\\Users\\Zelec\\OneDrive\\Desktop\\Proyectos\\Pragmatic Java\\Clase_File\\landing_0\\Portafolio_0.html");
            
            BufferedReader Lectura = new BufferedReader(Lector);
            BufferedReader Lectura1 = new BufferedReader(Lector1);
            
                
            Cadena = Lectura.readLine();
            Cadena1 = Lectura1.readLine();
            
            //Para leer todas las lineas o el contenido del archivo
            while(Cadena != null ){
                //System.out.println(Cadena);
                TextCss += Cadena+"\n";
                Cadena = Lectura.readLine();
            }
            
            while(Cadena1 != null){
                //System.out.println(Cadena1);
               TextHTML += Cadena1+"\n";
               Cadena1 = Lectura1.readLine();
            }
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error al Leer el Archivo "+ex);
        } catch (IOException ex) {
            System.err.println("Error en la Cadena "+ ex);
        }
        
    }
    
 
    private void CreateFile(){
        Directorio = new File("C:\\Users\\Zelec\\OneDrive\\Desktop\\ProyectoNuevo");
        if (Directorio.mkdir()){
            System.out.println("Directorio se creo");
        }
        
        Directorioimg = new File("C:\\Users\\Zelec\\OneDrive\\Desktop\\ProyectoNuevo\\img");
        if (Directorioimg.mkdir()){
            System.out.println("Directorio img se creo");
        }
        
       
        CSS = new File("C:\\Users\\Zelec\\OneDrive\\Desktop\\ProyectoNuevo\\style.css");
        HTML = new File("C:\\Users\\Zelec\\OneDrive\\Desktop\\ProyectoNuevo\\index.html");
        
           try {
               if(CSS.createNewFile() && HTML.createNewFile() ){
                   System.out.println("The File "+CSS.getName()+ "has been created successfully ...");
                   System.out.println("The File "+HTML.getName()+ "has been created successfully ...");
               }  
           } catch (IOException ex) {
               Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    private void WriteFile(){
        
           try {
               FileWriter writing = new FileWriter(CSS);
               FileWriter writing1 = new FileWriter(HTML);
               writing.write(TextCss);
               writing1.write(TextHTML);
               writing.close();
               writing1.close();
               
           } catch (IOException ex) {
               Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
    }
    
    //Metodo para mover archivos de un directorio origen a un directorio destino
    private void MoveFile(){
        try {

            Path origenPath = Paths.get("C:\\Users\\Zelec\\OneDrive\\Desktop\\Proyectos\\Pragmatic Java\\Clase_File\\landing_0\\img");
            Path destinoPath = Paths.get("C:\\Users\\Zelec\\OneDrive\\Desktop\\ProyectoNuevo\\img");
        
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
        
        
    }
    
    private void CopyFile(){
        
             try{   
                    
                    Path origenPath = Paths.get("C:\\Users\\Zelec\\OneDrive\\Desktop\\Proyectos\\Pragmatic Java\\Clase_File\\landing_0\\img\\bg.jpg");
                    Path origenPath1 = Paths.get("C:\\Users\\Zelec\\OneDrive\\Desktop\\Proyectos\\Pragmatic Java\\Clase_File\\landing_0\\img\\facebook.png");
                    Path origenPath2 = Paths.get("C:\\Users\\Zelec\\OneDrive\\Desktop\\Proyectos\\Pragmatic Java\\Clase_File\\landing_0\\img\\twitter.png");
                    Path origenPath3 = Paths.get("C:\\Users\\Zelec\\OneDrive\\Desktop\\Proyectos\\Pragmatic Java\\Clase_File\\landing_0\\img\\linkedin.png");
                    Path destinoPath = Paths.get("C:\\Users\\Zelec\\OneDrive\\Desktop\\ProyectoNuevo\\img");
                    
                    Path Copy = Files.copy(origenPath , destinoPath.resolve(origenPath.getFileName()) );
                    Path Copy1 = Files.copy(origenPath1 , destinoPath.resolve(origenPath1.getFileName()) );
                    Path Copy2 = Files.copy(origenPath2 , destinoPath.resolve(origenPath2.getFileName()) );
                    Path Copy3 = Files.copy(origenPath3 , destinoPath.resolve(origenPath3.getFileName()) );
                    
            } catch (IOException e) {
                System.err.println(e);
            }
    }
    
    public static void main(String[] args) {
        
        
        ReadFile archivo = new ReadFile();
       
        archivo.ReadText();
        archivo.CreateFile();
        archivo.WriteFile();
        //archivo.MoveFile();
        archivo.CopyFile();

        
    }
    
}
