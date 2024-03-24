package codewars;
//www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

public class Isogram {

    public static void main(String[] args) {
        String givenString = "github";
        boolean result = isIsogram(givenString);
        if (result == true) {
            System.out.println(givenString + " is an Isogram");
        } else {
            System.out.println(givenString + " not an Isogram");
        }
    }

    public static boolean isIsogram(String string) {
        if (string == null)
            return false;
        string = string.toLowerCase();
        char[] charArray = string.toCharArray();
        for (char ch : charArray) {
            if (string.indexOf(ch) != string.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }
}