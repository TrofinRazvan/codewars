package codewars;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(updateLight("green"));
    }


    public static String updateLight(String current) {
        String color = current.toLowerCase();

        switch (color) {
            case "Green":
                return "Yellow";
            case "Yellow":
                return "Red";
            case "Red":
                return "Green";
        }
        return current;
    }
}