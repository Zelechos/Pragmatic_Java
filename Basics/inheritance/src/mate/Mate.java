package mate;

public class Mate {
    private int size;
    private String color;
    private String lightBulb;
    private String sugar;
    private String water;
    private String grass;

    void primeMate(String color, String lightBulb) {
        System.out.println("Mate color " + color);
        System.out.println("LightBulb " + lightBulb);
    }

    void drinkingMate(String lightBulb, int size) {
        System.out.println(size + "\t" + lightBulb);
    }

    void addSugar(String sugar) {
        System.out.println(sugar);
    }

    void addWater(String water) {
        System.out.println(water);
    }

    void addGrass(String grass) {
        System.out.println(grass);
    }

}