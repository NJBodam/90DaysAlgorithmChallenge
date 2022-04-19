package sub.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestingFiles {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/mac/Downloads/dataset_91022.txt");

       // Scanner sc = new Scanner(file);
        int num = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                if(scanner.nextInt()  >= 9999)
                num++;

            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file.getName());
        }
        System.err.print(num);
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path: " + file.getParent());
        System.out.println("Can execute? : " + file.canExecute());
        System.out.println("Can write? : " + file.canWrite());
        System.out.println("Can read? : " + file.canRead());
    }
}
