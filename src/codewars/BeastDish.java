package codewars;

public class BeastDish {

    public static void main(String[] args) {
        System.out.println(feast("bear","beer"));
    }

    public static boolean feast(String beast, String dish) {
        return beast.startsWith(String.valueOf(dish.charAt(0))) && beast.endsWith(String.valueOf(dish.charAt(dish.length()-1)));
//        return (first(beast) == first(dish) && last(beast) == last(dish));
    }

//    public static char first (String name) {
//        return name.charAt(0);
//    }
//
//    public static char last (String name) {
//        return name.charAt(name.length() -1);
//    }
}