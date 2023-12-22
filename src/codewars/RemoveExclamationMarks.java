package codewars;

public class RemoveExclamationMarks {

    public static void main(String[] args) {
        System.out.println(remove("sTr hjbhTTTTjknjkttVHG!!!HVM,,M"));
    }

    public static String remove(String s) {
        return s.replace("!", "");
    }
}