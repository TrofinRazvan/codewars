package codewars;
//www.codewars.com/kata/5a00e05cc374cb34d100000d
public class ReverseSequence {
    public static void main(String[] args) {
        int n = 5;
        int[] reverse5 = reverse(n);
        for (int num : reverse5) {
            System.out.println(num);
        }
    }
    public static int[] reverse(int n) {
        int[] result = new int[n];
        for (int index = 0; index < n; index++) {
            result[index] = n - index;
        }
        return result;
    }
}