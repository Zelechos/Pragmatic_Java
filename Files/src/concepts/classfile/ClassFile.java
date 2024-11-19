package concepts.classfile;

import java.io.File;

/**
 * Learn Files
 *
 * @author Alex T.H.
 * @version v0.5.3
 * @since 20.0.0 2024-11-19
 */
public class ClassFile {

    public static File file;
    public static File directory;

    public static void main(String[] args) {

        //Ruta Relativa (Funciona si el archivo esta dentro del Proyecto)
        String relativePathFile = "data.csv";

        //Ruta Absoluta Funciona solo si el Archivo esta dentro del Proyecto
        String absolutePathFile = "Z:\\Repositories\\Pragmatic_Java\\Files\\landing_0\\" + relativePathFile;

        file = new File(absolutePathFile);

        if (file.exists()) {
            System.out.println("The File [" + file.getName() + "] exists");

            if (file.isFile()) {
                System.out.println("The [" + file.getName() + "] is a real File");
            } else {
                System.out.println("The [" + file.getName() + "] is not a File");
            }

            if (file.isDirectory()) {
                System.out.println("The [" + file.getName() + "] is a real Directory");
            } else {
                System.out.println("The [" + file.getName() + "] is not a Directory");
            }

            if (file.canRead()) {
                System.out.println("The [" + file.getName() + "] can Read");
            } else {
                System.out.println("The [" + file.getName() + "] can't Read");
            }
        } else {
            System.out.println("The File [" + file.getName() + "] not exists");
        }

        String pathDirectory = "Z:\\Repositories\\Pragmatic_Java\\Files\\landing_0";
        directory = new File(pathDirectory);

        if (directory.exists()) {
            System.out.println("The Directory exists");
            System.out.println("The Directory absolute path is : " + directory.getAbsolutePath());

            if (directory.isFile()) {
                System.out.println("Is a File");
            } else {
                System.out.println("It is not a File");
            }

            if (directory.isDirectory()) {
                System.out.println("Is a Directory");
            } else {
                System.out.println("It is not a Directory");
            }

            if (directory.canRead()) {
                System.out.println("The Directory can read");
            } else {
                System.out.println("The Directory can't read");
            }
            System.out.println("The Directory name is : " + directory.getName());
        } else {
            System.out.println("The Directory not exists");
        }

    }

}
