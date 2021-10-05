package Teoria_Informatica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lenguajes_de_Programacion extends Lenguajes {

    protected String Nombre;
    protected String Info;

    public Lenguajes_de_Programacion(String Info) {
        this.Nombre = "Lenguajes de Programacion : ";
        this.Info = "es un lenguaje informático, diseñado para expresar órdenes e instrucciones precisas,"
                + "que deben ser llevadas a cabo por una computadora.\n"
                + "El mismo puede utilizarse para crear programas que controlen el comportamiento físico o lógico de un ordenador. \n"
                + "Está compuesto por una serie de símbolos, reglas sintácticas y semánticas que definen la estructura del lenguaje.\n";
    }

    @Override
    public String Nombre() {
        return Nombre;
    }

    @Override
    public String Informacion() {
        return Info;
    }

    @Override
    public void SubMenu() {
        Scanner Guardar = new Scanner(System.in);

        int Opcion;

        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("- - - - - - MENU - - - - - -\n"
                    + "1.Java.\n"
                    + "2.C++.\n"
                    + "3.Python.\n"
                    + "4.JavaScript.\n"
                    + "5.Salir.\n"
                    + "Opcion : \n"));

            switch (Opcion) {
                case 1:
                    Java Objeto = new Java(Info);
                    JOptionPane.showMessageDialog(null, Objeto.getNombre1());
                    JOptionPane.showMessageDialog(null, Objeto.getInfo1());
                    break;
                case 2:
                    CPP Objeto1 = new CPP(Info);
                    JOptionPane.showMessageDialog(null, Objeto1.getNombre2());
                    JOptionPane.showMessageDialog(null, Objeto1.getInfo2());
                    break;
                case 3:
                    Python Objeto2 = new Python(Info);
                    JOptionPane.showMessageDialog(null, Objeto2.getNombre3());
                    JOptionPane.showMessageDialog(null, Objeto2.getInfo3());
                    break;
                case 4:
                    JavaScript Objeto4 = new JavaScript(Info);
                    JOptionPane.showMessageDialog(null, Objeto4.getNombre4());
                    JOptionPane.showMessageDialog(null, Objeto4.getInfo4());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Volviendo al Menu Anterior ->->->->");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR DIGITE OTRA OPCION . . .");
                    break;

            }
        } while (Opcion != 5);

    }

}
