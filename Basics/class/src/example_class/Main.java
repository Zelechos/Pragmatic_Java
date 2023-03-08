package example_class;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Ferrari", "1995", "black");
        car.setModel("Ford");
        System.out.println(car.information(car.getModel(), "NEW"));
    }
}
