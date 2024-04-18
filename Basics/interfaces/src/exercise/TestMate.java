package exercise;


/**
 * Learn Interfaces
 *
 * @author Alex T.H.
 * @version v0.4.3
 * @since 20.0.0 2024-04-18
 */
public class TestMate {
    public static void main(String[] args) {
        IMate mate = new Mate();
        mate.addHerb();
        mate.addSugar();
        mate.drinkingMate(81);
    }
}
