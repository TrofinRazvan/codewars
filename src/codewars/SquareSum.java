package codewars;
//https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
public class SquareSum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2};
        int result = squareSum(numbers);
        System.out.println(result);
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int number : n) {
            int squared = number * number;
            sum += squared;
        }
        return sum;
    }
}