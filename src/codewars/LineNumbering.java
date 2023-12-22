package codewars;

import java.util.Arrays;

public class LineNumbering {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int divider = 2;
        int[] result = divisibleBy(arr,divider);
        System.out.println(Arrays.toString(result));
    }

    public static int[] divisibleBy(int[] numbers, int divider){
        int count = 0;
        for (int i : numbers) {
            if (i % divider == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i : numbers) {
            if (i % divider == 0) {
                result[index++] = i;
            }
        }
        return result;
    }
}