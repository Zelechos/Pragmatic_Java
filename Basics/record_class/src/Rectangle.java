public record Rectangle(double length, double width) {

    // tambien podemos declarar campos estáticos, inicializadores estáticos y métodos estáticos en una clase de registro

    // campo estatico
    static double goldenRatio;

    // inicializador estatico (IMPORTANTE APRENDER LA SINTAXIS)
    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    // contructor compacto
    public Rectangle {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException(
                    String.format("Invalid Dimension %f %f", length, width)
            );
        }
    }

    // metodo estatico
    public static Rectangle createGoldenRectangle(double width) {
        return new Rectangle(width, width * goldenRatio);
    }

    //  claramente podemos declarar metodos
    public String greeting(String name) {
        return "Hello " + name;
    }

    public double calculate() {
        return this.length + this.width;
    }

}
