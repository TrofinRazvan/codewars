package codewars;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 10};
        int smallestElement = array[0];

        for (int index = 0; index < array.length; index++) {
            if (array[index] < smallestElement) {
                smallestElement = array[index];
            }
        }
    }
}

