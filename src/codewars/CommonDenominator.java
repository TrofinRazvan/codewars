package codewars;

public class CommonDenominator {

    public static void main(String[] args) {
        int n1 = 48;
        int n2 = 13;
        int result = calcCD(n1,n2);
        System.out.println("The biggest common denominator for " + n1 + " and " + n2 + " is " + result);
    }

    public static int calcCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}