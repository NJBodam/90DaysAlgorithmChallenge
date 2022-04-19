package sub.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestingFiles {

    public static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
    public static void main(String[] args) throws FileNotFoundException {
        // To read lines
        File file = new File("/Users/mac/Downloads/dataset_91007.txt");

        // To read all contents in the file
        String pathname = "/Users/mac/Downloads/dataset_91007.txt";

       // Scanner sc = new Scanner(file);

//        try {
//            String str = readFileAsString(pathname);
//            Stream.of(str).mapToInt().max()
//            int max = IntStream.of(str.split(" ")).max(Comparator.naturalOrder()).get();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        int num = 0;
        try (Scanner scanner = new Scanner(file)) {
            List<Integer> numArr = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numArr.add(scanner.nextInt());
            }
            //IntStream.of(numArr).max(Comparator.naturalOrder()).getAsInt();
            numArr.stream().max(Comparator.naturalOrder()).get();
            System.err.println(numArr.stream().max(Comparator.naturalOrder()).get());
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file.getName());
        }

       // System.err.print(num);
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
