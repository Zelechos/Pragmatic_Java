package Teoria_Informatica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        Menu();
    }

    public static void Menu() {

        Scanner Guardar = new Scanner(System.in);

        int Opcion = 0;
        do {
            try {
                Opcion = Integer.parseInt(JOptionPane.showInputDialog("- - - - - - MENU - - - - - -\n"
                        + "1.Lenguaje Informatico.\n"
                        + "2.Redes Informaticas.\n"
                        + "3.Lenguaje de Alto Nivel.\n"
                        + "4.Lenguajes Interpretados.\n"
                        + "5.Agregar mas info.\n"
                        + "6.Salir.\n"
                        + "Opcion : \n"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL SEGUIR INSTRUCCIONES");
            } finally {

            }
            switch (Opcion) {
                case 1:
                    Lenguajes_Informaticos obj = new Lenguajes_Informaticos();
                    JOptionPane.showMessageDialog(null, obj.Nombre());
                    JOptionPane.showMessageDialog(null, obj.Informacion());
                    obj.SubMenu();
                    break;

            }

        } while (Opcion != 6);

    }

}
