package codewars;

public class StringRepeat {

    public static void main(String[] args) {
        System.out.println(repeatString(3, " Bounjour"));
    }

    public static String repeatString(int n, String s) {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < n; index++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
