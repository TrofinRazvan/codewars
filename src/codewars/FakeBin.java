package codewars;

public class FakeBin {

    public static void main(String[] args){
        System.out.println(fake("129"));
    }

    public static String fake(String numberString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberString.length(); i++) {
            char digits = numberString.charAt(i);
            if (digits < '5') {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
//        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}