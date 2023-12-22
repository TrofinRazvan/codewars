package codewars;

public class ArithmeticFunction {

    public static void main(String[] args) {
        System.out.println(removeEveryOther(4,2,"multiply"));
    }

    public static int removeEveryOther(int a, int b, String operator) {
        switch (operator) {
            case "multiply":
                return a * b;
            case "subtract":
                return a - b;
            case "add":
                return a + b;
            case "divide":
                return a / b;
        }
        return 0;
//        return s == "add" ? m + n : s == "multiply" ? m * n : s == "subtract" ? m - n : m / n;
    }
}