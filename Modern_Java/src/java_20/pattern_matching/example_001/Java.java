package java_20.pattern_matching.example_001;

import static java_20.pattern_matching.example_001.LanguageCreationDate.JAVA;

final public class Java implements ProgrammingLanguage {
    @Override
    public String getDate() {
        return JAVA.getDate();
    }

    @Override
    public String getName() {
        return JAVA.name();
    }

    @Override
    public String show() {
        return "Java {" +
                "date = " + this.getDate() +
                "name = " + this.getName() +
                '}';
    }
}
