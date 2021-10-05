package Interface;

import Modulos.Complejo;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Formularios extends javax.swing.JFrame {


    private Complejo Resultado;
    private Complejo Complex1;
    private Complejo Complex2;
    private byte Estado;
    private double numeroI;
    private double numeroR;
    private double numeroI2;
    private double numeroR2;
    private String resultado;
    
    public Formularios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Invisible();
    }
    
    public void Invisible(){
        MensajeDividir.setVisible(false);
        MensajeMultiplicar.setVisible(false);
        MensajeSuma.setVisible(false);
        MensajeResta.setVisible(false);
        sumar.setVisible(false);
        restar.setVisible(false);
        multiplicar.setVisible(false);
        dividir.setVisible(false);
    }
    
    public void Visible(){
        MensajeDividir.setVisible(true);
        MensajeMultiplicar.setVisible(true);
        MensajeSuma.setVisible(true);
        MensajeResta.setVisible(true);
        sumar.setVisible(true);
        restar.setVisible(true);
        multiplicar.setVisible(true);
        dividir.setVisible(true);
    }
    
    public void Mostrar(String Operacion){
        
        
        switch(Operacion){
            case "suma":
                 //  1 + 1i + (-1 - 1i)
                if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0 ){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + ( "+Complex2.getReal()+" "+Complex2.getImag()+"i )= "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 + 1i + 1 + 1i        
                }else if(Complex2.getReal() > 0 && Complex2.getImag() > 0 && Complex1.getReal() > 0 && Complex1.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i + 1 + 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + ( "+Complex2.getReal()+" "+Complex2.getImag()+"i ) = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + ( "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +( 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +( 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i + 1 - 1i
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i + ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 - 1i + 1 - 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                 // -1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i + ("+Complex2.getReal()+" + "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                }
                break;
            case "resta":
                 //  1 + 1i + (-1 - 1i)
                if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0 ){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - ( "+Complex2.getReal()+" "+Complex2.getImag()+"i )= "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 + 1i + 1 + 1i        
                }else if(Complex2.getReal() > 0 && Complex2.getImag() > 0 && Complex1.getReal() > 0 && Complex1.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i + 1 + 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - ( "+Complex2.getReal()+" "+Complex2.getImag()+"i ) = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - ( "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +( 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +( 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i + 1 - 1i
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i - ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 - 1i + 1 - 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                 // -1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i - ("+Complex2.getReal()+" + "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                }
                break;
                case "multiplicacion":
                 //  1 + 1i + (-1 - 1i)
                if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0 ){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * ( "+Complex2.getReal()+" "+Complex2.getImag()+"i )= "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 + 1i + 1 + 1i        
                }else if(Complex2.getReal() > 0 && Complex2.getImag() > 0 && Complex1.getReal() > 0 && Complex1.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i + 1 + 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * ( "+Complex2.getReal()+" "+Complex2.getImag()+"i ) = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * ( "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +( 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +( 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i + 1 - 1i
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i * ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 - 1i + 1 - 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                 // -1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i * ("+Complex2.getReal()+" + "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                }
                break;
                case "division":
                 //  1 + 1i + (-1 - 1i)
                if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0 ){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / ( "+Complex2.getReal()+" "+Complex2.getImag()+"i )= "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 + 1i + 1 + 1i        
                }else if(Complex2.getReal() > 0 && Complex2.getImag() > 0 && Complex1.getReal() > 0 && Complex1.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i + 1 + 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / ( "+Complex2.getReal()+" "+Complex2.getImag()+"i ) = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / ( "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // - 1 + 1i +(1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                //  1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +( 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +( 1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i +(-1 + 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / ( "+Complex2.getReal()+" + "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 + 1i + 1 - 1i
                }else if(Complex1.getReal() > 0 && Complex1.getImag() > 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // 1 - 1i +(- 1 - 1i)
                }else if(Complex1.getReal() > 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 + 1i +(- 1 - 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() > 0 && Complex2.getReal() < 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" + "+Complex1.getImag()+"i / ("+Complex2.getReal()+" "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                // -1 - 1i + 1 - 1i
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() > 0 && Complex2.getImag() < 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / "+Complex2.getReal()+" "+Complex2.getImag()+"i  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                 // -1 - 1i +(- 1 + 1i)
                }else if(Complex1.getReal() < 0 && Complex1.getImag() < 0 && Complex2.getReal() < 0 && Complex2.getImag() > 0){

                resultado  = Complex1.getReal()+" "+Complex1.getImag()+"i / ("+Complex2.getReal()+" + "+Complex2.getImag()+"i)  = "+Resultado.getReal()+","+Resultado.getImag()+"i ";

                }
                break;
                
        }
       
        
    }
    
    //Operaciones
    public void Sumar(byte data){
        numeroI = Double.parseDouble(NumeroI.getText());
        numeroR = Double.parseDouble(NumeroR.getText());
        numeroI2 = Double.parseDouble(NumeroI1.getText());
        numeroR2 = Double.parseDouble(NumeroR1.getText());
        
        
        Complex1 = new Complejo(numeroR,numeroI);
        Complex2 = new Complejo(numeroR2,numeroI2);
        Resultado = new Complejo();
        Resultado = Complex2.sumar(Complex1);
        
        
        Mostrar("suma");
        if(data == 0){
            Respuesta.setText(resultado);
        }else{
            sumar.setText(resultado);
        }

    }
    public void Restar(byte data){
        numeroI = Double.parseDouble(NumeroI.getText());
        numeroR = Double.parseDouble(NumeroR.getText());
        numeroI2 = Double.parseDouble(NumeroI1.getText());
        numeroR2 = Double.parseDouble(NumeroR1.getText());
        
        
        Complex1 = new Complejo(numeroR,numeroI);
        Complex2 = new Complejo(numeroR2,numeroI2);
        Resultado = new Complejo();
        Resultado = Complex1.restar(Complex2);
        
        Mostrar("resta");
        if(data == 0){
            Respuesta.setText(resultado);
        }else{
            restar.setText(resultado);
        }
       
    }
    public void Multiplicar(byte data){
        numeroI = Double.parseDouble(NumeroI.getText());
        numeroR = Double.parseDouble(NumeroR.getText());
        numeroI2 = Double.parseDouble(NumeroI1.getText());
        numeroR2 = Double.parseDouble(NumeroR1.getText());
        
        
        Complex1 = new Complejo(numeroR,numeroI);
        Complex2 = new Complejo(numeroR2,numeroI2);
        Resultado = new Complejo();
        Resultado = Complex2.multiplicar(Complex1);
        
        Mostrar("multiplicacion");
        if(data == 0){
            Respuesta.setText(resultado);
        }else{
            multiplicar.setText(resultado);
        }
    }
    public void Dividir(byte data){
        numeroI = Double.parseDouble(NumeroI.getText());
        numeroR = Double.parseDouble(NumeroR.getText());
        numeroI2 = Double.parseDouble(NumeroI1.getText());
        numeroR2 = Double.parseDouble(NumeroR1.getText());
        
        
        Complex1 = new Complejo(numeroR,numeroI);
        Complex2 = new Complejo(numeroR2,numeroI2);
        Resultado = new Complejo();
        Resultado = Complex1.dividir(Complex2);
        
        Mostrar("division");
        if(data == 0){
            Respuesta.setText(resultado);
        }else{
            dividir.setText(resultado);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        Cerrar = new javax.swing.JLabel();
        BitBucket = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Tittle = new javax.swing.JLabel();
        Ver = new javax.swing.JLabel();
        Multiplicar = new javax.swing.JLabel();
        Restar = new javax.swing.JLabel();
        Sumar = new javax.swing.JLabel();
        Divisor = new javax.swing.JLabel();
        NumeroR = new javax.swing.JTextField();
        NumeroI = new javax.swing.JTextField();
        NumeroR1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        NumeroI1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        panel4 = new java.awt.Panel();
        Titulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        MensajeRespuesta = new javax.swing.JLabel();
        Respuesta = new javax.swing.JLabel();
        MensajeSuma = new javax.swing.JLabel();
        sumar = new javax.swing.JLabel();
        MensajeResta = new javax.swing.JLabel();
        restar = new javax.swing.JLabel();
        MensajeMultiplicar = new javax.swing.JLabel();
        multiplicar = new javax.swing.JLabel();
        MensajeDividir = new javax.swing.JLabel();
        dividir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setPreferredSize(new java.awt.Dimension(65, 690));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        BitBucket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bitbucket.png"))); // NOI18N
        BitBucket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BitBucketMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cerrar)
                    .addComponent(BitBucket))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BitBucket, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 65, 550));

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setPreferredSize(new java.awt.Dimension(340, 690));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 10));
        panel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 290, 10));

        Tittle.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Tittle.setForeground(new java.awt.Color(255, 255, 255));
        Tittle.setText("LLena Los Campos");
        Tittle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tittle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TittleMouseClicked(evt);
            }
        });
        panel2.add(Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 30));

        Ver.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Ver.setForeground(new java.awt.Color(255, 255, 255));
        Ver.setText("Todas las Operaciones"); // NOI18N
        Ver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });
        panel2.add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 290, 35));

        Multiplicar.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicar.setText("Multiplicar");
        Multiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Multiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiplicarMouseClicked(evt);
            }
        });
        panel2.add(Multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 290, 35));

        Restar.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Restar.setForeground(new java.awt.Color(255, 255, 255));
        Restar.setText("Restar");
        Restar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Restar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarMouseClicked(evt);
            }
        });
        panel2.add(Restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 290, 35));

        Sumar.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Sumar.setForeground(new java.awt.Color(255, 255, 255));
        Sumar.setText("Sumar"); // NOI18N
        Sumar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarMouseClicked(evt);
            }
        });
        panel2.add(Sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 290, 35));

        Divisor.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Divisor.setForeground(new java.awt.Color(255, 255, 255));
        Divisor.setText("Division");
        Divisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Divisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DivisorMouseClicked(evt);
            }
        });
        panel2.add(Divisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 290, 35));

        NumeroR.setBackground(new java.awt.Color(0, 0, 0));
        NumeroR.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        NumeroR.setForeground(new java.awt.Color(255, 255, 255));
        NumeroR.setText("Primer Real . . .");
        NumeroR.setBorder(null);
        NumeroR.setOpaque(false);
        NumeroR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumeroRMouseClicked(evt);
            }
        });
        panel2.add(NumeroR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 300, 30));

        NumeroI.setBackground(new java.awt.Color(0, 0, 0));
        NumeroI.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        NumeroI.setForeground(new java.awt.Color(255, 255, 255));
        NumeroI.setText("Primer Imaginario . . .");
        NumeroI.setBorder(null);
        NumeroI.setOpaque(false);
        NumeroI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumeroIMouseClicked(evt);
            }
        });
        panel2.add(NumeroI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 300, 30));

        NumeroR1.setBackground(new java.awt.Color(0, 0, 0));
        NumeroR1.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        NumeroR1.setForeground(new java.awt.Color(255, 255, 255));
        NumeroR1.setText("Segundo Real . . .");
        NumeroR1.setBorder(null);
        NumeroR1.setOpaque(false);
        NumeroR1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumeroR1MouseClicked(evt);
            }
        });
        panel2.add(NumeroR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 300, 30));
        panel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 330, 10));

        NumeroI1.setBackground(new java.awt.Color(0, 0, 0));
        NumeroI1.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        NumeroI1.setForeground(new java.awt.Color(255, 255, 255));
        NumeroI1.setText("Segundo Imaginario . . .");
        NumeroI1.setBorder(null);
        NumeroI1.setOpaque(false);
        NumeroI1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumeroI1MouseClicked(evt);
            }
        });
        panel2.add(NumeroI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 300, 30));
        panel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 290, 10));
        panel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 290, 10));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 330, 550));

        panel4.setBackground(new java.awt.Color(153, 153, 153));
        panel4.setForeground(new java.awt.Color(255, 255, 255));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI Light", 0, 33)); // NOI18N
        Titulo.setText("Calculador Basica de Complejos");
        panel4.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 540, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 540, 10));

        MensajeRespuesta.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        MensajeRespuesta.setForeground(new java.awt.Color(51, 51, 51));
        MensajeRespuesta.setText("Respuesta :");
        panel4.add(MensajeRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 540, 40));

        Respuesta.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        Respuesta.setForeground(new java.awt.Color(51, 51, 51));
        Respuesta.setText("Respuesta . . . .");
        panel4.add(Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 540, 40));

        MensajeSuma.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        MensajeSuma.setForeground(new java.awt.Color(51, 51, 51));
        MensajeSuma.setText("Suma :");
        panel4.add(MensajeSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 540, 40));

        sumar.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        sumar.setForeground(new java.awt.Color(51, 51, 51));
        panel4.add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 540, 40));

        MensajeResta.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        MensajeResta.setForeground(new java.awt.Color(51, 51, 51));
        MensajeResta.setText("Resta :");
        panel4.add(MensajeResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 540, 40));

        restar.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        restar.setForeground(new java.awt.Color(51, 51, 51));
        panel4.add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 540, 40));

        MensajeMultiplicar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        MensajeMultiplicar.setForeground(new java.awt.Color(51, 51, 51));
        MensajeMultiplicar.setText("Multiplicar :");
        panel4.add(MensajeMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 540, 40));

        multiplicar.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(51, 51, 51));
        panel4.add(multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 540, 40));

        MensajeDividir.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        MensajeDividir.setForeground(new java.awt.Color(51, 51, 51));
        MensajeDividir.setText("Dividir :");
        panel4.add(MensajeDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 540, 40));

        dividir.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        dividir.setForeground(new java.awt.Color(51, 51, 51));
        panel4.add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 540, 40));

        getContentPane().add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 570, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
        
        Sumar(Estado = 1);
        Restar(Estado = 1);
        Multiplicar(Estado = 1);
        Dividir(Estado = 1);
        Visible();
    }//GEN-LAST:event_VerMouseClicked

    private void NumeroRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroRMouseClicked
        NumeroR.setText("");
    }//GEN-LAST:event_NumeroRMouseClicked

    private void NumeroIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroIMouseClicked
        NumeroI.setText("");
    }//GEN-LAST:event_NumeroIMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void NumeroR1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroR1MouseClicked
        NumeroR1.setText("");
    }//GEN-LAST:event_NumeroR1MouseClicked

    private void NumeroI1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumeroI1MouseClicked
        NumeroI1.setText("");
    }//GEN-LAST:event_NumeroI1MouseClicked

    private void SumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarMouseClicked
        Sumar(Estado = 0);
        Invisible();
    }//GEN-LAST:event_SumarMouseClicked

    private void TittleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TittleMouseClicked
        
    }//GEN-LAST:event_TittleMouseClicked

    private void MultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplicarMouseClicked
        Multiplicar(Estado = 0);
        Invisible();
    }//GEN-LAST:event_MultiplicarMouseClicked

    private void DivisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivisorMouseClicked
        Dividir(Estado = 0);
        Invisible();
    }//GEN-LAST:event_DivisorMouseClicked

    private void RestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarMouseClicked
        Restar(Estado = 0); 
        Invisible();
    }//GEN-LAST:event_RestarMouseClicked

    private void BitBucketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BitBucketMouseClicked
       if(java.awt.Desktop.isDesktopSupported()){
           java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
           if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
               try {
                    java.net.URI url =  new java.net.URI("https://bitbucket.org/AlexTumiriHuanca/calculadora_complejos/src/master/");
                   try {
                       desktop.browse(url);
                   } catch (IOException ex) {}
               } catch (URISyntaxException ex) {}
           }
       }
    }//GEN-LAST:event_BitBucketMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formularios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BitBucket;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Divisor;
    private javax.swing.JLabel MensajeDividir;
    private javax.swing.JLabel MensajeMultiplicar;
    private javax.swing.JLabel MensajeRespuesta;
    private javax.swing.JLabel MensajeResta;
    private javax.swing.JLabel MensajeSuma;
    private javax.swing.JLabel Multiplicar;
    private javax.swing.JTextField NumeroI;
    private javax.swing.JTextField NumeroI1;
    private javax.swing.JTextField NumeroR;
    private javax.swing.JTextField NumeroR1;
    private javax.swing.JLabel Respuesta;
    private javax.swing.JLabel Restar;
    private javax.swing.JLabel Sumar;
    private javax.swing.JLabel Tittle;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Ver;
    private javax.swing.JLabel dividir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel multiplicar;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    private javax.swing.JLabel restar;
    private javax.swing.JLabel sumar;
    // End of variables declaration//GEN-END:variables
}
