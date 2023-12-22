package codewars;

public class SimpleMultiplication {
    public static void main(String[] args) {
        int num = 1, max = 20;
        while (num < max) {
            if (num % 4 == 0)
                System.out.println(num);
            num++;
        }
    }
}
