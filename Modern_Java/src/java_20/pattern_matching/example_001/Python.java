package java_20.pattern_matching.example_001;

import static java_20.pattern_matching.example_001.LanguageCreationDate.PYTHON;

final public class Python implements ProgrammingLanguage {
    @Override
    public String getDate() {
        return PYTHON.getDate();
    }

    @Override
    public String getName() {
        return PYTHON.name();
    }

    @Override
    public String show() {
        return "Python {" +
                "date = " + this.getDate() +
                "name = " + this.getName() +
                '}';
    }

}
