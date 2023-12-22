package codewars;

public class AscOrDesc {

    public static void main(String[] args) {
        System.out.println(capitalize("string"));
    }

    public static String capitalize(String s) {
        String upperCase = s.toUpperCase();
        String o = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                o += upperCase.charAt(i);
            } else {
                o += s.charAt(i);
            }
        }
        return o.toString();
    }
}