package codewars;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = {1,2,90,-12,2};
        bubbleSort(array);

        for (int num : array) {
            System.out.println(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}