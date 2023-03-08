import java.util.Map;

/**
 * Class to generate UML Diagrams
 *
 * @author Alex T.H.
 * @version v0.0.9
 */
public class Diagram {

    private final String nameOfClass;
    private final Map<Integer, String> attributes;
    private final Map<Integer, String> methods;

    public Diagram(String nameOfClass, Map<Integer, String> attributes, Map<Integer, String> methods) {
        this.nameOfClass = nameOfClass;
        this.attributes = attributes;
        this.methods = methods;
    }

    public String getNameOfClass() {
        return this.nameOfClass;
    }

    public StringBuilder showDiagram() {
        var template = new StringBuilder();
        template.append(renderClassName(this.getNameOfClass()));
        var showAttributes = renderCharacteristics(template, this.attributes);
        return renderCharacteristics(showAttributes, this.methods);
    }

    public StringBuilder renderClassName(String nameOfClass) {
        return renderTittle(nameOfClass);
    }

    public StringBuilder renderCharacteristics(StringBuilder template, Map<Integer, String> characteristics) {
        var templateBuilder = new StringBuilder();

        for (Object key : characteristics.keySet()) {
            templateBuilder.append(renderBox(characteristics.get(key)));
        }
        templateBuilder.append("|-----------------------------------------------|\n");
        template.append(templateBuilder);
        return template;
    }

    public String renderBox(String text) {
        StringBuilder template = new StringBuilder("| " + text + "");
        template.append(" ".repeat(Math.max(0, 48 - template.length())));
        return template + "|\n";
    }

    public StringBuilder renderTittle(String tittle) {
        StringBuilder templateMain = new StringBuilder();

        int lenghtOfLine = 50;
        templateMain.append("|-----------------------------------------------|\n");

        int sizeOfLine = lenghtOfLine - tittle.length(); // 40
        int sizeOfside = (sizeOfLine / 2) - 2;

        StringBuilder spaceOfBefore = new StringBuilder();
        StringBuilder spaceOfAfter = new StringBuilder();

        for (var i = 0; i < sizeOfside; i++) {
            if (i == 0) {
                spaceOfBefore.append("|");
            }
            if (i < sizeOfLine) {
                spaceOfBefore.append(" ");
                spaceOfAfter.append(" ");
            }
        }

        StringBuilder templateTitle = new StringBuilder();
        templateTitle.append(spaceOfBefore);
        templateTitle.append(tittle);
        templateTitle.append(spaceOfAfter);

        if (templateTitle.length() == 47) {
            templateTitle.append(" |\n");
        }

        if (templateTitle.length() == 46) {
            templateTitle.append("  |\n");
        }

        templateMain.append(templateTitle);
        templateMain.append("|-----------------------------------------------|\n");
        return templateMain;
    }

}
