package test;

import java.util.Objects;

/**
 * Learn about Object Class & Equals, HashCode Methods
 *
 * @author Alex T.H.
 * @version v0.3.6
 * @since 20.0.0 2024-01-22
 */
public class Car {
    static final int KM = 0;
    public String brand = null;
    public String model = null;
    public String color = null;

    public Car() {
    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public StringBuilder information(String model, String state) {
        Engine engine = new Engine(state);
        StringBuilder response = new StringBuilder();
        response.append("the car model is ->\t" + model);
        response.append("\n the engine state is ->\t" + engine.getState());
        return response;
    }

    public class Engine {
        public String state = null;

        public Engine(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color);
    }
}
