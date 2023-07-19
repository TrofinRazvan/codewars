package codewars;

//www.codewars.com/kata/570a6a46455d08ff8d001002/train/java
public class NoBoringZeros {

    public static void main(String[] args) {
        System.out.println(noZeros(300));
    }

    public static int noZeros(int n) {

        if (n != 0) {
            while (n % 10 == 0) {
                n = n / 10;
            }

        }
        return n;
    }
}
