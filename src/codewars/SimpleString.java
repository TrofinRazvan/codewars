package codewars;

public class SimpleString {

    public static void main(String[] args) {
        String input = "dsadas";
        int[] counts = Solve(input);
        System.out.println("UpperCase: " + counts[0]);
        System.out.println("LowerCase: " + counts[1]);
        System.out.println("Numbers: " + counts[2]);
        System.out.println("Special Characters: " + counts[3]);
    }

    public static int[] Solve(String word) {
        int upperCase = 0;
        int lowerCase = 0;
        int numbers = 0;
        int specialCharacters = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCase++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCase++;
            } else if (ch >= '0' && ch <= '9') {
                numbers++;
            } else {
                specialCharacters++;
            }
        }
        int[] number = {upperCase, lowerCase, numbers, specialCharacters};
        return number;
    }
}