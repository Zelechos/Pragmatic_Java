package enums;

public enum Continents {
    EUROPE(46),
    AFRICA(53),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int paises;

    Continents(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }

}
