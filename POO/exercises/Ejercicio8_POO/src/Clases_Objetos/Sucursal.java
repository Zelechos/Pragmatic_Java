package Clases_Objetos;

public class Sucursal {

    private int Numero_de_Sucursal;
    private String Direccion;
    private String Ciudad;

    public Sucursal(int Numero_de_Sucursal, String Direccion, String Ciudad) {
        this.Numero_de_Sucursal = Numero_de_Sucursal;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
    }

    public int getNumero_de_Sucursal() {
        return Numero_de_Sucursal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String MostrarDatosSucursal() {
        return "\nEl numero de la Sucursal es : " + Numero_de_Sucursal + "\nLa Direccion de la Sucursal es : " + Direccion + "\nLa Ciudad de la Sucursal es : " + Ciudad;
    }

    //Prioridad alta =1 , Prioridad Express =2;
    public double CalcularPaquete(Paquete Paquete_a_Enviar) {
        double Precio;
        
        Precio = Paquete_a_Enviar.getPeso();

        //Alta
        if (Paquete_a_Enviar.getPrioridad() == 1) {
            Precio += 10;
        }
        //Express
        if (Paquete_a_Enviar.getPrioridad() == 2) {
            Precio += 20;
        }

        return Precio;
    }

}
