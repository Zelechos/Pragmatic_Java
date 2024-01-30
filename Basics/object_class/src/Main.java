import test.Car;

/**
 * Learn about Object Class & Equals, HashCode Methods
 *
 * @author Alex T.H.
 * @version v0.3.6
 * @since 20.0.0 2024-01-22
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car("tesla", "2019", "white");
        Car car2 = new Car("tesla", "2019", "white");

        // de esta manera evaluamos las referencias en memoria de los objetos
        if (car == car2) {
            System.out.println("Tienen la misma referencia en memoria " + car + " <-> " + car2);
        } else {
            System.out.println("Tienen distinta referencia en memoria " + car + " <-> " + car2);
        }

        // con equals() evaluamos los contenidos de los Objetos
        if(car.equals(car2)) {
            System.out.println("Los objetos son Iguales en contenido");
        } else {
            System.out.println("Los objetos son Diferentes en contenido");
        }

        // con los metodos hashCode() evaluamos si los hashCode generados de los Objetos son iguales
        if(car.hashCode() == car2.hashCode()){
            System.out.println("Los hashCodes son Iguales " + car.hashCode() + " <-> " + car2.hashCode());
        } else {
            System.out.println("Los hashCodes son Diferentes " + car.hashCode() + " <-> " + car2.hashCode());
        }

        /*
          La Regla indica que si la comparacion de objetos con el metodo equals() da como
          resultado true entonces también en la comparacion de los hashCode() dara true
         */
    }
}
