package Teoria_Informatica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lenguajes_de_Especificacion extends Lenguajes {

    protected String Nombre;
    protected String Info;

    public Lenguajes_de_Especificacion(String Info) {
        this.Nombre = "Lenguajes de Especificacion";
        this.Info = "En el contexto de la ingeniería eléctrica, la computación y ramas afines, \n"
                + "un lenguaje de especificación o lenguaje de descripción es un lenguaje formal o semi-formal \n"
                + "cuya función es construir modelos de los sistemas que se desea elaborar.\n"
                + "\n"
                + "A diferencia de los lenguajes de programación, que son lenguajes interpretables o traducibles \n"
                + "por una computadora hacia una representación ejecutable, los lenguajes de especificación no son \n"
                + "por lo general utilizados para implementar el sistema, sino para especificarlo, conceptualizarlo o \n"
                + "incluso validarlo, aunque también suelen ser legibles para un programa de computadora, que puede asistir en el proceso de validación.\n"
                + "\n"
                + "Las especificaciones hechas en un lenguaje de descripción no suelen ser interpretables o ejecutables, \n"
                + "sin embargo existen algunos ambientes de desarrollo basados en lenguajes de descripción,\n "
                + "que permiten la generación del sistema a partir del modelo. Los lenguajes de especificación pueden dividirse en semi-formales y formales.";

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

        Scanner Entrada = new Scanner(System.in);

        int Opcion;

        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("- - - - - - MENU - - - - - -\n"
                    + "1.UML.\n"
                    + "2.Alloy.\n"
                    + "3.Automatas.\n"
                    + "4.Red de Petri.\n"
                    + "5.Salir.\n"
                    + "Opcion : \n"));

            switch (Opcion) {
                case 1:
                    UML obj = new UML(Info);
                    JOptionPane.showMessageDialog(null, obj.getNombre());
                    JOptionPane.showMessageDialog(null, obj.getInfo());
                    break;
                case 2:
                    Alloy obj1 = new Alloy(Info);
                    JOptionPane.showMessageDialog(null, obj1.getNombre());
                    JOptionPane.showMessageDialog(null, obj1.getInfo());
                    break;
                case 3:
                    Automatas obj2 = new Automatas(Info);
                    JOptionPane.showMessageDialog(null, obj2.getNombre());
                    JOptionPane.showMessageDialog(null, obj2.getInfo());
                    break;
                case 4:
                    RedPetri obj3 = new RedPetri(Info);
                    JOptionPane.showMessageDialog(null, obj3.getNombre());
                    JOptionPane.showMessageDialog(null, obj3.getInfo());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Volviendo al Menu Anterior.");
                    break;
                default:
                    break;

            }

        } while (Opcion != 5);
    }

}
