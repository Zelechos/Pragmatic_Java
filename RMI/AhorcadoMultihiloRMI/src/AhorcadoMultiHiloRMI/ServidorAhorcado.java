/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/SistemasDistribuidosATH
 */
package AhorcadoMultiHiloRMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class ServidorAhorcado extends UnicastRemoteObject implements IAhorcado {

    //Atributos
    //String Palabras[] ={"java","javascript","html","css","nodejs","express","python","reactjs","angularjs","golang","docker"};
    String Palabra , PalabraHallada[], PalabraEscogida[],PalabraFinal[];
    
    //Metodos de la Clase
    public ServidorAhorcado() throws RemoteException {
        super();
    }
    
    //Para enviar al cliente la Palabra Escogida
    @Override
    public String Palabra() throws RemoteException {
        return this.Palabra;
    }
    
    //Para enviar al cliente la Palabra Oculta
    @Override
    public String PalabraOculta(String palabra) throws RemoteException {
        this.Palabra = palabra;
        return MuestraVacios(this.Palabra);   
    }
    
    //Crear las letras de la palabra oculta 
    @Override
    public String MuestraVacios(String Palabras) throws RemoteException {
        int longitud = Palabras.length();
        this.PalabraHallada = new String[longitud];

        
        String Texto = "";
            for(int Iterador = 0 ; Iterador < longitud ; Iterador++){
                if(Iterador == longitud-1){
                    this.PalabraHallada[Iterador] = "?";
                    Texto += "[?]";
                }else{
                    this.PalabraHallada[Iterador] = "?";
                    Texto += "[?]-";
                }
            }
        return Texto;
    }
    
    //Para ver si la letra que introdujo es correcta o no 
    @Override
    public String Jugando(String Letra) throws RemoteException{
        this.PalabraEscogida = this.Palabra.split(""); 
        
        boolean intento = false;
        
        String men1,men2,let=Letra.trim();

        //Bucle for para saber en que posicion esta la letra introducida
        for (int Interador = 0; Interador < this.PalabraEscogida.length; Interador++) {
            
            //if para llenar el array con las letras
            if(let.equals(this.PalabraEscogida[Interador])){
                if(this.PalabraHallada[Interador].equals("?")){
                    this.PalabraHallada[Interador] =  this.PalabraEscogida[Interador];
                    intento = true;
                }
            }
            
        }
        
        //Mensaje a retornar
        if(intento){
            men2 = "Se encontro concidencias";
            return men2;
        }else{
            men1  = "Menos 1 Oportunidad";
            return men1;
        }
        
        
    }

    //Para enviar un mensaje al cliente como se esta llenando la palabra
    @Override
    public String LLenandoPalabra() throws RemoteException {
        //para crear un array con la letras introducida
        String Texto = "";
            for(int Iterador = 0 ; Iterador < this.PalabraHallada.length ; Iterador++){
                if(Iterador == this.PalabraHallada.length-1){
                    Texto += "["+this.PalabraHallada[Iterador]+"]";
                }else{
                    Texto += "["+this.PalabraHallada[Iterador]+"]-";
                }
            }
        return Texto;
    }
    
    //Para verficar si el array y la lista son iguales
    @Override
    public String Victoria()throws RemoteException{
        if(Arrays.equals(this.PalabraEscogida, this.PalabraHallada)){
            return "Felicidades Ganaste";
        }else{
            return "Apunto de Morir";
        }
    }
    

       
  public static void main(String[] args) {
       ServidorAhorcado servidor;  
      try {
	    LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
	    servidor=new ServidorAhorcado(); 
	    Naming.bind("Ahorcado", servidor); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    }



  
   
}
