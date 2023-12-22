package codewars;

public class UpOrLow {

    public static void main(String[] args) {
        System.out.println(solve("RaZa"));
    }

    public static String solve(String text) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }

        if (lowerCaseCount < upperCaseCount || lowerCaseCount == upperCaseCount) {
            return text.toLowerCase();
        } else {
            return text.toUpperCase();
        }
    }

//    public static int numberString(String text) {
//        int bigLetter = 0;
//        for (int i = 0; i < text.length(); i++) {
//            char character = text.charAt(i);
//            if (Character.isUpperCase(character)) {
//                bigLetter++;
//            }
//        }
//        return bigLetter;
//    }
}