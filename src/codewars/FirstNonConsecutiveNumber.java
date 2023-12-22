package codewars;

public class FirstNonConsecutiveNumber {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,7};
        System.out.println(first(numbers));
    }

    public static Integer first(int[] number) {
        for (int i = 1; i < number.length; i++) {
            if (number[i] - number[i - 1] != 1) {
                return number[i - 1] + 1;
            }
        }
        return null;
    }
}