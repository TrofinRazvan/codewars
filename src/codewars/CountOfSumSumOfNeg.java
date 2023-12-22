package codewars;

public class CountOfSumSumOfNeg {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] result = countPositivesSumNegatives(array);

        int sum = result[0];
        int count = result[1];

        System.out.println(sum + " " + count);
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                sum += input[i];
            } else {
                count++;
            }
        }

        int[] result = {sum, count};
        return result;
    }
}