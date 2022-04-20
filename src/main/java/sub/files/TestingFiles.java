package sub.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestingFiles {

    public static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
    public static void main(String[] args) throws FileNotFoundException {
        // To read lines
        File file = new File("/Users/mac/Downloads/dataset_91069.txt");

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
            List<Long> numArr = new ArrayList<>();
            Map<Integer, Long> mapper = new HashMap<>();
            // Whenever you use scanner.nextInt() even in an if block
            scanner.nextLine();
            long diff = 0;
            long diffTemp = 0;
            int year = 0;
            int key = scanner.nextInt();
            long value = scanner.nextLong();
            while (scanner.hasNext()) {
                int nKey = scanner.nextInt();
                long nValue = scanner.nextLong();
                diffTemp = nValue - value;
                if (diffTemp > diff) {
                    diff = diffTemp;
                    year = nKey;
                }
                key = nKey;
                value = nValue;
           //     mapper.put(key, value);

              // numArr.add(Long.parseLong(scanner.next()));
               // System.err.println(scanner.nextLong());
//                long temp = scanner.nextLong();
//                maxi = Math.max(temp, maxi);
            }


            System.err.println(year);

//            for (int i = 1; i < numArr.size(); i++) {
//                if(numArr.get(i) % 2 != 0) {
//                    if(numArr.get(i + 2) > numArr.get(i)) {
//                        System.out.println(numArr.get(i + 1));
//                        System.out.println(numArr.get(i + 2));
//                    }
//                }
//            }
            //IntStream.of(numArr).max(Comparator.naturalOrder()).getAsInt();
         //   numArr.stream().max(Comparator.naturalOrder()).get();
          //  System.err.println(numArr.stream().max(Comparator.naturalOrder()).get());
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + file.getName());
        }

        //System.err.print(num);
//        System.out.println("File name: " + file.getName());
//        System.out.println("File path: " + file.getPath());
//        System.out.println("Is file: " + file.isFile());
//        System.out.println("Is directory: " + file.isDirectory());
//        System.out.println("Exists: " + file.exists());
//        System.out.println("Parent path: " + file.getParent());
//        System.out.println("Can execute? : " + file.canExecute());
//        System.out.println("Can write? : " + file.canWrite());
//        System.out.println("Can read? : " + file.canRead());
    }
}
