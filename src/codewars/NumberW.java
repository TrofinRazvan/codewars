package codewars;

public class NumberW {

    public static void main(String[] args) {
       int result = countW("this is what it is.");
        System.out.println(result);
    }

    public static int countW(String input) {
        String[] words = input.split(" ");

        int sum = 0;

        for (String cuv : words) {
            int numB = cuv.length();
            sum += numB;
        }
        return sum;
    }
}