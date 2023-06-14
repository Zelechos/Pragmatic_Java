package java_20.pattern_matching.example_001;

public enum LanguageCreationDate {

    JAVA("22 de Octubre de 1995"),
    PYTHON("10 de Septiembre de 1991"),
    JAVASCRIPT("4 de Diciembre de 1995");

    private final String date;

    LanguageCreationDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
}
