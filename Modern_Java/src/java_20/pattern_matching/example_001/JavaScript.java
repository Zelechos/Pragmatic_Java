package java_20.pattern_matching.example_001;

import static java_20.pattern_matching.example_001.LanguageCreationDate.JAVASCRIPT;

public record JavaScript(int number) implements ProgrammingLanguage {
    @Override
    public String getDate() {
        return JAVASCRIPT.getDate();
    }

    @Override
    public String getName() {
        return JAVASCRIPT.name();
    }

    @Override
    public String show() {
        return "JavaScript {" +
                "date = " + this.getDate() +
                "name = " + this.getName() +
                '}';
    }


}
