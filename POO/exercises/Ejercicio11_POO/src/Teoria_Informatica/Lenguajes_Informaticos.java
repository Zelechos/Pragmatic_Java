package Teoria_Informatica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lenguajes_Informaticos extends Lenguajes {

    protected String Nombre;

    public Lenguajes_Informaticos() {
        this.Nombre = "Lenguajes Informaticos : ";
    }

    @Override
    public String Nombre() {
        return Nombre;
    }

    @Override
    public String Informacion() {
        return Informacion;
    }

    @Override
    public void SubMenu() {

        Scanner Guardar = new Scanner(System.in);

        int Opcion = 0;

        do {
            try {
                Opcion = Integer.parseInt(JOptionPane.showInputDialog("- - - - - - MENU - - - - - -\n"
                        + "1.Lenguajes de Programacion.\n"
                        + "2.Lenguajes de Especificacion.\n"
                        + "3.Lenguajes de Consulta.\n"
                        + "4.Lenguajes de Marcas.\n"
                        + "5.Lenguajes de Transformacion\n"
                        + "6.Protocolos de Comunicaciones.\n"
                        + "7.Salir.\n"
                        + "Opcion : \n"));
            } catch (NumberFormatException exc) {
            } finally {
            }
            switch (Opcion) {
                case 1:
                    Lenguajes_de_Programacion Lenguaje = new Lenguajes_de_Programacion(Nombre);
                    JOptionPane.showMessageDialog(null, Lenguaje.Nombre());
                    JOptionPane.showMessageDialog(null, Lenguaje.Informacion());
                    Lenguaje.SubMenu();
                    break;
                case 2:
                    Lenguajes_de_Especificacion Lenguaj = new Lenguajes_de_Especificacion(Nombre);
                    JOptionPane.showMessageDialog(null, Lenguaj.Nombre());
                    JOptionPane.showMessageDialog(null, Lenguaj.Informacion());
                    Lenguaj.SubMenu();
                    break;
                case 3:
                    //Lengaujes de Consulta
                    break;

            }
        } while (Opcion != 7);

    }

}
