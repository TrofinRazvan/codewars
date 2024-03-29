package codewars;

import java.util.function.IntPredicate;

public class EnumerableMagic {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 3, 33};
        boolean result = all(array, num -> num > 2);
        System.out.println(result);
    }

    public static boolean all(int[] list, IntPredicate predicate) {
        for (int i = 0; i < list.length; i++) {
            if (!predicate.test(list[i])) {
                return false;
            }
        }
        return true;
    }
}