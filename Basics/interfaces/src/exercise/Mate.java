package exercise;

import java.util.List;

/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public class Mate implements IMate {

    public List<Integer> temperatureRange;

    public Mate() {
        this.temperatureRange = List.of(75, 80);
    }

    @Override
    public void drinkingMate(int temperature) {

        if (temperatureRange.get(0) <= temperature && temperature <= temperatureRange.get(1)) {
            System.out.println("sound of Mate");
        }

        if(temperature < temperatureRange.get(0)){
            System.out.println("it's very cold !!");
        }

        if(temperature > temperatureRange.get(1)){
            System.out.println("it's very hooot auch!!");
        }
    }

    @Override
    public void addSugar() {
        System.out.println("add Sugar at the Mate");
        prepareMateScanner();
    }

    @Override
    public void addWater() {
        System.out.println("add Water at the Mate");
        prepareMateScanner();
    }

    @Override
    public void addHerb() {
        System.out.println("add Herb at the Mate");
        prepareMateScanner();
    }

    @Override
    public void putLightBulb() {
        System.out.println("put LightBulb in the Mate");
        prepareMateScanner();
    }

    public void prepareMateScanner(){
        StackTraceElement [] recipeToPrepareMate = Thread.currentThread().getStackTrace();
        for (StackTraceElement action : recipeToPrepareMate){
            if(action.getClassName().equals("exercise.Mate")){
                System.out.println(action.getMethodName());
            }
        }
    }

    public void prepareGoodMate(){
        this.addHerb();
        this.addSugar();
        this.putLightBulb();
        this.addWater();
    }
}
