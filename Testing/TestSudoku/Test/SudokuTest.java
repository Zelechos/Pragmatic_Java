import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SudokuTest {
    int[][] tablero = new int [9][9];


    @Test
    public void solveSudoku9x9Test(){
        Sudoku sudoku = new Sudoku();
        Assertions.assertEquals(solveSudoku(tablero), sudoku.solveSudoku());
    }

    @Test
    public void isValidTest() {
        Sudoku sudoku = new Sudoku();
        Assertions.assertEquals(isValid(1,1,9), sudoku.isValid(1,1,9));
    }

    @Test
    public void containsFilaTest(){
        Sudoku sudoku = new Sudoku();
        Assertions.assertEquals(containsFila(3,5), sudoku.containsFila(3,5));
    }

    @Test
    public void containsColumnaTest(){
        Sudoku sudoku = new Sudoku();
        Assertions.assertEquals(containsColumna(7,9), sudoku.containsColumna(7,9));
    }

    @Test
    public void containsBloqueTest(){
        Sudoku sudoku = new Sudoku();
        Assertions.assertEquals(containsBloque(1, 2, 2), sudoku.containsBloque(1, 2, 2));
    }

    /*Metodos auxiliares*/
    public boolean solveSudoku(int[][] tablero) {
        //RECORRE FILAS
        for (int fila = 0; fila < 9; fila++) {
            //RECORRE COLUMNAS
            for (int columna = 0; columna < 9; columna++) {
                //VERIFICAR SI ESTA SIN ASIGNAR
                if (tablero[fila][columna] == 0) {

                    //PROBAR NUMERO 1 AL 9
                    for (int numero = 1; numero <= 9; numero++) {
                        //VERIFICAR SI SE PUEDE ASIGNAR EL NRO
                        if (isValid(fila, columna, numero)) {
                            //SE ASIGNA EL NRO
                            tablero[fila][columna] = numero;
                            //LLAMA RECURSIVAMENTE PARA LA SGTE CASILLA
                            if (solveSudoku(tablero)) return true;
                            else tablero[fila][columna] = 0;
                        }
                    }return false;
                }
            }
        }return true;
    }

    private boolean isValid(int fila, int columna, int numero) {
        return !(containsFila(fila, numero) || containsColumna(columna, numero) || containsBloque(fila, columna, numero));
    }

    private boolean containsFila(int fila, int numero) {
        for (int i = 0; i < 9; i++) {
            if (tablero[fila][i] == numero) return true;
        } return false;
    }

    private boolean containsColumna(int columna, int numero) {
        for (int i = 0; i < 9; i++) {
            if (tablero[i][columna] == numero) return true;
        } return false;
    }

    private boolean containsBloque(int fila, int columna, int numero) {
        int f = fila - fila % 3 , c = columna - columna % 3;
        for (int i = f; i < f + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (tablero[i][j] == numero) return true;
            }
        }return false;
    }


}
