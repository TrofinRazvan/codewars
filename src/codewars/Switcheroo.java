package codewars;

public class Switcheroo {

    public static void main(String[] args) {
        System.out.println(vowelTwoIndex("Who's next?"));
    }

    public static String vowelTwoIndex(String s) {
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (isVowel(currentChar)) {
                result.append(i + 1);
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char vowel) {
        return vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u';
    }
}