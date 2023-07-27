package codewars;
//www.codewars.com/kata/56efc695740d30f963000557/train/java
public class AlternativeCase {

    public static void main(String[] args) {
        String input = "hELLO rAZVAN!";
        String alternativeCase = alternativeCase(input);
        System.out.println(alternativeCase);
    }

    public static String alternativeCase(String input) {
        char[] charArray = input.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            char c = charArray[index];
            if (Character.isUpperCase(c)) {
                charArray[index] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[index] = Character.toUpperCase(c);

            }
        }
        return new String(charArray);
    }
}
