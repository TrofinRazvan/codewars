package codewars;

public class Square {

    public static void main(String[] args) {
        int number = 25;
        if (isSquare(number)) {
            System.out.println("Form a square.");
        } else {
            System.out.println("Form a rectangle.");
        }
    }

    public static boolean isSquare(int n) {
        double sqrt = Math.sqrt(n);
        return sqrt - Math.floor(sqrt) == 0;
    }
}