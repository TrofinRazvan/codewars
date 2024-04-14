package codewars;

public class CountingSheep {

    public static void main(String[] args) {
        Boolean[] check = {true,  true,  true,  true,
                true,  true,  true,  null ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        System.out.println(countSheeps(check));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean i : arrayOfSheeps) {
            if (i != null && i) {
                count++;
            }
        }
        System.out.println("There are " + count + " sheep in total.");
        return count;
    }
}