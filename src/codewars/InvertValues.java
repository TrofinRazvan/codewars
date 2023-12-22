package codewars;

public class InvertValues {

    public static void main(String[] args) {

        int[] array = {1, 2, -3, -4, 5};
        for (int index = 0; index < array.length; index++) {
            array[index] *= -1;
        }
        for (int element : array) {
            System.out.println(element);
        }
    }
}