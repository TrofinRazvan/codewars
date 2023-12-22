package codewars;

public class SetAlarm {
    public static void main(String[] args) {
        System.out.println(setAlarm(true, false));
    }


    private static boolean setAlarm(boolean b, boolean b1) {
        if (b == true && b1 == false) {
            return true;
        } else {
            return false;
        }
    }
}
