package sub.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WrtingToFiles {

    public static void main(String[] args) {
        File file = new File("printTestfile.txt"); // some file

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print("We are testing this \nwe are testing it again \nand testing again to be sure");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
