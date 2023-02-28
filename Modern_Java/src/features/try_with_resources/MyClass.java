package features.try_with_resources;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass {

    void readFile(String file) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        try (reader) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
