package Clases_Objetos;

public class tablero {

    private int x;
    private int y;

    public tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void Mover_Arriba(int Incremento) {
        y += Incremento;
    }

    public void Mover_Abajo(int Incremento) {
        y -= Incremento;
    }

    public void Mover_Izquierda(int Incremento) {
        x -= Incremento;
    }

    public void Mover_Derecha(int Incremento) {
        x += Incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
