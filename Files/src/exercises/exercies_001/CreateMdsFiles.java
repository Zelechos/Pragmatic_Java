package exercises.exercies_001;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateMdsFiles {

    private static final List<String> filesNames = List.of(
            "Algoritmo de Morris-Pratt", "Algoritmo de Knuth-Morris-Pratt", "Algoritmo de Simon", "Algoritmo de Colussi", "Algoritmo de Galil-Giancarlo", "Algoritmo Apostólico-Crochemore", "Algoritmo no tan ingenuo", "Algoritmo de Boyer-Moore", "Algoritmo Turbo BM", "Algoritmo Apostólico-Giancarlo", "Algoritmo Colussi inverso", "Algoritmo Horspool", "Algoritmo de Boyer-Moore sintonizado", "Algoritmo de Zhu-Takaoka", "Algoritmo de Berry-Ravindran", "Algoritmo de Smith", "Algoritmo Raita", "Algoritmo de factor inverso", "Algoritmo de factor inverso turbo", "Algoritmo de coincidencia Dawg hacia adelante", "Algoritmo de coincidencia Dawg no determinista hacia atrás", "Algoritmo de coincidencia de Oracle hacia atrás", "Algoritmo de Galil-Seiferas", "Algoritmo de dos vías", "Coincidencia de cadenas en el algoritmo de alfabetos ordenados", "Algoritmo de desajuste óptimo", "Algoritmo de cambio máximo", "Omitir algoritmo de búsqueda", "Algoritmo de búsqueda por omisión de KMP", "Algoritmo alfa de búsqueda por omisión");

    public CreateMdsFiles() {
    }

    public static void execute() {
        filesNames.parallelStream().forEach(name -> {
            StringBuilder text = new StringBuilder("# " + name);
            text.append("\n")
                    .append("<img align=\"center\" src=\"https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif\" alt=\"javascript\" width=\"1000\"/>")
                    .append("\n").append("\n")
                    .append("⭐\uFE0F From [@Zelechos](https://github.com/Zelechos)");
            File file = new File("Z:\\Proyectos\\Algoritmia\\data\\articles", name + ".md");
            try {
                FileWriter writing = new FileWriter(file);
                writing.write(text.toString());
                writing.close();
            } catch (IOException ex) {
                System.err.println("Error could not write to file...\n" + ex);
            }
        });

        System.err.println("EXECUTE FINISHED!!!");
    }

    @Override
    public String toString() {
        return "CreateMdsFiles{" +
                "filesNames=" + filesNames +
                '}';
    }
}
