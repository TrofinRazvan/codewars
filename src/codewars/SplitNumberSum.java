package codewars;

public class SplitNumberSum {

    public static void main(String[] args) {
        int number = 122;
        int result = sums(number);
        System.out.println(result);
    }

    public static int sums(int numbers) {
        int sum = 0;
        while (numbers != 0) {
            int number = numbers % 10;
            sum += number;
            numbers /= 10;
        }
        return sum;
    }
}