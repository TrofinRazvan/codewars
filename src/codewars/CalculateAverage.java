package codewars;

public class CalculateAverage {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findaverage(arr));
    }

    public static double findaverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}