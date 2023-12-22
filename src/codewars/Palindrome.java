package codewars;

public class Palindrome {

    public static void main(String[] args) {
        checkForPalindrome("ana");
    }

    public static void checkForPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z]","").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversedInput)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("Is is not a palindrome.");
        }
    }
}