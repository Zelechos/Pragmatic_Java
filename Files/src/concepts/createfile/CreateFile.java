package concepts.createfile;

import java.io.File;
import java.io.IOException;

/**
 * Learn Files
 *
 * @author Alex T.H.
 * @version v0.5.3
 * @since 20.0.0 2024-11-19
 */
public class CreateFile {

    public File File;
    
    private void CreateFile(){
        File = new File("Ether.md");
        
        try{// la excepcion salta usualmente con rutas absolutas por ejemplo si te equivocas en poner la ruta absoluta . . .
            
            if(File.createNewFile()){
                System.out.println("The File "+File.getName()+" has been created successfully . . . ");
            }
            
        }catch(IOException exception){
            System.err.println("Error the File was not created"+ exception);
        }
    }
    
    
    private void CreateDirectory(){
            File = new File("web_Pragmatic");

            if(File.mkdir()){
                System.out.println("The Directory "+File.getName()+" has been created successfully . . .");
            }else{
                System.err.println("Error the Directory was not created");
            }
            
        
    }

    public static void main(String[] args) {

        CreateFile Object = new CreateFile();
        
        Object.CreateDirectory();
        
        //Creando un archivo ... 
        Object.CreateFile();
    }
    
   
    
}
