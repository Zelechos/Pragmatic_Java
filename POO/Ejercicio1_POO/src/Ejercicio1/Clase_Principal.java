package Ejercicio1;

import javax.swing.JOptionPane;

public class Clase_Principal {

    public static void main(String[] args) {

        Cuadrilatero Entrada_1;

        float Lado_1, Lado_2;

        Lado_1 = Float.parseFloat(JOptionPane.showInputDialog("Digite un Lado del Cuadrilatero : "));
        Lado_2 = Float.parseFloat(JOptionPane.showInputDialog("Digite un Lado del Cuadrilatero : "));

        if (Lado_1 != Lado_2) {
            Entrada_1 = new Cuadrilatero(Lado_1, Lado_2);
        } else {
            Entrada_1 = new Cuadrilatero(Lado_1);
        }

        JOptionPane.showMessageDialog(null, "El Perimetro del Cuadrilatero es  : " + Entrada_1.getPerimetro());
        JOptionPane.showMessageDialog(null, "El Area del Cuadrilatero es : " + Entrada_1.getArea());
        
    }
}



