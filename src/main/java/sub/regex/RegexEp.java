package sub.regex;

public class RegexEp {
    public static void main(String[] args) {
        String regex = "[0-9]{4}"; // four digits

        System.out.println("6342".matches(regex));
        System.out.println("9034".matches(regex));
        System.out.println("182".matches(regex));
        System.out.println("54312".matches(regex));

        // true
        // true
        // false
        // false

        String regex2 = "1{2,4}";


        System.out.println("1".matches(regex2));
        System.out.println("11".matches(regex2));
        System.out.println("111".matches(regex2));
        System.out.println("1111".matches(regex2));

        ;    // false
        ;   // true
        ;  // true
        ; //false

        String endRegex = "0.[0-9]{2}9{0,2}5*";
        System.err.println("0.1295".matches(endRegex));
        System.err.println("0.129995".matches(endRegex));
        System.err.println("0.125".matches(endRegex));
        System.err.println("0.129955".matches(endRegex));

        String regex4 = "\\s\\w\\d\\s";

        " A5 ".matches(regex4); // true
        " 33 ".matches(regex4); // true
        "\tA4\t".matches(regex4); // true, because tabs are whitespace as well

        "q18q".matches(regex4); // false, 'q' is not a space
        " AB ".matches(regex4); // false, 'B' is not a digit
        " -1 ".matches(regex4); // false, '-' is not an alphanumeric character, but '1' is OK.

        // Boundary shortcut
        String startRegex = "\\bcat"; // matches the part of the word that starts with "cat"
        String endRegexx = "cat\\b"; // matches the part of the word that ends with "cat"
        String wholeRegex = "\\bcat\\b"; // matches the whole word "cat"

    }
}
