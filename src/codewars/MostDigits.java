package codewars;

public class MostDigits {

    public static void main(String[] args) {
        int[] numbers = {12, 4000, -60000};
        System.out.println(findLongest(numbers));
    }

    public static int findLongest(int[] numbers) {
        int maxDigits = 0;
        int maxDigitsNumber = Integer.MIN_VALUE;

        for (int number : numbers) {
            int digits = countDigits(number);
            if (digits > maxDigits) {
                maxDigits = digits;
                maxDigitsNumber = number;
            }
        }
        return maxDigitsNumber;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
}