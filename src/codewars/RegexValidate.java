package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidate {

    public static void main(String[] args) {
        System.out.println(validatePin("1634"));

    }

    public static boolean validatePin(String pin) {
        String regex = "^\\d{4}$|^\\d{6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);
        return matcher.matches();
    }
}