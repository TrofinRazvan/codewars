package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "How it's made";
        System.out.println(revWords(sentence));
    }

    public static String revWords(String string) {

        if (string == null || string.isEmpty()) {
            return string;
        }

        String[] words = string.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse());
            result.append(" ");
        }

        return result.toString().trim();
    }
}