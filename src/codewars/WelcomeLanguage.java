package codewars;

import java.util.HashMap;
import java.util.Map;

public class WelcomeLanguage {

    public static void main(String[] args) {
        System.out.println(greet("romana"));
    }
    public static String greet(String language) {
        Map<String, String> greeting = new HashMap<>();
        greeting.put("english", "Welcome");
        greeting.put("czech", "Vitejte");
        greeting.put("danish", "Velkomst");
        greeting.put("dutch", "Welkom");
        if (greeting.containsKey(language)) {
            return greeting.get(language);
        }
        return greeting.get("dutch");
    }
}