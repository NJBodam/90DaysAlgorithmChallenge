package sub.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RelaceChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d");

        String str = "ab73c80abc9";

        Matcher matcher = pattern.matcher(str);

//        Franse —> France
//	      Eifel tower —> Eiffel Tower
        String txt = "Fran[\\s]e";

        String result = text.replace(txt, "c");
        System.out.println(result);





//        String spaceRegex = "[\\s]{2,}";
//        String startSpace = "\\s*";
//        String result = text.replace(spaceRegex, " ");
//        String result2 = result.replace(startSpace, "      ");
//        System.out.println(result2);
//        System.out.println(result);
    }
}
