package codewars;
//https://www.codewars.com/kata/56453a12fcee9a6c4700009c/train/java

public class CloseCompare {

    public static void main(String[] args) {
        System.out.println(closeCompare(3,5));
        System.out.println(closeCompare(3,5,3));
    }

    public static int closeCompare(double a, double b) {
        if (a == b) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int closeCompare(double a, double b, double margin) {
        double diff = Math.abs(a - b);
        if (diff <= margin) {
            return 0;
        } else if (a < b) {
            return -1;
        } else {
            return 1;
        }
    }
}