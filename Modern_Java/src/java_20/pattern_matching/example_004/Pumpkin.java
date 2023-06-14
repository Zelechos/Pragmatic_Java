package java_20.pattern_matching.example_004;

public record Pumpkin(String type, boolean lightBulb, boolean herb, boolean sugar) implements Mate {
    @Override
    public String getType() {
        return null;
    }

    @Override
    public boolean hasLightBulb(Mate mate) {
        return false;
    }

    @Override
    public boolean hasHerb(Mate mate) {
        return false;
    }

    @Override
    public boolean hasSugar(Mate mate) {
        return false;
    }
}
