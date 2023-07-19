package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
public class TwoToOne {

    public static void main(String[] args) {

        String s1 = "aaafddsdsjkncjskd";
        String s2 = "fvvdklnkjn ve vfd";
        String result = longest(s1, s2);
        System.out.println(result);

    }

    public static String longest(String s1, String s2) {

        String combineted = s1 + s2;
        char[] chars = combineted.toCharArray();

        List<Character> uniqueChars = new ArrayList<>();
        for (char c : chars) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        chars = new char[uniqueChars.size()];
        for (int index = 0; index < uniqueChars.size(); index++) {
            chars[index] = uniqueChars.get(index);
        }
        Arrays.sort(chars);
        return new String(chars);
    }
}
