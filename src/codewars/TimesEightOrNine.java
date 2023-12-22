package codewars;

public class TimesEightOrNine {

    public static void main(String[] args) {
        System.out.println(simple(4));
    }

    public static int simple(int n) {
        if (n % 2 == 0) {
            return n * 8;
        } else {
            return n * 9;
        }
//        return n % 2 == 0 ? n * 8 : n * 9;
    }
}