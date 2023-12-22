package codewars;

public class Sums {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3};
        int result = returnSum(arr);
        System.out.println(result);
    }

    public static int returnSum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i * i;
        }
        return sum;
    }
}