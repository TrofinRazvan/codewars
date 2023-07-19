package codewars;
//www.codewars.com/kata/56606694ec01347ce800001b/train/java
public class TriangleTester {

    public static void main(String[] args) {

        System.out.println(isTriangle(23, 26, 22));
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b > c && b + c > a || c + a > b) {
            return true;
        }
        return false;
    }
}
