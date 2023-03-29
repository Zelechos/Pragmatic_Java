package example;

public enum Seniority {
    JUNIOR("1 año de experiencia"),
    SEMISENIOR("3 a 4 años de experiencia"),
    SENIOR("5 a n años de experiencia");

    private final String description;

    private Seniority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
