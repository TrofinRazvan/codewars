package codewars;

public class MathOperations {
    public static void main(String[] args) {

        System.out.println(basicMath("*",10,10));
    }
    public static Integer basicMath(String op, int v1, int v2){
        if("+" == op) return v1 + v2;
        if("-" == op) return v1 - v2;
        if("*" == op) return v1 * v2;
        if("/" == op) return v1 / v2;
        return 0;
    }
}
