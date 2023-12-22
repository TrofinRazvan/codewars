package codewars;

public class CountLetter {

    public static void main(String[] args) {
        System.out.println(countL("hello",'l'));
    }

    public static int countL(String input, char letter) {
        int count = 0;
        for (char i : input.toCharArray()) {
            if (i == letter) {
                count++;
            }
        }
        return count;
    }
}