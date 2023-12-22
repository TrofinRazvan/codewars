package codewars;

public class SwitchOneToNice {

    public static void main(String[] args) {
        System.out.println(name(2));
    }

    public static String name(int n) {
        String number;
        switch (n) {
            case 1:
                number = "one";
                break;
            case 2:
                number = "two";
                break;
            case 3:
                number = "three";
                break;
            case 4:
                number = "four";
                break;
            case 5:
                number = "five";
                break;
            case 6:
                number = "six";
                break;
            case 7:
                number = "seven";
                break;
            case 8:
                number = "eight";
                break;
            case 9:
                number = "nine";
                break;
            default:
                number = Integer.toString(n);
        }
        return number;
//        return new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}[number];
    }
}