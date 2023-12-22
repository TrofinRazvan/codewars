package codewars;

public class CenturyFromYear {

    public static void main(String[] args) {
        System.out.println(century(1245));
    }

    public static int century(int number) {
//        if (number == 0 || number < 100) {
//            return 1;
//        } else if (number == 101 || number < 200) {
//            return 2;
//        } else if (number == 201 || number < 300) {
//            return 3;
//        } else {
//            return 0;
//        }
        return (number + 99) / 100;
    }
}