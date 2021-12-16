import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sudoku extends JFrame{

    private static final long serialVersionUID = 1L;

    private int fila, columna;
    private int[][] tablero;
    private JButton[][] btnCells;
    private JTable tabla;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    //------------------------------------------------------------------------------------------------
    // Parte Grafica
    public Sudoku() {
        setFila(9);
        setColumna(9);
        this.tablero = new int [getFila()][getColumna()];
        this.tabla = new JTable (getFila(),getColumna());

        add(BorderLayout.CENTER, tabla());
        add(BorderLayout.NORTH, btnSolve());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public JTable tabla (){
        tabla.setRowHeight(45);
        DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < getFila(); i++) tabla.getColumnModel().getColumn(i).setCellRenderer(alinear);
        return tabla;
    }

    public JPanel btnSolve() {
        JPanel panelNorth = new JPanel();
        JButton btnSol = new JButton("SOLVE");
        panelNorth.add(btnSol);
        btnSol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                add(BorderLayout.CENTER, getBoard());
                getDatos();
                solveSudoku();
                paintSolution();
            }
        });
        return panelNorth;
    }

    public JPanel getBoard() {
        btnCells = new JButton[9][9];
        JPanel panelBoard = new JPanel();
        panelBoard.setLayout(new GridLayout(9,9));
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                JButton cell = new JButton();
                cell.setBackground(Color.WHITE);
                cell.setEnabled(false);
                btnCells[i][j] = cell;
                panelBoard.add(cell);
            }
        }
        return panelBoard;
    }

    public void getDatos(){
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                try {
                    tablero[i][j] = Integer.parseInt(tabla.getModel().getValueAt(i, j).toString());
                } catch (NullPointerException e) {tablero[i][j] = 0;}
            }
        }
    }

    public void paintSolution() {
        for (int i = 0; i < getFila(); i++) {
            for (int j = 0; j < getColumna(); j++) {
                btnCells[i][j].setText(Integer.toString(tablero[i][j]));
            }
        }
    }

    //-------------------------------------------------------------------------------------------------

    // Parte Logica
    public boolean solveSudoku() {
        //RECORRE FILAS
        for (int fila = 0; fila < getFila(); fila++) {
            //RECORRE COLUMNAS
            for (int columna = 0; columna < getColumna(); columna++) {
                //VERIFICAR SI ESTA SIN ASIGNAR
                if (tablero[fila][columna] == 0) {

                    //PROBAR NUMERO 1 AL 9
                    for (int numero = 1; numero <= getFila(); numero++) {
                        //VERIFICAR SI SE PUEDE ASIGNAR EL NRO
                        if (isValid(fila, columna, numero)) {
                            //SE ASIGNA EL NRO
                            tablero[fila][columna] = numero;
                            //LLAMA RECURSIVAMENTE PARA LA SGTE CASILLA
                            if (solveSudoku()) return true;
                            else tablero[fila][columna] = 0;
                        }
                    }return false;
                }
            }
        }return true;
    }

    public boolean isValid(int fila, int columna, int numero) {
        return !(containsFila(fila, numero) || containsColumna(columna, numero) || containsBloque(fila, columna, numero));
    }

    public boolean containsFila(int fila, int numero) {
        for (int i = 0; i < getFila(); i++) {
            if (tablero[fila][i] == numero) return true;
        } return false;
    }

    public boolean containsColumna(int columna, int numero) {
        for (int i = 0; i < getColumna(); i++) {
            if (tablero[i][columna] == numero) return true;
        } return false;
    }

    public boolean containsBloque(int fila, int columna, int numero) {
        int f = fila - fila % 3, c = columna - columna % 3;
        for (int i = f; i < f + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (tablero[i][j] == numero) return true;
            }
        }return false;
    }

}
