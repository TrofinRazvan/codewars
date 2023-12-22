package codewars;

public class HelpAlex {

    public static void main(String[] args) {
        int hoopCount = 10;
//        if (hoopCount > 10) {
//            System.out.println("Great, now move on to tricks.");
//        } else {
//            System.out.println("Keep at it untill you get it.");
//        }
        int result = hoopCount <= 10 ? hoopCount -1 : hoopCount +1;
        System.out.println(result);
        String hoopResult = hoopCount < 10 ? "Great" : "Keep";
        System.out.println(hoopResult);
    }
}