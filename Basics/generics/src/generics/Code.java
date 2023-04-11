package generics;

import java.util.Objects;

public record Code(String language, int year) {

    public Code {
        if (language == null) Objects.requireNonNull(language, "language it can not be null");
        if (year <= 0) throw new IllegalArgumentException("the year can be positive or mayor to 0");
    }

    @Override
    public String toString() {
        return "Code{" +
                "language='" + language + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
