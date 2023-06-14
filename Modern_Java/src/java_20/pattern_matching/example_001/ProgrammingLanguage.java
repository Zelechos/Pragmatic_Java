package java_20.pattern_matching.example_001;

public sealed interface ProgrammingLanguage permits Java, JavaScript, Python {

    String getDate();

    String getName();

    String show();

}
