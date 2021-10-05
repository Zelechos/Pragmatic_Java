package Clases_Objetos;

public class Cliente {

    private String Nombre;
    private String Apellido;
    private String DNI;
    Cuenta Cuentas[];

    public Cliente(String Nombre, String Apellido, String DNI, Cuenta[] Cuentas) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Cuentas = Cuentas;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public double ConsultarSaldo(int Numero_de_Cuenta) {
        return Cuentas[Numero_de_Cuenta].getSaldo();
    }

    public void IngresandoSaldo(int Numero_de_Cuenta, double Cantidad) {
        Cuentas[Numero_de_Cuenta].IngresarDinero(Cantidad);
    }

    public void RetirandoSaldo(int Numero_de_Cuenta, double Cantidad) {
        Cuentas[Numero_de_Cuenta].RetirarDinero(Cantidad);
    }
    
}
