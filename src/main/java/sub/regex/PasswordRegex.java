package sub.regex;

import java.util.Scanner;

public class PasswordRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pw = scanner.nextLine();
        String regexCaps = ".*[A-Z]+.*";
        String regexLow = ".*[a-z]+.*";
        String regexNum = ".*[\\d+].*";
        String size = "[\\w]{12,}";

        String reg = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{12,}";

        // ALTERNATIVE SOLUTION
        System.out.println(pw.matches(reg) ? "YES" : "NO");

        if(pw.matches(regexCaps) && pw.matches(regexLow) && pw.matches(regexNum) && pw.matches(size)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
