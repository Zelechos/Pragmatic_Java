package java_20.pattern_matching.example_004;

public sealed interface Mate permits Imperial, Wood, Plastic, Aluminum, Pumpkin {

    String getType();

    boolean hasLightBulb(Mate mate);

    boolean hasHerb(Mate mate);

    boolean hasSugar(Mate mate);
}
