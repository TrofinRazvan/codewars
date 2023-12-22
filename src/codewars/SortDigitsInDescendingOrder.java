package codewars;

import java.util.Arrays;

public class SortDigitsInDescendingOrder {

    public static void main(String[] args) {
        int originalNumber = 9125438;
        int hightestNumber = sortDigit(originalNumber);
        System.out.println(hightestNumber);
    }

    public static int sortDigit(int number) {
        String numberStr = Integer.toString(number);
        char[] charArray = numberStr.toCharArray();
        Arrays.sort(charArray);
        StringBuilder reversed = new StringBuilder(new String(charArray));
        String reversedStr = reversed.reverse().toString();
        return Integer.parseInt(reversedStr);
    }
}