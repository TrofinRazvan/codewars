package codewars;

public class Greet {

    public static void main(String[] args) {

        System.out.println(greet("Trofin", "Razvan"));
        System.out.println(greet("Buteseaca", "Alexandru"));
        System.out.println(greet("Buteseaca", "Buteseaca"));
    }

    public static String greet(String name, String owner) {

        if (name.equals(owner)) {
            return "Hello, boss!";
        } else {
            return "Hello, guest!";
        }
    }
}
