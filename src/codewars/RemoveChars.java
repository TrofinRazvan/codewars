package codewars;

public class RemoveChars {

    public static void main(String[] args) {
        String str = "str";
        System.out.println(str.replace("s", " "));
        System.out.println(str.replace("r"," "));
        remove("Last");
    }

    public static String remove(String str) {
        str = str.toUpperCase();
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);
        System.out.println(firstLetter + " " + lastLetter);
        return "code";
    }
}
