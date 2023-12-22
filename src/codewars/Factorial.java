package codewars;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(number(4));
    }

    public static int number(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Choose another number.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}