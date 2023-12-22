package codewars;

public class StringEndWith {

    public static void main(String[] args) {
        System.out.println(solution("text","t"));
    }

    public static boolean solution(String str, String ending) {
//        return str.endsWith(ending);
        int strLength = str.length();
        int endingLength = ending.length();

        if (strLength < endingLength) {
            return false;
        }

        int startingIndex = strLength - endingLength;

        for (int i = 0; i < endingLength; i++) {
            char strChar = str.charAt(startingIndex);
            char endChar = ending.charAt(i);
            if (strChar != endChar) {
                return false;
            }
        }
        return true;
    }
}