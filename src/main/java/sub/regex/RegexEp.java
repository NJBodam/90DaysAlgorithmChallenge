package sub.regex;

public class RegexEp {
    public static void main(String[] args) {
        String regex = "[0-9]{4}"; // four digits

        "6342".matches(regex);  // true
        "9034".matches(regex);  // true

        "182".matches(regex);   // false
        "54312".matches(regex); // false
    }
}
