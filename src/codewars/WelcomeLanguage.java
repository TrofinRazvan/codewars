package codewars;

import java.util.HashMap;
import java.util.Map;

public class WelcomeLanguage {

    public static void main(String[] args) {
        System.out.println(greet("Ensa"));
    }
    public static String greet(String language) {
        String languageLowerCase = language.toLowerCase();
        Map<String, String> greeting = new HashMap<>();
        greeting.put("english", "Welcome");
        greeting.put("czech", "Vitejte");
        greeting.put("danish", "Velkomst");
        greeting.put("dutch", "Welkom");
        if (greeting.containsKey(languageLowerCase)) {
            return greeting.get(languageLowerCase);
        }
        return "It is not on the list.";
    }
}