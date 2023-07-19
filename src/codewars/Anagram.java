package codewars;
//www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "Foefet";
        String str2 = "toFFee";
        System.out.println(isAnagram(str1, str2));
    }
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

//        str1 = str1.replace("[^a-z]", "");
//        str2 = str2.replace("[^a-z]", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
