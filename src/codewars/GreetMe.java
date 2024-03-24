package codewars;
//www.codewars.com/kata/535474308bb336c9980006f2/train/java
public class GreetMe {

    public static void main(String[] args) {
        System.out.println(greet("razvan"));
    }

    public static String greet(String name) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        String capitalizedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String greeting = "Hello, " + capitalizedName + "!";
        return greeting;
    }
}