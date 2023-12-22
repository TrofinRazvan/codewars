package codewars;

public class ObjectCheck {

    public static void main(String[] args) {
        Object[] checkIt = {42, 3.14, "Hello"};
        System.out.println(check(checkIt,42));
    }

    public static boolean check(Object[] a, Object x) {
//        for (Object b : a){
//            if (b.equals(x)) {
//                return true;
//            }
//        }
//        return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                System.out.println("Found on index " + i + " with value " + a[i]);
                return true;
            }
        }
        return false;
    }
}