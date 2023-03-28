package Clases_Objetos;

public class Cuenta {

    private int Numero_de_Cuenta;
    private double Saldo;

    public Cuenta(int Numero_de_Cuenta, double Saldo) {
        this.Numero_de_Cuenta = Numero_de_Cuenta;
        this.Saldo = Saldo;
    }

    public int getNumero_de_Cuenta() {
        return Numero_de_Cuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void IngresarDinero(double Cantidad) {
        Saldo += Cantidad;
    }

    public void RetirarDinero(double Cantidad) {
        Saldo -= Cantidad;
    }

}
