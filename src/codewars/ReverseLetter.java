package codewars;

public class ReverseLetter {

    public static void main(String[] args) {
        System.out.println(reverseLetter("78hbjcasd"));
    }

    public static String reverseLetter(final String str) {
        String someS = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                someS = str.charAt(i) + someS;
            }
        }
        return someS;
//        return new StringBuilder(str.replaceAll("(?i)[^a-z]","")).reverse().toString();
    }
}