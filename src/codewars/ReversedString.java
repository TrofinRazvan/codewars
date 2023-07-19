package codewars;
//www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
public class ReversedString {

    public static void main(String[] args) {

        String str = "razvan";
        System.out.println(solution(str));

    }
    public static String solution(String string) {

        StringBuilder reversed = new StringBuilder(string);
        reversed.reverse();
        return reversed.toString();

    }
}