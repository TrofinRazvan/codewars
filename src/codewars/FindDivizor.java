package codewars;

public class FindDivizor {

    public static void main(String[] args) {
        System.out.println(numberOfDivizors(30));
    }

    public static long numberOfDivizors(int n) {
        long counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter;
    }
}